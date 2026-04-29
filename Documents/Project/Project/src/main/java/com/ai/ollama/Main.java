package com.ai.ollama;

import com.ai.ollama.OllamaService;

public class Main {

    public static void main(String[] args) {
        OllamaService service = new OllamaService();

        String respuesta = service.askModel("Explain OOP in Java simply");

        System.out.println("Respuesta del modelo:");
        System.out.println(respuesta);
    }
}
