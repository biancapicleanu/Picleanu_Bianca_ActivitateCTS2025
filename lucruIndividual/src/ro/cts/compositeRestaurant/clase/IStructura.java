package ro.cts.compositeRestaurant.clase;

public interface IStructura {
    void descriereStructura();
    void adaugareNod(IStructura nod);
    void stergereNod(IStructura nod);
    IStructura getNodCopil(int index);
}
