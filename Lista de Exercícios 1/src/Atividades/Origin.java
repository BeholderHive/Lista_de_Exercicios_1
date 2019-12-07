package Atividades;

import java.util.Arrays;

public class Origin {
    private int aux;
    private int[] seq1;
    private int[] seq2;
    private int n;
    private int a;
    private int b;
    private int c;

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }

    public int[] getSeq1() {
        return Arrays.copyOf(seq1, seq1.length);
    }

    public void setSeq1(int[] seq1) {
        this.seq1 = seq1;
    }

    public int[] getSeq2() {
        return Arrays.copyOf(seq2, seq2.length);
    }

    public void setSeq2(int[] seq2) {
        this.seq2 = seq2;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
