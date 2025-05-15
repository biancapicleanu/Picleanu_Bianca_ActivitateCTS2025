package ro.cts.compositeBanca.clase;

import java.util.ArrayList;
import java.util.List;

public class Filiala implements IStructuraBanca{
    private String nume;

    public Filiala(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriereStructura() {
        System.out.println("Filiala "+nume);

    }

    @Override
    public void adaugareNod(IStructuraBanca structuraBanca) {
        throw new RuntimeException("Filiala este ultimul nod");
    }

    @Override
    public void stergereNod(IStructuraBanca structuraBanca) {
        throw new RuntimeException("Filiala este ultimul nod");
    }

    @Override
    public IStructuraBanca getNodCopil(int index) {
        throw new RuntimeException("Filiala este ultimul nod");
    }
}
