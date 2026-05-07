package com.edu.prompteng.core;

public interface PromptStrategy {

    String definirEstructuraPrompt(
            PromptBuilder builder
    );
}
