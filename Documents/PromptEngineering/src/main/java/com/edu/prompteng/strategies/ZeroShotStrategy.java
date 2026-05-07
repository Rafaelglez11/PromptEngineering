package com.edu.prompteng.strategies;

import com.edu.prompteng.core.PromptBuilder;
import com.edu.prompteng.core.PromptStrategy;

public class ZeroShotStrategy
        implements PromptStrategy {

    @Override
    public String definirEstructuraPrompt(
            PromptBuilder builder
    ) {

        return builder.build();
    }
}
