# Weather API - Spring Boot Application

A Spring Boot web application that fetches weather updates from the OpenMeteo API.

## Features

- Fetch weather by city name (uses geocoding to find coordinates)
- Fetch weather by coordinates (latitude and longitude)
- RESTful API endpoints
- JSON response format
- **No API key required** - OpenMeteo is free for non-commercial use!

## Prerequisites

- Java 11 or higher
- Maven 3.6 or higher (or use the included Maven wrapper)

## Setup

**No API key needed!** OpenMeteo API is free and doesn't require authentication for non-commercial use.

## Running the Application

### Using Maven Wrapper (Recommended):
```bash
export JAVA_HOME=/opt/homebrew/opt/openjdk@11  # Adjust path if needed
./mvnw spring-boot:run
```

### Using Maven (if installed):
```bash
mvn spring-boot:run
```

### Using Java directly:
```bash
./mvnw clean package
java -jar target/weather-api-1.0.0.jar
```

The application will start on `http://localhost:8080`

**Note:** The first run may take a few minutes as Maven downloads dependencies.

## API Endpoints

### Get Weather by City Name
```
GET http://localhost:8080/api/weather/city/{cityName}
```

Example:
```
GET http://localhost:8080/api/weather/city/London
GET http://localhost:8080/api/weather/city/New York
GET http://localhost:8080/api/weather/city/Tokyo
```

### Get Weather by Coordinates
```
GET http://localhost:8080/api/weather/coordinates?lat={latitude}&lon={longitude}
```

Example:
```
GET http://localhost:8080/api/weather/coordinates?lat=51.5074&lon=-0.1278
GET http://localhost:8080/api/weather/coordinates?lat=40.7128&lon=-74.0060
```

### Health Check
```
GET http://localhost:8080/api/weather/health
```

## Response Format

The API returns weather information in JSON format including:
- Location coordinates (latitude, longitude)
- Current temperature
- Apparent temperature (feels like)
- Relative humidity
- Weather code
- Wind speed and direction
- Timezone information
- Elevation

## Example Response

```json
{
  "latitude": 51.5074,
  "longitude": -0.1278,
  "timezone": "Europe/London",
  "current": {
    "time": "2024-11-15T12:00",
    "temperature_2m": 15.5,
    "apparent_temperature": 14.2,
    "relative_humidity_2m": 65,
    "weather_code": 61,
    "wind_speed_10m": 3.5,
    "wind_direction_10m": 180
  },
  "currentUnits": {
    "temperature_2m": "°C",
    "wind_speed_10m": "km/h"
  }
}
```

## Weather Codes

OpenMeteo uses WMO weather codes:
- 0: Clear sky
- 1-3: Mainly clear, partly cloudy, overcast
- 45-48: Fog and depositing rime fog
- 51-67: Drizzle and rain
- 71-77: Snow
- 80-99: Rain and snow showers, thunderstorms

## Technology Stack

- Spring Boot 2.7.18
- Java 11+
- Maven
- OpenMeteo API (free, no API key required)

## OpenMeteo API - Free for Non-Commercial Use

✅ **This project is completely free to use and share on GitHub!**

- **Free Tier**: Up to 10,000 API calls per day
- **No API Key Required**: Works out of the box
- **Non-Commercial Use**: Free for personal projects, learning, and open source
- **Commercial Use**: Requires a paid subscription (see [OpenMeteo Pricing](https://open-meteo.com/en/pricing))

### Can I push this to GitHub?

**Yes!** This project is free to:
- ✅ Push to GitHub (public or private repositories)
- ✅ Use for personal projects
- ✅ Use for educational purposes
- ✅ Share with others
- ✅ Contribute to open source

**Note**: If you plan to use this commercially (making money from it), you'll need to upgrade to a paid OpenMeteo plan.

## License

This project uses the OpenMeteo API which is free for non-commercial use. Please refer to [OpenMeteo Terms of Service](https://open-meteo.com/en/terms) for commercial usage.

### Project License

You can license your code however you want (MIT, Apache, etc.). The OpenMeteo API usage is free for non-commercial projects.
