package org.example.arvore;

public class BinNo<T extends Comparable<T>> {

    private T conteudo;
    private BinNo<T> noDir;

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    private BinNo<T> noEsq;

    public BinNo(T conteudo) {
        this.conteudo = conteudo;
        this.noDir = null;
        this.noEsq = null;
    }

}
