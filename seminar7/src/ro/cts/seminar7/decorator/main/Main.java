package ro.cts.seminar7.decorator.main;

import ro.cts.seminar7.decorator.clase.*;

public class Main {
    public static void main(String[] args) {
        Nota nota=new NotaPlata(150);
        Nota notaAnNou=new NotaAnNou(nota);
        notaAnNou.printare();
        Nota notaCraciun=new NotaCraciun(notaAnNou);
        notaCraciun.printare();
    }
}
