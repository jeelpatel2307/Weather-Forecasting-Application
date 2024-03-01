import java.util.Scanner;

public class WeatherForecastApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for city input
        System.out.print("Enter the city name: ");
        String city = scanner.nextLine();

        // Call method to fetch weather data
        String weatherData = fetchWeatherData(city);

        // Display weather forecast
        System.out.println("Weather forecast for " + city + ": " + weatherData);

        scanner.close();
    }

    // Method to fetch weather data (dummy implementation)
    private static String fetchWeatherData(String city) {
        // In a real-world application, this method would make an API call to a weather service
        // and retrieve actual weather data based on the provided city.

        // For simplicity, we'll return dummy weather data here
        return "Sunny with a chance of clouds";
    }
}
