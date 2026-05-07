package com.edu.prompteng.strategies;

import com.edu.prompteng.core.PromptBuilder;
import com.edu.prompteng.core.PromptStrategy;

public class ChainOfThoughtStrategy
        implements PromptStrategy {

    @Override
    public String definirEstructuraPrompt(
            PromptBuilder builder
    ) {

        builder.setInstruction(
                builder.build()
                        + "\nPensemos paso a paso."
        );

        return builder.build();
    }
}
