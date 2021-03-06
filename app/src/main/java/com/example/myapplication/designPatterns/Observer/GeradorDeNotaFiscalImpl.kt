package com.example.myapplication.designPatterns.Observer

import com.example.myapplication.designPatterns.models.Fatura
import com.example.myapplication.designPatterns.models.NotaFiscal

class GeradorDeNotaFiscalImpl(private val acoes: List<AcoesAposGerarNota>) {

    fun gera(fatura: Fatura): NotaFiscal {

        val valor = fatura.valorMensal
        val notaFiscal =
            NotaFiscal(
                123,
                valorBruto = valor,
                impostos = impostoSimplesSobreO(valor)
            )
        for (acoes in acoes) {
            acoes.executa(notaFiscal)
        }

        return notaFiscal
    }

    private fun impostoSimplesSobreO(valor: Double): Double {
        return valor * 0.06
    }

}