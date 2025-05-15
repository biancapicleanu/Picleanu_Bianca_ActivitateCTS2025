package ro.cts.compositeBanca.clase;

public interface IStructuraBanca {
    void descriereStructura();
    void adaugareNod(IStructuraBanca structuraBanca);
    void stergereNod(IStructuraBanca structuraBanca);
    IStructuraBanca getNodCopil(int index);
}
