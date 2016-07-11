package testes;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.Autoridade;
import main.Formal;
import main.Informal;
import main.Titulo;

public class TesteAutoridade {
	
	private Autoridade autoridadeM;
	private Autoridade autoridadeF;
	
	private Informal informal;
	private Formal formalM;
	private Formal formalF;
	private Titulo titulo;
	
	@Before
	public void antesTeste() {
		autoridadeM = new Autoridade("Fábio", "Melo");
		autoridadeF = new Autoridade("Maria", "José");
		
		informal = new Informal();
		formalM = new Formal(true);
		formalF = new Formal(false);
		titulo = new Titulo("Vossa Majestade");
	}
	

	@Test
	public void testeInformal() {
		assertTrue(informal.formatarNome(autoridadeM.getNome(), autoridadeM.getSobrenome()).equals(autoridadeM.getNome()));
	}
	
	@Test
	public void testeFormalM() {
		assertTrue(formalM.formatarNome(autoridadeM.getNome(), autoridadeM.getSobrenome()).equals(formalM.getSubstantivo()+" "+autoridadeM.getSobrenome()));
	}
	
	@Test
	public void testeFormalF() {
		assertTrue(formalF.formatarNome(autoridadeF.getNome(), autoridadeF.getSobrenome()).equals(formalF.getSubstantivo()+" "+autoridadeF.getSobrenome()));
	}
	
	@Test
	public void testeTitulo() {
		assertTrue(titulo.formatarNome(autoridadeM.getNome(), autoridadeM.getSobrenome()).equals(titulo.getTitulo()+" "+autoridadeM.getNome()+" "+autoridadeM.getSobrenome()));
	}

}
