package com.sistemabancario.model;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Before;

/**
 * @author Manoel Campos da Silva Filho
 */
public class MovimentacaoTest {
    
    private Movimentacao instancia;
    
    @Before
    public void setUp() {
        instancia = new Movimentacao();
        instancia.setValor(0);
    }
    
    @Test
    public void instanciarComoNaoConfirmada(){
        assertFalse(instancia.isConfirmada());
    }
    
     @Test
    public void getTipoPadraoC(){
        final char esperado = 'C';
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void setTipoCreditoMaiusculo(){
        final char esperado = 'C';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void setTipoCreditoMenusculo(){
        final char esperado = 'c';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
    }

    @Test
    public void setTipo() {
        final char esperado = 'C';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void setTipoInvalido() {
        final char invalido = 'x';
        try{
        instancia.setTipo(invalido);
        }catch(IllegalArgumentException e){}
        final char obtido = instancia.getTipo();
        assertNotEquals(invalido, obtido);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void setTipoInvalidoExcecao() {
        final char invalido = 'x';
        instancia.setTipo(invalido);  
    }
    
    
}