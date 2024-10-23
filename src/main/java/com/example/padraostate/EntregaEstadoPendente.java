package com.example.padraostate;

public class EntregaEstadoPendente extends EntregaEstado {

    private EntregaEstadoPendente() {};
    private static EntregaEstadoPendente instance = new EntregaEstadoPendente();

    public static EntregaEstadoPendente getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pendente";
    }

    public boolean iniciarEntrega(Entrega entrega) {
        entrega.setEstado(EntregaEstadoEmRota.getInstance());
        return true;
    }

    public boolean cancelar(Entrega entrega) {
        entrega.setEstado(EntregaEstadoCancelada.getInstance());
        return true;
    }
}
