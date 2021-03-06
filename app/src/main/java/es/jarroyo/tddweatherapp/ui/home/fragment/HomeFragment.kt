package es.jarroyo.tddweatherapp.ui.home.fragment

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.OnClick
import es.jarroyo.tddweatherapp.R
import es.jarroyo.tddweatherapp.app.di.component.ApplicationComponent
import es.jarroyo.tddweatherapp.app.di.subcomponent.home.fragment.HomeFragmentModule
import es.jarroyo.tddweatherapp.app.navigator.Navigator
import es.jarroyo.tddweatherapp.domain.model.Response
import es.jarroyo.tddweatherapp.domain.model.currentWeather.CurrentWeather
import es.jarroyo.tddweatherapp.domain.model.location.WeatherLocation
import es.jarroyo.tddweatherapp.ui.base.BaseFragment
import es.jarroyo.tddweatherapp.ui.home.fragment.adapter.HomeListRVAdapter
import es.jarroyo.tddweatherapp.ui.viewmodel.LocationViewModel
import es.jarroyo.tddweatherapp.ui.viewmodel.WeatherViewModel
import es.jarroyo.tddweatherapp.ui.viewmodel.model.location.ErrorLocationListState
import es.jarroyo.tddweatherapp.ui.viewmodel.model.location.LoadingLocationListState
import es.jarroyo.tddweatherapp.ui.viewmodel.model.location.LocationListState
import es.jarroyo.tddweatherapp.ui.viewmodel.model.location.SuccessLocationListState
import es.jarroyo.tddweatherapp.ui.viewmodel.model.weather.CurrentWeatherState
import es.jarroyo.tddweatherapp.ui.viewmodel.model.weather.DefaultCurrentWeatherState
import es.jarroyo.tddweatherapp.ui.viewmodel.model.weather.ErrorCurrentWeatherState
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

class HomeFragment : BaseFragment() {
    override var layoutId = R.layout.fragment_home

    private var listener: OnFragmentInteractionListener? = null

    // View model
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var weatherViewModel: WeatherViewModel
    private lateinit var locationViewModel: LocationViewModel

    private var isLoading = false

    // RV Adapter
    private var mLayoutManager: LinearLayoutManager? = null
    private var mRvAdapter: HomeListRVAdapter? = null

    @Inject
    lateinit var navigator: Navigator

    override fun setupInjection(applicationComponent: ApplicationComponent) {
        applicationComponent.plus(HomeFragmentModule(this)).injectTo(this)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflateView(inflater, container)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        configRecyclerView()

        //Observer
        weatherViewModel = ViewModelProviders.of(this, viewModelFactory).get(WeatherViewModel::class.java)
        locationViewModel = ViewModelProviders.of(this, viewModelFactory).get(LocationViewModel::class.java)

        observeLocationListViewModel()
        observeWeatherListViewModel()

        getLocationList()
    }

    interface OnFragmentInteractionListener {
        fun onFragmentInteraction(uri: Uri)
    }

    /**
     * CONFIG RV VIEW
     */
    fun configRecyclerView() {
        mLayoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL, false
        )
        fragment_home_rv.layoutManager = mLayoutManager

        mRvAdapter = HomeListRVAdapter(
            listenerAddLocationClicked = {

            },
            listenerWeatherClicked = {
                navigator.toForecastActivity(it.weather.name)
            }
        )

        fragment_home_rv.adapter = mRvAdapter
        fragment_home_swipe_refresh_rv.setOnRefreshListener {
            getLocationList()
        }
    }

    /****************************************************************************
     * ONCLICK
     ***************************************************************************/
    @OnClick(R.id.fragment_home_button_retry)
    fun onClickRetry() {
        getLocationList()
    }

    /****************************************************************************
     * OBSERVER
     ***************************************************************************/
    /** LOCATION LIST OBSERVER **/
    private fun observeLocationListViewModel() {
        locationViewModel.locationListLiveData.observe(this, locationListStateObserver)
    }

    private fun getLocationList() {
        locationViewModel.getWeatherLocationList()
    }

    private val locationListStateObserver = Observer<LocationListState> { state ->
        state?.let {
            when (state) {
                is SuccessLocationListState -> {
                    isLoading = false
                    hideLoading()
                    hideError()
                    val success = it.response as Response.Success
                    getWeatherForLocationList(success.data)
                }
                is LoadingLocationListState -> {
                    isLoading = true
                    showLoading()
                    hideError()
                }
                is ErrorLocationListState -> {
                    isLoading = false
                    hideLoading()
                    //showError((it as ErrorCurrentWeatherState))
                }
            }
        }
    }


    private fun observeWeatherListViewModel() {
        weatherViewModel.weatherListStateLiveData.observe(this, weatherListStateObserver)
    }

    private val weatherListStateObserver = Observer<List<CurrentWeatherState>> { weatherStateList ->
        weatherStateList?.let {
            val weatherList = mutableListOf<CurrentWeather>()
            for (weatherState in weatherStateList) {
                when (weatherState) {
                    is DefaultCurrentWeatherState -> {
                        val success = weatherState.response as Response.Success
                        weatherList.add(success.data)
                    }
                }
            }

            showInRVWeatherList(weatherList)
        }
    }


    /**
     * GET WEATHER LOCATION LIST
     */
    private fun getWeatherForLocationList(weatherLocationList: List<WeatherLocation>?){
        if (weatherLocationList != null && weatherLocationList.size > 0) {
            weatherViewModel.getWeatherList(weatherLocationList)
        } else {
            showEmptyLocationList()
        }
    }


    /**
     * SHOW CURRENT WEATHER
     */
    private fun showInRVWeatherList(weatherList: List<CurrentWeather>?){
        mRvAdapter?.setWeatherList(weatherList)
        mRvAdapter?.notifyDataSetChanged()
    }

    /**
     * SHOW EMPTY LOCATIONS
     */
    private fun showEmptyLocationList() {
        fragment_home_layout_error.visibility = View.VISIBLE
        fragment_home_tv_status.text = getString(R.string.empty_location)
    }

    /**
     * SHOW LOADING
     */
    private fun showLoading(){
        fragment_home_loading.visibility = View.VISIBLE
        fragment_home_swipe_refresh_rv.isRefreshing = true
    }

    /**
     * HIDE LOADING
     */
    private fun hideLoading(){
        fragment_home_loading.visibility = View.GONE
        fragment_home_swipe_refresh_rv.isRefreshing = false
    }

    /**
     * SHOW ERROR
     */
    private fun showError(errorForecastState: ErrorCurrentWeatherState){
        fragment_home_layout_error.visibility = View.VISIBLE
        val error = errorForecastState.response as Response.Error
        fragment_home_tv_status.text = error.exception.message
    }

    /**
     * HIDE ERROR
     */
    private fun hideError(){
        fragment_home_layout_error.visibility = View.GONE
    }

}
