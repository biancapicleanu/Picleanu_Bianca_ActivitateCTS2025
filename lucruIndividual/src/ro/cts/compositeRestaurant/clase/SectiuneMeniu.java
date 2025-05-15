package ro.cts.compositeRestaurant.clase;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu implements IStructura{
    private String nume;
    private List<IStructura> lista;

    public SectiuneMeniu(String nume) {
        this.nume = nume;
        this.lista=new ArrayList<>();
    }

    @Override
    public void descriereStructura() {
        System.out.println("Sectiunea "+nume+" are urmatoarele subsectiuni/item-uri");
        for(IStructura structura:lista){
            structura.descriereStructura();
        }
    }

    @Override
    public void adaugareNod(IStructura nod) {
        lista.add(nod);
    }

    @Override
    public void stergereNod(IStructura nod) {
        lista.remove(nod);
    }

    @Override
    public IStructura getNodCopil(int index) {
        return lista.get(index);
    }
}
