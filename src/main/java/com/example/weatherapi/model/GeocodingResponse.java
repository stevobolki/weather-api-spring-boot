package com.example.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeocodingResponse {
    private GeocodingResult[] results;

    @JsonProperty("results")
    public GeocodingResult[] getResults() {
        return results;
    }

    public void setResults(GeocodingResult[] results) {
        this.results = results;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GeocodingResult {
        private int id;
        private String name;
        private double latitude;
        private double longitude;
        private double elevation;
        @JsonProperty("feature_code")
        private String featureCode;
        @JsonProperty("country_code")
        private String countryCode;
        @JsonProperty("admin1_id")
        private int admin1Id;
        @JsonProperty("timezone")
        private String timezone;
        @JsonProperty("population")
        private int population;
        @JsonProperty("country_id")
        private int countryId;
        private String country;
        @JsonProperty("admin1")
        private String admin1;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public double getElevation() {
            return elevation;
        }

        public void setElevation(double elevation) {
            this.elevation = elevation;
        }

        public String getFeatureCode() {
            return featureCode;
        }

        public void setFeatureCode(String featureCode) {
            this.featureCode = featureCode;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public int getAdmin1Id() {
            return admin1Id;
        }

        public void setAdmin1Id(int admin1Id) {
            this.admin1Id = admin1Id;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getCountryId() {
            return countryId;
        }

        public void setCountryId(int countryId) {
            this.countryId = countryId;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getAdmin1() {
            return admin1;
        }

        public void setAdmin1(String admin1) {
            this.admin1 = admin1;
        }
    }
}

