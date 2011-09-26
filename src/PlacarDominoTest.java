import static org.junit.Assert.*;

import org.junit.Test;



public class PlacarDominoTest {
	PlacarDomino placar = new PlacarDomino();
	
	@Test
	public void testaSeOJogador1BateuPelaPrimeiraVezDeveMostrar3x0()
	{
		assertEquals("3X0",placar.batidaSimples(1));
	}
	
	@Test
	public void testaSeOPlacarComecaZerado(){
		assertEquals("0X0", placar.mostraPlacar());
	
	}
	
	@Test 
	public void testJogador1fezDuasBatidasSimples(){
		placar.batidaSimples(1);
		placar.batidaSimples(1);
		assertEquals("5X0",placar.mostraPlacar());
	}
	
	@Test
	
	public void testJogador1fezUmaPeca(){
		placar.batidaSimples(1);
		placar.batidaSimples(1);
		placar.batidaSimples(1);
		
		assertEquals("pX0", placar.mostraPlacar());
		
		
	}

}
