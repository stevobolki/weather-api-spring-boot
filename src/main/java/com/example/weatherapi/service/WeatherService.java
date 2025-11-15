package com.example.weatherapi.service;

import com.example.weatherapi.model.GeocodingResponse;
import com.example.weatherapi.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class WeatherService {

    private final RestTemplate restTemplate;
    
    @Value("${weather.api.url:https://api.open-meteo.com/v1/forecast}")
    private String weatherApiUrl;
    
    @Value("${geocoding.api.url:https://geocoding-api.open-meteo.com/v1/search}")
    private String geocodingApiUrl;

    public WeatherService() {
        this.restTemplate = new RestTemplate();
    }

    public WeatherResponse getWeatherByCity(String city) {
        // First, get coordinates from city name using geocoding
        GeocodingResponse.GeocodingResult[] results = getCoordinatesFromCity(city);
        
        if (results == null || results.length == 0) {
            throw new RuntimeException("City not found: " + city);
        }
        
        // Use the first result's coordinates
        double lat = results[0].getLatitude();
        double lon = results[0].getLongitude();
        
        return getWeatherByCoordinates(lat, lon);
    }

    public WeatherResponse getWeatherByCoordinates(double lat, double lon) {
        String url = UriComponentsBuilder.fromHttpUrl(weatherApiUrl)
                .queryParam("latitude", lat)
                .queryParam("longitude", lon)
                .queryParam("current", "temperature_2m,relative_humidity_2m,apparent_temperature,weather_code,wind_speed_10m,wind_direction_10m")
                .queryParam("timezone", "auto")
                .toUriString();

        try {
            return restTemplate.getForObject(url, WeatherResponse.class);
        } catch (Exception e) {
            throw new RuntimeException("Error fetching weather data for coordinates: " + lat + ", " + lon, e);
        }
    }

    private GeocodingResponse.GeocodingResult[] getCoordinatesFromCity(String city) {
        String url = UriComponentsBuilder.fromHttpUrl(geocodingApiUrl)
                .queryParam("name", city)
                .queryParam("count", 1)
                .queryParam("language", "en")
                .queryParam("format", "json")
                .toUriString();

        try {
            GeocodingResponse response = restTemplate.getForObject(url, GeocodingResponse.class);
            return response != null ? response.getResults() : null;
        } catch (Exception e) {
            throw new RuntimeException("Error fetching coordinates for city: " + city, e);
        }
    }
}
