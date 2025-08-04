package org.github.dkovaleva;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpHomeworkFruit2_0 {
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

            Gson gson = new GsonBuilder().create();
            Fruit fruit = gson.fromJson(response.body(), Fruit.class);
            System.out.println("id = " + fruit.id + "\n" + "name = " + fruit.name + "\n" + "calories/ protein / sugar = " + fruit.nutritions.calories + "/ " + fruit.nutritions.protein + "/ " + fruit.nutritions.sugar + "/ ");


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        System.out.println(response.statusCode());
    }

    public static class Fruit {
        Nutritions nutritions;
        String name;
        String id;

        public static class Nutritions {
            String sugar;
            String calories;
            String protein;
        }
    }
}


