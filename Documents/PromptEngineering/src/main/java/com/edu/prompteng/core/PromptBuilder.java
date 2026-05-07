package com.edu.prompteng.core;

import java.util.ArrayList;
import java.util.List;

public class PromptBuilder {

    private String role;
    private String context;
    private String instruction;
    private String input;

    private final List<String> examples =
            new ArrayList<>();

    public PromptBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    public PromptBuilder setContext(String context) {
        this.context = context;
        return this;
    }

    public PromptBuilder setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }

    public PromptBuilder setInput(String input) {
        this.input = input;
        return this;
    }

    public PromptBuilder addExample(
            String input,
            String output
    ) {

        examples.add("""
                <example>
                Input: %s
                Output: %s
                </example>
                """.formatted(input, output));

        return this;
    }

    public String build() {

        StringBuilder sb =
                new StringBuilder();

        sb.append("""
                <system>
                Role:
                """);

        sb.append(role).append("\n");

        sb.append("""
                
                Context:
                """);

        sb.append(context).append("\n");

        sb.append("""
                
                Instruction:
                """);

        sb.append(instruction).append("\n");

        sb.append("""
                </system>
                """);

        if (!examples.isEmpty()) {

            sb.append("""
                    
                    <examples>
                    """);

            examples.forEach(sb::append);

            sb.append("""
                    
                    </examples>
                    """);
        }

        sb.append("""
                
                <user>
                """);

        sb.append(input);

        sb.append("""
                
                </user>
                """);

        return sb.toString();
    }
}
