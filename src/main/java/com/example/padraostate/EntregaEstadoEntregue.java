package com.example.padraostate;

public class EntregaEstadoEntregue extends EntregaEstado {

    private EntregaEstadoEntregue() {};
    private static EntregaEstadoEntregue instance = new EntregaEstadoEntregue();

    public static EntregaEstadoEntregue getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Entregue";
    }
}
