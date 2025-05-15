package ro.cts.compositeRestaurant.clase;

public class SubsectiuneMeniu implements IStructura{
    private String nume;

    public SubsectiuneMeniu(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriereStructura() {
        System.out.println("Subsectiunea "+nume);
    }

    @Override
    public void adaugareNod(IStructura nod) {
        throw new RuntimeException("Subsectiunea este frunza");
    }

    @Override
    public void stergereNod(IStructura nod) {
        throw new RuntimeException("Subsectiunea este frunza");
    }

    @Override
    public IStructura getNodCopil(int index) {
        throw new RuntimeException("Subsectiunea este frunza");
    }
}
