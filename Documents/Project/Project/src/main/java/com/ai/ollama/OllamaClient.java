package com.ai.ollama;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OllamaClient {

    private final HttpClient client;

    public OllamaClient() {
        this.client = HttpClient.newHttpClient();
    }

    public String generateResponse(String prompt) {
        try {
            String json = """
            {
              "model": "llama3",
              "prompt": "%s",
              "stream": false
            }
            """.formatted(prompt);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:11434/api/generate"))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}