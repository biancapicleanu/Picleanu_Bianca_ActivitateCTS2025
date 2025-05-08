package ro.cts.seminar8.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructura{
    private String nume;
    private List<IStructura> lista;

    public Departament(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<IStructura> getLista() {
        return lista;
    }

    public void setLista(List<IStructura> lista) {
        this.lista = lista;
    }

    @Override
    public void descrieStructura() {
        System.out.println("Departamentul "+nume+" are urmatoarele sectii ");
        for(IStructura structura:lista){
            structura.descrieStructura();
        }
    }

    @Override
    public void adaugaNod(IStructura structura) {
        lista.add(structura);
    }

    @Override
    public void stergeNod(IStructura structura) {
        lista.remove(structura);

    }

    @Override
    public IStructura getCopilNod(int index) {
        return lista.get(index);
    }
}
