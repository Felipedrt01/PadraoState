package com.example.padraostate;

public class EntregaEstadoEmRota extends EntregaEstado {

    private EntregaEstadoEmRota() {};
    private static EntregaEstadoEmRota instance = new EntregaEstadoEmRota();

    public static EntregaEstadoEmRota getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Rota";
    }

    public boolean concluir(Entrega entrega) {
        entrega.setEstado(EntregaEstadoEntregue.getInstance());
        return true;
    }

    public boolean cancelar(Entrega entrega) {
        entrega.setEstado(EntregaEstadoCancelada.getInstance());
        return true;
    }
}
