package ro.cts.strategyRestaurant.clase;

public class PlataCash implements IMetodaPlata{
    private float sumaDetinuta;

    public PlataCash(float sumaDetinuta) {
        this.sumaDetinuta = sumaDetinuta;
    }

    @Override
    public void realizeazaPlata(float suma) {
        if(sumaDetinuta>=suma){
            System.out.println("S-a efectuat plata cash");
            sumaDetinuta-=suma;
        } else System.out.println("Nu aveti suficienti bani");
    }
}
