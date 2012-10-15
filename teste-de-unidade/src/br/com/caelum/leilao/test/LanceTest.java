package br.com.caelum.leilao.test;

import java.io.Serializable;

import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Usuario;

public class LanceTest implements Serializable {

	private static final long serialVersionUID = 1L;

	@Test(expected=IllegalArgumentException.class)
    public void deveRecusarLancesComValorDeZero() {
        new Lance(new Usuario("John Doe"), 0);
    }
     
    @Test(expected=IllegalArgumentException.class)
    public void deveRecusarLancesComValorNegativo() {
        new Lance(new Usuario("John Doe"), -10);
    }
}