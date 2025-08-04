package org.github.dkovaleva;

import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class HttpClientTest {

    public static void main(String[] args) {
        getWaifu("hinata", "naruto");
    }

    public static Waifu getWaifu(String name, String anime) {
        HttpClient httpClient = HttpClient.newBuilder()
                .build();

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(new URI("https://waifu.it/api/v4/waifu?name=" + name + "&anime=" + anime))
                    .header("Authorization", "MTI1MTkzMTcyNDUxMTk2OTI4.MTc1NDIwMzQyMQ--.426da78481")
                    .build();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//            System.out.println(response.body());

            Gson gson = new GsonBuilder().create();
            Waifu waifu = gson.fromJson(response.body(), Waifu.class);
            System.out.println(waifu.name.first + " " + waifu.media.nodes.get(0).synonyms.get(0));

//            jsonElementExample(response);

            return waifu;

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    private static void jsonElementExample(HttpResponse<String> response) {
        JsonElement jsonElement = JsonParser.parseString(response.body());
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        String responseName = jsonObject.get("name").getAsJsonObject().get("first").getAsString();
        // getAsJsonObject("name") == get("name").getAsJsonObject()
        String responseImage = jsonObject.getAsJsonObject("image").get("large").getAsString();

        System.out.println(responseName + " " + responseImage + "\n");

        List<JsonObject> nodes = jsonObject.getAsJsonObject("media")
                .getAsJsonArray("nodes")
                .asList()
                .stream()
                .map(jsonElement1 -> jsonElement1.getAsJsonObject())
                .toList();

        nodes.stream()
                .map(jsonObject1 -> {
                    List<String> synonyms = jsonObject1.getAsJsonArray("synonyms")
                            .asList()
                            .stream()
                            .map(synonymJsonElement -> {
                                return synonymJsonElement.getAsString();
                            })
                            .toList();
                    return synonyms.toString();

                })
                .forEach(s -> {
                    System.out.println(s);
                });
    }


    public static class Waifu {
        public Name name;
        public Image image;
        public Media media;

        public static class Name {
            public String first;
            public String last;
        }

        public static class Image {
            public String large;
            public String medium;
            public String small;

            public String get() {
                if (large != null) return large;
                if (medium != null) return medium;
                if (small != null) return small;

                return "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRayhCFu-bZToZc0zYGcHC26SK0fwHUNuu5Hw&s";
            }
        }

        public static class Media {
            public List<Node> nodes;

            public static class Node {
                public List<String> synonyms;
            }
        }
    }
}
