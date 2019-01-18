package es.jarroyo.tddweatherapp.domain.model.forecast

import com.google.gson.Gson

object ForecastFactory {

    val currentTemp = "30.0"

    val forecastResponse = "{\"cod\":\"200\",\"message\":0.0019,\"cnt\":40,\"list\":[{\"dt\":1547802000,\"main\":{\"temp\":0.58,\"temp_min\":-1.1,\"temp_max\":0.58,\"pressure\":915.13,\"sea_level\":1034.31,\"grnd_level\":915.13,\"humidity\":83,\"temp_kf\":1.67},\"weather\":[{\"id\":801,\"main\":\"Clouds\",\"description\":\"few clouds\",\"icon\":\"02d\"}],\"clouds\":{\"all\":24},\"wind\":{\"speed\":2.53,\"deg\":261.014},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-01-18 09:00:00\"},{\"dt\":1547812800,\"main\":{\"temp\":4.5,\"temp_min\":3.24,\"temp_max\":4.5,\"pressure\":914.54,\"sea_level\":1032.61,\"grnd_level\":914.54,\"humidity\":74,\"temp_kf\":1.26},\"weather\":[{\"id\":802,\"main\":\"Clouds\",\"description\":\"scattered clouds\",\"icon\":\"03d\"}],\"clouds\":{\"all\":48},\"wind\":{\"speed\":2.97,\"deg\":273.504},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-01-18 12:00:00\"},{\"dt\":1547823600,\"main\":{\"temp\":4.72,\"temp_min\":3.88,\"temp_max\":4.72,\"pressure\":913.02,\"sea_level\":1030.54,\"grnd_level\":913.02,\"humidity\":63,\"temp_kf\":0.84},\"weather\":[{\"id\":803,\"main\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04d\"}],\"clouds\":{\"all\":56},\"wind\":{\"speed\":3.17,\"deg\":290.002},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-01-18 15:00:00\"},{\"dt\":1547834400,\"main\":{\"temp\":1.76,\"temp_min\":1.34,\"temp_max\":1.76,\"pressure\":912.75,\"sea_level\":1030.6,\"grnd_level\":912.75,\"humidity\":69,\"temp_kf\":0.42},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10n\"}],\"clouds\":{\"all\":88},\"wind\":{\"speed\":2.66,\"deg\":283.502},\"rain\":{\"3h\":0.005},\"snow\":{\"3h\":0.008},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-18 18:00:00\"},{\"dt\":1547845200,\"main\":{\"temp\":0.15,\"temp_min\":0.15,\"temp_max\":0.15,\"pressure\":912.88,\"sea_level\":1030.92,\"grnd_level\":912.88,\"humidity\":76,\"temp_kf\":0},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10n\"}],\"clouds\":{\"all\":92},\"wind\":{\"speed\":2.96,\"deg\":267.003},\"rain\":{\"3h\":0.0025},\"snow\":{\"3h\":0.005},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-18 21:00:00\"},{\"dt\":1547856000,\"main\":{\"temp\":-0.87,\"temp_min\":-0.87,\"temp_max\":-0.87,\"pressure\":912.74,\"sea_level\":1031.17,\"grnd_level\":912.74,\"humidity\":81,\"temp_kf\":0},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10n\"}],\"clouds\":{\"all\":20},\"wind\":{\"speed\":3.37,\"deg\":262.5},\"rain\":{\"3h\":0.0025},\"snow\":{\"3h\":0.00075},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-19 00:00:00\"},{\"dt\":1547866800,\"main\":{\"temp\":-1.36,\"temp_min\":-1.36,\"temp_max\":-1.36,\"pressure\":911.86,\"sea_level\":1030.5,\"grnd_level\":911.86,\"humidity\":87,\"temp_kf\":0},\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"clear sky\",\"icon\":\"01n\"}],\"clouds\":{\"all\":0},\"wind\":{\"speed\":3.41,\"deg\":274.504},\"rain\":{},\"snow\":{},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-19 03:00:00\"},{\"dt\":1547877600,\"main\":{\"temp\":-3.14,\"temp_min\":-3.14,\"temp_max\":-3.14,\"pressure\":911.76,\"sea_level\":1030.45,\"grnd_level\":911.76,\"humidity\":84,\"temp_kf\":0},\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"clear sky\",\"icon\":\"01n\"}],\"clouds\":{\"all\":0},\"wind\":{\"speed\":2.66,\"deg\":265.501},\"rain\":{},\"snow\":{},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-19 06:00:00\"},{\"dt\":1547888400,\"main\":{\"temp\":0,\"temp_min\":0,\"temp_max\":0,\"pressure\":912.18,\"sea_level\":1030.75,\"grnd_level\":912.18,\"humidity\":84,\"temp_kf\":0},\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"clear sky\",\"icon\":\"01d\"}],\"clouds\":{\"all\":0},\"wind\":{\"speed\":3.16,\"deg\":271.503},\"rain\":{},\"snow\":{},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-01-19 09:00:00\"},{\"dt\":1547899200,\"main\":{\"temp\":5.75,\"temp_min\":5.75,\"temp_max\":5.75,\"pressure\":911.72,\"sea_level\":1029.08,\"grnd_level\":911.72,\"humidity\":70,\"temp_kf\":0},\"weather\":[{\"id\":802,\"main\":\"Clouds\",\"description\":\"scattered clouds\",\"icon\":\"03d\"}],\"clouds\":{\"all\":36},\"wind\":{\"speed\":3.8,\"deg\":281.501},\"rain\":{},\"snow\":{},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-01-19 12:00:00\"},{\"dt\":1547910000,\"main\":{\"temp\":5.77,\"temp_min\":5.77,\"temp_max\":5.77,\"pressure\":910.26,\"sea_level\":1026.97,\"grnd_level\":910.26,\"humidity\":65,\"temp_kf\":0},\"weather\":[{\"id\":803,\"main\":\"Clouds\",\"description\":\"broken clouds\",\"icon\":\"04d\"}],\"clouds\":{\"all\":64},\"wind\":{\"speed\":2.66,\"deg\":285},\"rain\":{},\"snow\":{},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-01-19 15:00:00\"},{\"dt\":1547920800,\"main\":{\"temp\":0.84,\"temp_min\":0.84,\"temp_max\":0.84,\"pressure\":909.47,\"sea_level\":1026.35,\"grnd_level\":909.47,\"humidity\":74,\"temp_kf\":0},\"weather\":[{\"id\":802,\"main\":\"Clouds\",\"description\":\"scattered clouds\",\"icon\":\"03n\"}],\"clouds\":{\"all\":32},\"wind\":{\"speed\":1.21,\"deg\":205},\"rain\":{},\"snow\":{},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-19 18:00:00\"},{\"dt\":1547931600,\"main\":{\"temp\":-1.81,\"temp_min\":-1.81,\"temp_max\":-1.81,\"pressure\":909.03,\"sea_level\":1026.08,\"grnd_level\":909.03,\"humidity\":84,\"temp_kf\":0},\"weather\":[{\"id\":802,\"main\":\"Clouds\",\"description\":\"scattered clouds\",\"icon\":\"03n\"}],\"clouds\":{\"all\":44},\"wind\":{\"speed\":1.61,\"deg\":204.504},\"rain\":{},\"snow\":{},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-19 21:00:00\"},{\"dt\":1547942400,\"main\":{\"temp\":-1.46,\"temp_min\":-1.46,\"temp_max\":-1.46,\"pressure\":907.71,\"sea_level\":1024.91,\"grnd_level\":907.71,\"humidity\":87,\"temp_kf\":0},\"weather\":[{\"id\":600,\"main\":\"Snow\",\"description\":\"light snow\",\"icon\":\"13n\"}],\"clouds\":{\"all\":92},\"wind\":{\"speed\":1.22,\"deg\":186.001},\"rain\":{},\"snow\":{\"3h\":0.06875},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-20 00:00:00\"},{\"dt\":1547953200,\"main\":{\"temp\":-0.13,\"temp_min\":-0.13,\"temp_max\":-0.13,\"pressure\":906.29,\"sea_level\":1023.72,\"grnd_level\":906.29,\"humidity\":91,\"temp_kf\":0},\"weather\":[{\"id\":600,\"main\":\"Snow\",\"description\":\"light snow\",\"icon\":\"13n\"}],\"clouds\":{\"all\":92},\"wind\":{\"speed\":1.21,\"deg\":180},\"rain\":{},\"snow\":{\"3h\":0.9575},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-20 03:00:00\"},{\"dt\":1547964000,\"main\":{\"temp\":0.32,\"temp_min\":0.32,\"temp_max\":0.32,\"pressure\":905.67,\"sea_level\":1023.06,\"grnd_level\":905.67,\"humidity\":93,\"temp_kf\":0},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10n\"}],\"clouds\":{\"all\":92},\"wind\":{\"speed\":1.18,\"deg\":234.003},\"rain\":{\"3h\":0.05},\"snow\":{\"3h\":0.105},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-20 06:00:00\"},{\"dt\":1547974800,\"main\":{\"temp\":1.39,\"temp_min\":1.39,\"temp_max\":1.39,\"pressure\":907.19,\"sea_level\":1024.78,\"grnd_level\":907.19,\"humidity\":99,\"temp_kf\":0},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10d\"}],\"clouds\":{\"all\":92},\"wind\":{\"speed\":1.66,\"deg\":310},\"rain\":{\"3h\":0.42},\"snow\":{\"3h\":0.495},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-01-20 09:00:00\"},{\"dt\":1547985600,\"main\":{\"temp\":2.08,\"temp_min\":2.08,\"temp_max\":2.08,\"pressure\":908.21,\"sea_level\":1025.35,\"grnd_level\":908.21,\"humidity\":94,\"temp_kf\":0},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10d\"}],\"clouds\":{\"all\":88},\"wind\":{\"speed\":4.77,\"deg\":323.002},\"rain\":{\"3h\":0.02},\"snow\":{\"3h\":0.2375},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-01-20 12:00:00\"},{\"dt\":1547996400,\"main\":{\"temp\":3.29,\"temp_min\":3.29,\"temp_max\":3.29,\"pressure\":908.36,\"sea_level\":1024.96,\"grnd_level\":908.36,\"humidity\":92,\"temp_kf\":0},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10d\"}],\"clouds\":{\"all\":88},\"wind\":{\"speed\":5.93,\"deg\":331.503},\"rain\":{\"3h\":0.1},\"snow\":{\"3h\":0.0225},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-01-20 15:00:00\"},{\"dt\":1548007200,\"main\":{\"temp\":2.76,\"temp_min\":2.76,\"temp_max\":2.76,\"pressure\":910.08,\"sea_level\":1027.04,\"grnd_level\":910.08,\"humidity\":95,\"temp_kf\":0},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10n\"}],\"clouds\":{\"all\":92},\"wind\":{\"speed\":6.17,\"deg\":333},\"rain\":{\"3h\":0.19},\"snow\":{\"3h\":0.0425},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-20 18:00:00\"},{\"dt\":1548018000,\"main\":{\"temp\":2.02,\"temp_min\":2.02,\"temp_max\":2.02,\"pressure\":911.55,\"sea_level\":1029.11,\"grnd_level\":911.55,\"humidity\":95,\"temp_kf\":0},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10n\"}],\"clouds\":{\"all\":64},\"wind\":{\"speed\":5.67,\"deg\":329.507},\"rain\":{\"3h\":0.15},\"snow\":{\"3h\":0.1175},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-20 21:00:00\"},{\"dt\":1548028800,\"main\":{\"temp\":1.28,\"temp_min\":1.28,\"temp_max\":1.28,\"pressure\":912.47,\"sea_level\":1030.41,\"grnd_level\":912.47,\"humidity\":96,\"temp_kf\":0},\"weather\":[{\"id\":600,\"main\":\"Snow\",\"description\":\"light snow\",\"icon\":\"13n\"}],\"clouds\":{\"all\":64},\"wind\":{\"speed\":5.22,\"deg\":326.003},\"rain\":{},\"snow\":{\"3h\":0.085},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-21 00:00:00\"},{\"dt\":1548039600,\"main\":{\"temp\":1.12,\"temp_min\":1.12,\"temp_max\":1.12,\"pressure\":912.52,\"sea_level\":1030.76,\"grnd_level\":912.52,\"humidity\":95,\"temp_kf\":0},\"weather\":[{\"id\":600,\"main\":\"Snow\",\"description\":\"light snow\",\"icon\":\"13n\"}],\"clouds\":{\"all\":48},\"wind\":{\"speed\":5.16,\"deg\":323.501},\"rain\":{},\"snow\":{\"3h\":0.0675},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-21 03:00:00\"},{\"dt\":1548050400,\"main\":{\"temp\":1.52,\"temp_min\":1.52,\"temp_max\":1.52,\"pressure\":912.99,\"sea_level\":1031.32,\"grnd_level\":912.99,\"humidity\":94,\"temp_kf\":0},\"weather\":[{\"id\":600,\"main\":\"Snow\",\"description\":\"light snow\",\"icon\":\"13n\"}],\"clouds\":{\"all\":68},\"wind\":{\"speed\":5.67,\"deg\":324.504},\"rain\":{},\"snow\":{\"3h\":0.0775},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-21 06:00:00\"},{\"dt\":1548061200,\"main\":{\"temp\":1.52,\"temp_min\":1.52,\"temp_max\":1.52,\"pressure\":914.3,\"sea_level\":1032.66,\"grnd_level\":914.3,\"humidity\":92,\"temp_kf\":0},\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"clear sky\",\"icon\":\"01d\"}],\"clouds\":{\"all\":36},\"wind\":{\"speed\":5.56,\"deg\":322.002},\"rain\":{},\"snow\":{\"3h\":0.0099999999999998},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-01-21 09:00:00\"},{\"dt\":1548072000,\"main\":{\"temp\":3.16,\"temp_min\":3.16,\"temp_max\":3.16,\"pressure\":914.99,\"sea_level\":1032.67,\"grnd_level\":914.99,\"humidity\":84,\"temp_kf\":0},\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"clear sky\",\"icon\":\"01d\"}],\"clouds\":{\"all\":48},\"wind\":{\"speed\":6.56,\"deg\":329.002},\"rain\":{},\"snow\":{\"3h\":0.0050000000000003},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-01-21 12:00:00\"},{\"dt\":1548082800,\"main\":{\"temp\":2.18,\"temp_min\":2.18,\"temp_max\":2.18,\"pressure\":914.7,\"sea_level\":1032.32,\"grnd_level\":914.7,\"humidity\":86,\"temp_kf\":0},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10d\"}],\"clouds\":{\"all\":92},\"wind\":{\"speed\":6.71,\"deg\":329.001},\"rain\":{\"3h\":0.01},\"snow\":{\"3h\":0.0875},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-01-21 15:00:00\"},{\"dt\":1548093600,\"main\":{\"temp\":0.8,\"temp_min\":0.8,\"temp_max\":0.8,\"pressure\":915.97,\"sea_level\":1034.42,\"grnd_level\":915.97,\"humidity\":86,\"temp_kf\":0},\"weather\":[{\"id\":600,\"main\":\"Snow\",\"description\":\"light snow\",\"icon\":\"13n\"}],\"clouds\":{\"all\":68},\"wind\":{\"speed\":6.91,\"deg\":330.502},\"rain\":{},\"snow\":{\"3h\":0.2275},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-21 18:00:00\"},{\"dt\":1548104400,\"main\":{\"temp\":-1.02,\"temp_min\":-1.02,\"temp_max\":-1.02,\"pressure\":917.36,\"sea_level\":1036.65,\"grnd_level\":917.36,\"humidity\":88,\"temp_kf\":0},\"weather\":[{\"id\":600,\"main\":\"Snow\",\"description\":\"light snow\",\"icon\":\"13n\"}],\"clouds\":{\"all\":44},\"wind\":{\"speed\":6.56,\"deg\":324.001},\"rain\":{},\"snow\":{\"3h\":0.0575},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-21 21:00:00\"},{\"dt\":1548115200,\"main\":{\"temp\":-1.72,\"temp_min\":-1.72,\"temp_max\":-1.72,\"pressure\":917.46,\"sea_level\":1037.13,\"grnd_level\":917.46,\"humidity\":87,\"temp_kf\":0},\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"clear sky\",\"icon\":\"01n\"}],\"clouds\":{\"all\":44},\"wind\":{\"speed\":6.08,\"deg\":322.5},\"rain\":{},\"snow\":{\"3h\":0.0275},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-22 00:00:00\"},{\"dt\":1548126000,\"main\":{\"temp\":-1.52,\"temp_min\":-1.52,\"temp_max\":-1.52,\"pressure\":916.54,\"sea_level\":1036.4,\"grnd_level\":916.54,\"humidity\":88,\"temp_kf\":0},\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"clear sky\",\"icon\":\"01n\"}],\"clouds\":{\"all\":44},\"wind\":{\"speed\":5.91,\"deg\":321.5},\"rain\":{},\"snow\":{\"3h\":0.0175},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-22 03:00:00\"},{\"dt\":1548136800,\"main\":{\"temp\":-1.19,\"temp_min\":-1.19,\"temp_max\":-1.19,\"pressure\":915.97,\"sea_level\":1035.62,\"grnd_level\":915.97,\"humidity\":89,\"temp_kf\":0},\"weather\":[{\"id\":600,\"main\":\"Snow\",\"description\":\"light snow\",\"icon\":\"13n\"}],\"clouds\":{\"all\":76},\"wind\":{\"speed\":5.45,\"deg\":315.5},\"rain\":{},\"snow\":{\"3h\":0.0625},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-22 06:00:00\"},{\"dt\":1548147600,\"main\":{\"temp\":-0.37,\"temp_min\":-0.37,\"temp_max\":-0.37,\"pressure\":915.74,\"sea_level\":1035.23,\"grnd_level\":915.74,\"humidity\":84,\"temp_kf\":0},\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"clear sky\",\"icon\":\"01d\"}],\"clouds\":{\"all\":48},\"wind\":{\"speed\":5.65,\"deg\":315.501},\"rain\":{},\"snow\":{\"3h\":0.02},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-01-22 09:00:00\"},{\"dt\":1548158400,\"main\":{\"temp\":2.83,\"temp_min\":2.83,\"temp_max\":2.83,\"pressure\":914.31,\"sea_level\":1032.38,\"grnd_level\":914.31,\"humidity\":78,\"temp_kf\":0},\"weather\":[{\"id\":801,\"main\":\"Clouds\",\"description\":\"few clouds\",\"icon\":\"02d\"}],\"clouds\":{\"all\":12},\"wind\":{\"speed\":5.67,\"deg\":311.004},\"rain\":{},\"snow\":{},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-01-22 12:00:00\"},{\"dt\":1548169200,\"main\":{\"temp\":3.07,\"temp_min\":3.07,\"temp_max\":3.07,\"pressure\":911.53,\"sea_level\":1028.69,\"grnd_level\":911.53,\"humidity\":73,\"temp_kf\":0},\"weather\":[{\"id\":802,\"main\":\"Clouds\",\"description\":\"scattered clouds\",\"icon\":\"03d\"}],\"clouds\":{\"all\":36},\"wind\":{\"speed\":5.47,\"deg\":288.003},\"rain\":{},\"snow\":{},\"sys\":{\"pod\":\"d\"},\"dt_txt\":\"2019-01-22 15:00:00\"},{\"dt\":1548180000,\"main\":{\"temp\":1.77,\"temp_min\":1.77,\"temp_max\":1.77,\"pressure\":908.82,\"sea_level\":1025.97,\"grnd_level\":908.82,\"humidity\":79,\"temp_kf\":0},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10n\"}],\"clouds\":{\"all\":80},\"wind\":{\"speed\":6.61,\"deg\":275.003},\"rain\":{\"3h\":0.06},\"snow\":{\"3h\":0.12},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-22 18:00:00\"},{\"dt\":1548190800,\"main\":{\"temp\":2.05,\"temp_min\":2.05,\"temp_max\":2.05,\"pressure\":906.95,\"sea_level\":1023.91,\"grnd_level\":906.95,\"humidity\":86,\"temp_kf\":0},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10n\"}],\"clouds\":{\"all\":88},\"wind\":{\"speed\":7.92,\"deg\":280.503},\"rain\":{\"3h\":0.34},\"snow\":{\"3h\":0.225},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-22 21:00:00\"},{\"dt\":1548201600,\"main\":{\"temp\":2.72,\"temp_min\":2.72,\"temp_max\":2.72,\"pressure\":904.94,\"sea_level\":1021.3,\"grnd_level\":904.94,\"humidity\":87,\"temp_kf\":0},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10n\"}],\"clouds\":{\"all\":92},\"wind\":{\"speed\":8.08,\"deg\":290.004},\"rain\":{\"3h\":0.45},\"snow\":{\"3h\":0.0925},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-23 00:00:00\"},{\"dt\":1548212400,\"main\":{\"temp\":2.55,\"temp_min\":2.55,\"temp_max\":2.55,\"pressure\":903.56,\"sea_level\":1019.54,\"grnd_level\":903.56,\"humidity\":94,\"temp_kf\":0},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10n\"}],\"clouds\":{\"all\":92},\"wind\":{\"speed\":7.56,\"deg\":299.501},\"rain\":{\"3h\":1.01},\"snow\":{\"3h\":0.165},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-23 03:00:00\"},{\"dt\":1548223200,\"main\":{\"temp\":2.51,\"temp_min\":2.51,\"temp_max\":2.51,\"pressure\":902.8,\"sea_level\":1018.59,\"grnd_level\":902.8,\"humidity\":92,\"temp_kf\":0},\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10n\"}],\"clouds\":{\"all\":92},\"wind\":{\"speed\":7.47,\"deg\":306.001},\"rain\":{\"3h\":0.82},\"snow\":{\"3h\":0.17},\"sys\":{\"pod\":\"n\"},\"dt_txt\":\"2019-01-23 06:00:00\"}],\"city\":{\"id\":6361450,\"name\":\"Andorra\",\"coord\":{\"lat\":40.976,\"lon\":-0.444},\"country\":\"ES\",\"population\":8403}}"

    fun createForecastTest(): Forecast {
        var gson = Gson()
        return gson?.fromJson(forecastResponse, Forecast::class.java)
    }

}