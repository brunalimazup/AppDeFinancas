package br.com.alura.financas.delegate;

import br.com.alura.financas.model.Transacao;


public interface TransacaoDelegate {
    void executa(Transacao transacao);
}
