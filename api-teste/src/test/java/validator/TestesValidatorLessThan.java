package validator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static br.com.infoglobo.qaTestEngine.validador.AssertAdapter.*;

import org.junit.Test;

import br.com.infoglobo.qaTestEngine.validador.Validator;

public class TestesValidatorLessThan {

	@Test
	public void zeroMenorQueUm() {
		assertTrue(Validator.lessThan(0,1));
	}
	
	@Test
	public void seteMenorQueDez() {
		assertTrue(Validator.lessThan(7,10));
	}
	
	@Test
	public void dezNaoEMenorQueCinco() {
		assertFalse(Validator.lessThan(10,5));
	}
	
	@Test
	public void doisMilNaoEMenorQueMil() {
		assertFalse(Validator.lessThan(2000,1000));
	}
	
	@Test
	public void zeroMenorQueUmNaoLancaErro() {
		assertLessThan(0,1);
	}
	
	@Test(expected=AssertionError.class)
	public void doisMenorQueUmLancaErro() {
		assertLessThan(2,1);
	}
}
