package com.edu.prompteng.strategies;

import com.edu.prompteng.core.PromptBuilder;
import com.edu.prompteng.core.PromptStrategy;

public class FewShotStrategy
        implements PromptStrategy {

    @Override
    public String definirEstructuraPrompt(
            PromptBuilder builder
    ) {

        builder.addExample(
                "Clase Animal",
                "Representa seres vivos"
        );

        builder.addExample(
                "Clase Vehiculo",
                "Representa transporte"
        );

        builder.addExample(
                "Clase Usuario",
                "Representa personas del sistema"
        );

        return builder.build();
    }
}
