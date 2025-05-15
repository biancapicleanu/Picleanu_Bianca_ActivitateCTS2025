package ro.cts.compositeBanca.clase;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements IStructuraBanca{
    private String nume;
    private List<IStructuraBanca> listaAgentii;

    public Sucursala(String nume) {
        this.nume = nume;
        this.listaAgentii=new ArrayList<>();
    }

    @Override
    public void descriereStructura() {
        System.out.println("Sucursala "+nume+ " are urmatoarele agentii");
        for(IStructuraBanca agentie:listaAgentii){
            agentie.descriereStructura();
        }
    }

    @Override
    public void adaugareNod(IStructuraBanca structuraBanca) {
        listaAgentii.add(structuraBanca);
    }

    @Override
    public void stergereNod(IStructuraBanca structuraBanca) {
        listaAgentii.remove(structuraBanca);
    }

    @Override
    public IStructuraBanca getNodCopil(int index) {
        return listaAgentii.get(index);
    }
}
