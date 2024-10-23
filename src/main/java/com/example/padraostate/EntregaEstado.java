package com.example.padraostate;

public abstract class EntregaEstado {

    public abstract String getEstado();

    public boolean iniciarEntrega(Entrega entrega) {
        return false;
    }

    public boolean cancelar(Entrega entrega) {
        return false;
    }

    public boolean concluir(Entrega entrega) {
        return false;
    }
}
