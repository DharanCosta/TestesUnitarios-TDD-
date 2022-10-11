package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.*;
import org.junit.jupiter.api.*;

import java.math.*;
import java.time.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResajusteServiceTest {

    private ReajusteService service;

    private Funcionario funcionario;
    @BeforeEach
    public void inicializar(){
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Ana",LocalDate.now(),new BigDecimal("1000.00"));
    }

    @Test
    public void reajusteDeveSerDeTresPorCentoQuandoODesempenho(){
        service.ajustarSalario(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveSerDeDezPorCentoQuandoODesempenho(){
        service.ajustarSalario(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1100.00"), funcionario.getSalario());
    }
    @Test
    public void reajusteDeveSerDeVintePorCentoQuandoODesempenho(){
        service.ajustarSalario(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
    @Test
    public void reajusteDeveSerDeQuarentaPorCentoQuandoODesempenho(){
        service.ajustarSalario(funcionario, Desempenho.EXPETACULAR);
        assertEquals(new BigDecimal("1400.00"), funcionario.getSalario());
    }
}
