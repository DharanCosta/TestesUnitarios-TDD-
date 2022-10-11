package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.*;
import org.junit.jupiter.api.*;

import java.math.*;
import java.time.*;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    @Test
    void bonusDeveriaSerZeroParaBonusAlto(){
        BonusService service = new BonusService();
        assertThrows(IllegalArgumentException.class,
                ()-> service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(),new BigDecimal("25000"))));
//        try{
//            service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(),new BigDecimal("25000")));
//            fail("Não deu Exception");
//        }catch(Exception e){
//            assertEquals("Funcionário com saláio maior que R$1000,00 não pode receber um bonus", IllegalArgumentException e);
//        }
    }

    @Test
    void bonusDeveriaSer10PorCemDoSalario(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(),new BigDecimal("2500.00")));
        assertEquals(new BigDecimal("250.00"), bonus);
    }
    @Test
    void bonusDeveriaSerDezPorCentoParaSalarioDe10000(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(),new BigDecimal("10000.00")));
        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}