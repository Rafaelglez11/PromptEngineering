package com.ai.ollama;

import com.ai.ollama.OllamaClient;

import com.ai.ollama.OllamaResponse;

import com.google.gson.Gson;

public class OllamaService {

    private final OllamaClient client;

    private final Gson gson;

    public OllamaService() {

        this.client = new OllamaClient();

        this.gson = new Gson();

    }

    public String askModel(String prompt) {

        String jsonResponse = client.generateResponse(prompt);

        if (jsonResponse == null) {

            return "Error al obtener respuesta";

        }

        OllamaResponse response = gson.fromJson(jsonResponse, OllamaResponse.class);

        return response.response;

    }

}
