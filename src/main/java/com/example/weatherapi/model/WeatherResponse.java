package com.example.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    private double latitude;
    private double longitude;
    private double generationtimeMs;
    private int utcOffsetSeconds;
    private String timezone;
    private String timezoneAbbreviation;
    private double elevation;
    private CurrentWeather current;
    private CurrentUnits currentUnits;

    @JsonProperty("latitude")
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("generationtime_ms")
    public double getGenerationtimeMs() {
        return generationtimeMs;
    }

    public void setGenerationtimeMs(double generationtimeMs) {
        this.generationtimeMs = generationtimeMs;
    }

    @JsonProperty("utc_offset_seconds")
    public int getUtcOffsetSeconds() {
        return utcOffsetSeconds;
    }

    public void setUtcOffsetSeconds(int utcOffsetSeconds) {
        this.utcOffsetSeconds = utcOffsetSeconds;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("timezone_abbreviation")
    public String getTimezoneAbbreviation() {
        return timezoneAbbreviation;
    }

    public void setTimezoneAbbreviation(String timezoneAbbreviation) {
        this.timezoneAbbreviation = timezoneAbbreviation;
    }

    @JsonProperty("elevation")
    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    @JsonProperty("current")
    public CurrentWeather getCurrent() {
        return current;
    }

    public void setCurrent(CurrentWeather current) {
        this.current = current;
    }

    @JsonProperty("current_units")
    public CurrentUnits getCurrentUnits() {
        return currentUnits;
    }

    public void setCurrentUnits(CurrentUnits currentUnits) {
        this.currentUnits = currentUnits;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CurrentWeather {
        private String time;
        private int interval;
        @JsonProperty("temperature_2m")
        private double temperature2m;
        @JsonProperty("relative_humidity_2m")
        private int relativeHumidity2m;
        @JsonProperty("apparent_temperature")
        private double apparentTemperature;
        @JsonProperty("weather_code")
        private int weatherCode;
        @JsonProperty("wind_speed_10m")
        private double windSpeed10m;
        @JsonProperty("wind_direction_10m")
        private int windDirection10m;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public int getInterval() {
            return interval;
        }

        public void setInterval(int interval) {
            this.interval = interval;
        }

        public double getTemperature2m() {
            return temperature2m;
        }

        public void setTemperature2m(double temperature2m) {
            this.temperature2m = temperature2m;
        }

        public int getRelativeHumidity2m() {
            return relativeHumidity2m;
        }

        public void setRelativeHumidity2m(int relativeHumidity2m) {
            this.relativeHumidity2m = relativeHumidity2m;
        }

        public double getApparentTemperature() {
            return apparentTemperature;
        }

        public void setApparentTemperature(double apparentTemperature) {
            this.apparentTemperature = apparentTemperature;
        }

        public int getWeatherCode() {
            return weatherCode;
        }

        public void setWeatherCode(int weatherCode) {
            this.weatherCode = weatherCode;
        }

        public double getWindSpeed10m() {
            return windSpeed10m;
        }

        public void setWindSpeed10m(double windSpeed10m) {
            this.windSpeed10m = windSpeed10m;
        }

        public int getWindDirection10m() {
            return windDirection10m;
        }

        public void setWindDirection10m(int windDirection10m) {
            this.windDirection10m = windDirection10m;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CurrentUnits {
        private String time;
        private String interval;
        @JsonProperty("temperature_2m")
        private String temperature2m;
        @JsonProperty("relative_humidity_2m")
        private String relativeHumidity2m;
        @JsonProperty("apparent_temperature")
        private String apparentTemperature;
        @JsonProperty("weather_code")
        private String weatherCode;
        @JsonProperty("wind_speed_10m")
        private String windSpeed10m;
        @JsonProperty("wind_direction_10m")
        private String windDirection10m;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getInterval() {
            return interval;
        }

        public void setInterval(String interval) {
            this.interval = interval;
        }

        public String getTemperature2m() {
            return temperature2m;
        }

        public void setTemperature2m(String temperature2m) {
            this.temperature2m = temperature2m;
        }

        public String getRelativeHumidity2m() {
            return relativeHumidity2m;
        }

        public void setRelativeHumidity2m(String relativeHumidity2m) {
            this.relativeHumidity2m = relativeHumidity2m;
        }

        public String getApparentTemperature() {
            return apparentTemperature;
        }

        public void setApparentTemperature(String apparentTemperature) {
            this.apparentTemperature = apparentTemperature;
        }

        public String getWeatherCode() {
            return weatherCode;
        }

        public void setWeatherCode(String weatherCode) {
            this.weatherCode = weatherCode;
        }

        public String getWindSpeed10m() {
            return windSpeed10m;
        }

        public void setWindSpeed10m(String windSpeed10m) {
            this.windSpeed10m = windSpeed10m;
        }

        public String getWindDirection10m() {
            return windDirection10m;
        }

        public void setWindDirection10m(String windDirection10m) {
            this.windDirection10m = windDirection10m;
        }
    }
}
