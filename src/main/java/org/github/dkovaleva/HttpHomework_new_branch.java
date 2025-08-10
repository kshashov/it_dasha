package org.github.dkovaleva;

import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

public class HttpHomework_new_branch {
    public static void main(String[] args) {
        conversion(1, "EUR");

    }


    public static void conversion(int money, String currency) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.cbr-xml-daily.ru/latest.js"))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            System.out.println(response.body());

            Gson gson = new GsonBuilder().create();
            Currency computation = gson.fromJson(response.body(), Currency.class);
            Double c = computation.rates.get(currency);

            System.out.println("Конвертация " + money + " рубл. в валюту " + currency + " равна " + money * c);

            JsonElement jsonElement = JsonParser.parseString(response.body());
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            Double ccurrency = jsonObject.get("rates").getAsJsonObject().get(currency).getAsDouble();
            System.out.println("Конвертация " + money + " рубл. в валюту " + currency + " равна " + money * ccurrency);


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        System.out.println(response.statusCode());
    }

    public static class Currency {
        String date;
        String base;
        HashMap<String, Double> rates;
    }
}


