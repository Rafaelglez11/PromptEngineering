package com.edu.prompteng.core;

public class PromptAgent {

    private PromptStrategy estrategia;

    public void setEstrategia(
            PromptStrategy estrategia
    ) {

        this.estrategia = estrategia;
    }

    public String construir(
            PromptBuilder builder
    ) {

        return estrategia
                .definirEstructuraPrompt(builder);
    }
}
