package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.*;
import org.junit.jupiter.api.*;

import java.math.*;
import java.time.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResajusteServiceTest {
    @Test
    public void reajusteDeveSerDeTresPorCentoQuandoODesempenho(){
        ReajusteService service = new ReajusteService();
        Funcionario novoFuncionario = new Funcionario(
                "Ana", LocalDate.now(), new BigDecimal("1000.00"));
        service.ajustarSalario(novoFuncionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), novoFuncionario.getSalario());
    }

    @Test
    public void reajusteDeveSerDeDezPorCentoQuandoODesempenho(){
        ReajusteService service = new ReajusteService();
        Funcionario novoFuncionario = new Funcionario(
                "Ana", LocalDate.now(), new BigDecimal("1000.00"));
        service.ajustarSalario(novoFuncionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1100.00"), novoFuncionario.getSalario());
    }
    @Test
    public void reajusteDeveSerDeVintePorCentoQuandoODesempenho(){
        ReajusteService service = new ReajusteService();
        Funcionario novoFuncionario = new Funcionario(
                "Ana", LocalDate.now(), new BigDecimal("1000.00"));
        service.ajustarSalario(novoFuncionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), novoFuncionario.getSalario());
    }
    @Test
    public void reajusteDeveSerDeQuarentaPorCentoQuandoODesempenho(){
        ReajusteService service = new ReajusteService();
        Funcionario novoFuncionario = new Funcionario(
                "Ana", LocalDate.now(), new BigDecimal("1000.00"));
        service.ajustarSalario(novoFuncionario, Desempenho.EXPETACULAR);
        assertEquals(new BigDecimal("1400.00"), novoFuncionario.getSalario());
    }
}
