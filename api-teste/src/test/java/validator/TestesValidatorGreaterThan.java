package validator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static br.com.infoglobo.qaTestEngine.validador.AssertAdapter.*;

import org.junit.Test;

import br.com.infoglobo.qaTestEngine.validador.Validator;

public class TestesValidatorGreaterThan {

	@Test
	public void umMaiorQueZero() {
		assertTrue(Validator.greaterThan(1,0));
	}
	
	@Test
	public void dezMaiorQueSete() {
		assertTrue(Validator.greaterThan(10,7));
	}
	
	@Test
	public void cincoNaoEMaiorQueDez() {
		assertFalse(Validator.greaterThan(5,10));
	}
	
	@Test
	public void milNaoEMaiorQueCemMil() {
		assertFalse(Validator.greaterThan(1000,100000));
	}
	
	@Test
	public void umMaiorQueZeroNaoLancaErro() {
		assertGreatherThan(1,0);
	}
	
	@Test(expected=AssertionError.class)
	public void umMaiorQueDoisLancaErro() {
		assertGreatherThan(1,2);
	}
}
