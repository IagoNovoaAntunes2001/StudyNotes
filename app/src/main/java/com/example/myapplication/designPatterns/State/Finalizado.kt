package com.example.myapplication.designPatterns.State

import com.example.myapplication.designPatterns.State.models.Orcamento

internal class Finalizado : EstadoDeUmOrcamento {
    override fun aplicaDescontoExtra(orcamento: Orcamento?) {}
    override fun aprova(orcamento: Orcamento?) {
        throw java.lang.RuntimeException("Não posso mudar mais, já estou finalizado!")
    }

    override fun reprova(orcamento: Orcamento?) {
        throw java.lang.RuntimeException("Não posso mudar mais, já estou finalizado!")
    }

    override fun finaliza(orcamento: Orcamento?) {
        throw java.lang.RuntimeException("Não posso mudar mais, já estou finalizado!")
    }
}