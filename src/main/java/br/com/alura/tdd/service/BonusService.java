package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.*;

import java.math.*;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionário com saláio maior que R$1000,00 não pode receber um bonus");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
