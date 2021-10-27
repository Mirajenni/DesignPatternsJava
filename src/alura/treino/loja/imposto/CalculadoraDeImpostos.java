package alura.treino.loja.imposto;

import alura.treino.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        //calcular(orcamento, ISS)
        //return ISS.calcular(orcamento)
        return imposto.calcular(orcamento);
    }
}
