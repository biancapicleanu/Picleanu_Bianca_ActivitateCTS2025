package ro.cts.seminar8.composite.clase;

public class Sectie implements IStructura{
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void descrieStructura() {
        System.out.println("Sectie "+nume);

    }

    @Override
    public void adaugaNod(IStructura structura) throws Exception {
        throw new Exception("Nu se poate adauga nod nou ");
    }

    @Override
    public void stergeNod(IStructura structura) throws Exception {
        throw new Exception("Nu se poate sterge nod nou ");
    }

    @Override
    public IStructura getCopilNod(int index) throws Exception {
        throw new Exception("Nu se poate extrage nod nou ");
    }
}
