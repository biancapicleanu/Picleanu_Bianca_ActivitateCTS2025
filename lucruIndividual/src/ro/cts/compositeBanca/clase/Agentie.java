package ro.cts.compositeBanca.clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements IStructuraBanca{
    private String nume;
    private List<IStructuraBanca> listaFiliale;

    public Agentie(String nume) {
        this.nume = nume;
        this.listaFiliale=new ArrayList<>();
    }

    @Override
    public void descriereStructura() {
        System.out.println("Agentia "+nume+ " are urmatoarele filiale");
        for(IStructuraBanca filiala:listaFiliale){
            filiala.descriereStructura();
        }
    }

    @Override
    public void adaugareNod(IStructuraBanca structuraBanca) {
        listaFiliale.add(structuraBanca);
    }

    @Override
    public void stergereNod(IStructuraBanca structuraBanca) {
        listaFiliale.remove(structuraBanca);
    }

    @Override
    public IStructuraBanca getNodCopil(int index) {
        return listaFiliale.get(index);
    }
}
