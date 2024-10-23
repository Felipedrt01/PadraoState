package com.example.padraostate;

public class EntregaEstadoCancelada extends EntregaEstado {

    private EntregaEstadoCancelada() {};
    private static EntregaEstadoCancelada instance = new EntregaEstadoCancelada();

    public static EntregaEstadoCancelada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelada";
    }
}
