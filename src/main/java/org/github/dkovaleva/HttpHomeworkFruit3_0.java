package org.github.dkovaleva;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpHomeworkFruit3_0 {
    public static void main(String[] args) {
        fruit("strawberry");


    }


    public static void fruit(String fruitName) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.fruityvice.com/api/fruit/" + fruitName))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

            String json = response.body();
            JsonObject fruitInfo = JsonParser.parseString(json).getAsJsonObject();
            JsonObject nutritions = fruitInfo.getAsJsonObject("nutritions");
            int calories = nutritions.getAsJsonPrimitive("calories").getAsInt();
            String name = fruitInfo.get("name").getAsString();

            System.out.println("name = " + name + "\n" + "calories = " + calories);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        System.out.println(response.statusCode());
    }
}
