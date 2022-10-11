package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.*;

import java.math.*;

public class ReajusteService {
     public void ajustarSalario(Funcionario novoFuncionario, Desempenho desempenho) {

         BigDecimal percentReajuste = desempenho.percentualReajuste();
         BigDecimal reajuste = novoFuncionario.getSalario().multiply(percentReajuste);
         novoFuncionario.reajustarSalario(reajuste);




     }
}
