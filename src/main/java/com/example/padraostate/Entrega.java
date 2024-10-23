package com.example.padraostate;

public class Entrega {

    private String endereco;
    private EntregaEstado estado;

    public Entrega() {
        this.estado = EntregaEstadoPendente.getInstance();
    }

    public void setEstado(EntregaEstado estado) {
        this.estado = estado;
    }

    public boolean iniciarEntrega() {
        return estado.iniciarEntrega(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean concluir() {
        return estado.concluir(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public EntregaEstado getEstado() {
        return estado;
    }
}
