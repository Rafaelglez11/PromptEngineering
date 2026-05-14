package com.edu.prompteng;

import com.edu.prompteng.core.*;
import com.edu.prompteng.strategies.*;

public class Main {

    public static void main(String[] args) {

        PromptBuilder builder =
                new PromptBuilder()

                        .setRole(
                                "Arquitecto de Software Senior"
                        )

                        .setContext(
                                "Explicaciones educativas de Java"
                        )

                        .setInstruction(
                                "Explica qué es el patrón Strategy"
                        )

                        .setInput(
                                "Usa ejemplos simples."
                        );

        PromptAgent agente =
                new PromptAgent();

        // =====================================
        // ZERO SHOT
        // =====================================

        agente.setEstrategia(
                new ZeroShotStrategy()
        );

        System.out.println("""
                
                ===== ZERO SHOT =====
                """);

        System.out.println(
                agente.construir(builder)
        );

        // =====================================
        // FEW SHOT
        // =====================================

        agente.setEstrategia(
                new FewShotStrategy()
        );

        System.out.println("""
                
                ===== FEW SHOT =====
                """);

        System.out.println(
                agente.construir(builder)
        );

        // =====================================
        // CHAIN OF THOUGHT
        // =====================================

        agente.setEstrategia(
                new ChainOfThoughtStrategy()
        );

        System.out.println("""
                
                ===== CHAIN OF THOUGHT =====
                """);

        System.out.println(
                agente.construir(builder)
        );
    }



}