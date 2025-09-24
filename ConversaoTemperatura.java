package Avaliação;
import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius (°C): ");
        double celsius = scanner.nextDouble();

        // Calcula a temperatura em Fahrenheit
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        // Calcula a temperatura em Kelvin
        double kelvin = celsius + 273.15;

        // Exibe os resultados
        System.out.println("\n--- Conversão de Temperatura ---");
        System.out.printf("Temperatura em Celsius: %.2f °C\n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K\n", kelvin);

        scanner.close();
    }
}