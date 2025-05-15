package ro.cts.compositeBanca.main;

import ro.cts.compositeBanca.clase.Agentie;
import ro.cts.compositeBanca.clase.Filiala;
import ro.cts.compositeBanca.clase.IStructuraBanca;
import ro.cts.compositeBanca.clase.Sucursala;

public class Main {
    public static void main(String[] args) {
        IStructuraBanca sucursala=new Sucursala("Sucursala 1");
        IStructuraBanca agentie1=new Agentie("Agentie 1");
        IStructuraBanca agentie2=new Agentie("Agentie 2");
        IStructuraBanca filiala=new Filiala("Filiala 1");
        IStructuraBanca filiala2=new Filiala("Filiala 2");
        IStructuraBanca filiala3=new Filiala("Filiala 3");
        try{
            sucursala.adaugareNod(agentie1);
            sucursala.adaugareNod(agentie2);
            agentie1.adaugareNod(filiala);
            agentie1.adaugareNod(filiala2);
            agentie2.adaugareNod(filiala3);
            sucursala.descriereStructura();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
