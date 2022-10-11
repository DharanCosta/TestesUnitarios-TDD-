package br.com.alura.tdd.modelo;

import javax.swing.plaf.*;
import java.math.*;

public enum Desempenho {
    A_DESEJAR{
        @Override
        public BigDecimal percentualReajuste(){
            return new BigDecimal("0.03");
        }
    },
    BOM{
        @Override
        public BigDecimal percentualReajuste(){
            return new BigDecimal("0.10");
        }
    },
    OTIMO{
        @Override
        public BigDecimal percentualReajuste(){
            return new BigDecimal("0.20");
        }
    },
    EXPETACULAR{
        @Override
        public BigDecimal percentualReajuste(){
            return new BigDecimal("0.40");
        }
    };

    public abstract BigDecimal percentualReajuste();
}
