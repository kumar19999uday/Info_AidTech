import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Utility");
        System.out.println("==============================");

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.println("Choose the current temperature scale:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();

        double convertedTemperature;

        switch (choice) {
            case 1:
                convertedTemperature = celsiusTo(temperature);
                System.out.printf("%.2f\u00B0C is equal to %.2f\u00B0F and %.2f K", temperature, convertedTemperature,
                        celsiusToKelvin(temperature));
                break;
            case 2:
                convertedTemperature = fahrenheitTo(temperature);
                System.out.printf("%.2f\u00B0F is equal to %.2f\u00B0C and %.2f K", temperature, convertedTemperature,
                        celsiusToKelvin(convertedTemperature));
                break;
            case 3:
                convertedTemperature = kelvinTo(temperature);
                System.out.printf("%.2f K is equal to %.2f\u00B0C and %.2f\u00B0F", temperature, convertedTemperature,
                        fahrenheitTo(convertedTemperature));
                break;
            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                return;
        }

        scanner.close();
    }

    // Conversion functions
    public static double celsiusTo(double temperature) {
        return (temperature * 9 / 5) + 32;
    }

    public static double fahrenheitTo(double temperature) {
        return (temperature - 32) * 5 / 9;
    }

    public static double kelvinTo(double temperature) {
        return temperature - 273.15;
    }

    public static double celsiusToKelvin(double temperature) {
        return temperature + 273.15;
    }
}
