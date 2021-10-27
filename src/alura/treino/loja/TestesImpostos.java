package alura.treino.loja;

import alura.treino.loja.imposto.CalculadoraDeImpostos;
import alura.treino.loja.imposto.ISS;
import alura.treino.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS()));
    }
}
