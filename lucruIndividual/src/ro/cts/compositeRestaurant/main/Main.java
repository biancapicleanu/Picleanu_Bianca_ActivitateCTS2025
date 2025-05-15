package ro.cts.compositeRestaurant.main;

import ro.cts.compositeRestaurant.clase.IStructura;
import ro.cts.compositeRestaurant.clase.ItemMeniu;
import ro.cts.compositeRestaurant.clase.SectiuneMeniu;
import ro.cts.compositeRestaurant.clase.SubsectiuneMeniu;

public class Main {
    public static void main(String[] args) {
        IStructura sectiune=new SectiuneMeniu("Startere");
        IStructura sectiune1=new SectiuneMeniu("Bauturi");
        IStructura subsectiune=new SubsectiuneMeniu("Sucuri");
        IStructura subsectiune2=new SubsectiuneMeniu("Cafea");
        IStructura item=new ItemMeniu("Apa plata");
        IStructura item1=new ItemMeniu("Apa minerala");
        try{
            sectiune1.adaugareNod(subsectiune);
            sectiune1.adaugareNod(subsectiune2);
            sectiune1.adaugareNod(item);
            sectiune1.adaugareNod(item1);
            sectiune1.descriereStructura();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
