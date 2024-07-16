import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class principalConversionMoneda {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Gson gson = new Gson();


        String apiKey = "1359782b1931c0b9ba0f075e";

        while (true) {
            System.out.println("""
                 \n ********************************************
                    Bienvenido(a) a nuestro Conversor de Divisas
                    ********************************************
                       ** Ingrese el número de la opción deseada **

                    1 - USD a ARS
                    2 - USD a BRL
                    3 - USD a COP
                    4 - USD a MXN
                    5 - MXN a USD
                    6 - BRL a USD
                    7 - ARS a USD
                    8 - COP a USD
                    9 - Salir

                    **************************
                 """);

            int choice = scanner.nextInt();

            if (choice == 9) {
                System.out.println("""
                        Gracias por hacer uso de nuestro servicio.
                        ¡Excelente dia, esperamos vuelva pronto!
                        """);
                break;
            } else if (choice < 1 || choice > 9) {
                System.out.println("Por favor seleccione una opción válida");
                continue;
            }

            String fromCurrency;
            String toCurrency;
            switch (choice) {
                case 1:
                    fromCurrency = "USD";
                    toCurrency = "ARS";
                    break;
                case 2:
                    fromCurrency = "USD";
                    toCurrency = "BRL";
                    break;
                case 3:
                    fromCurrency = "USD";
                    toCurrency = "COP";
                    break;
                case 4:
                    fromCurrency = "USD";
                    toCurrency = "MXN";
                    break;
                case 5:
                    fromCurrency = "MXN";
                    toCurrency = "USD";
                    break;
                case 6:
                    fromCurrency = "BRL";
                    toCurrency = "USD";
                    break;
                case 7:
                    fromCurrency = "ARS";
                    toCurrency = "USD";
                    break;
                case 8:
                    fromCurrency = "COP";
                    toCurrency = "USD";
                    break;
                default:
                    System.out.println("Error: Invalid choice.");
                    continue;
            }

            System.out.println("Ingrese el monto a convertir:");
            double amount = scanner.nextDouble();

            // Build API request URL
            String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + fromCurrency;
            URI requestUri = URI.create(url);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(requestUri).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                System.out.println("Error: API request failed with status code " + response.statusCode());
                continue;
            }

            String json = response.body();
            JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

            if (!jsonObject.has("conversion_rates")) {
                System.out.println("Error: Invalid response format.");
                continue; // Skip to the next iteration
            }

            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

            if (!conversionRates.has(toCurrency)) {
                System.out.println("Error: Conversion rate for " + toCurrency + " not found.");
                continue;
            }

            double conversionRate = conversionRates.get(toCurrency).getAsDouble();
            double convertedAmount = amount * conversionRate;

            System.out.println("La conversión de " + amount + " " + fromCurrency + " a " + toCurrency + " es: " + convertedAmount);

        }
    }
}