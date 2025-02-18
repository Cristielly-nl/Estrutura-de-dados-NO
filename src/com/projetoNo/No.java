package com.projetoNo;

public class No<T> {

    private T conteudo;
    private No proximo;

    public No(T conteudo) {
        this.proximo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public String toString() {
        return "No {" + "conteudo= " + conteudo + '\"' + '}';
    }
}
