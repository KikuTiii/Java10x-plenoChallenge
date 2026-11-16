package com.example.java10xplenochallenge.entity.enums;

public enum TipoMovimento {

        QUARTZ, AUTOMATICO, MANUAL;

        public static TipoMovimento fromApi(String valor) {
            if (valor == null || valor.isBlank()) return null;
            return switch (valor){
                case "quarts" -> QUARTZ;
                case "automatic" -> AUTOMATICO;
                case "manual" -> MANUAL;
                default -> throw new IllegalArgumentException("Tipo de Movimento inválido: " + valor);
            };
        }

        public String toApi() {
            return switch (this) {
                case QUARTZ -> "quarts";
                case AUTOMATICO -> "automatic";
                case MANUAL -> "manual";
            };
        }
}
