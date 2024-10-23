package com.example.padraostate;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EntregaTest {

    private Entrega entrega;

    @BeforeEach
    void setUp() {
        entrega = new Entrega();
        entrega.setEndereco("Rua Exemplo, 123");
    }

    @Test
    void testEstadoInicial() {
        assertEquals("Pendente", entrega.getNomeEstado());
    }

    @Test
    void testIniciarEntrega() {
        entrega.iniciarEntrega();
        assertEquals("Em Rota", entrega.getNomeEstado());
    }

    @Test
    void testConcluirEntrega() {
        entrega.iniciarEntrega(); // Muda para "Em Rota"
        entrega.concluir();
        assertEquals("Entregue", entrega.getNomeEstado());
    }

    @Test
    void testCancelarEntrega() {
        entrega.cancelar();
        assertEquals("Cancelada", entrega.getNomeEstado());
    }

    @Test
    void testIniciarEntregaDepoisDeCancelar() {
        entrega.cancelar(); // Muda para "Cancelada"
        entrega.iniciarEntrega(); // Tenta iniciar entrega
        assertEquals("Cancelada", entrega.getNomeEstado()); // O estado não deve mudar
    }

    @Test
    void testConcluirEntregaDepoisDeCancelar() {
        entrega.cancelar(); // Muda para "Cancelada"
        entrega.concluir(); // Tenta concluir entrega
        assertEquals("Cancelada", entrega.getNomeEstado()); // O estado não deve mudar
    }
}
