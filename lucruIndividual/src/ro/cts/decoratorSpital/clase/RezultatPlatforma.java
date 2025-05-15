package ro.cts.decoratorSpital.clase;

public class RezultatPlatforma extends AbstractDecorator{
    public RezultatPlatforma(IRezultat rezultat) {
        super(rezultat);
    }

    @Override
    protected void resetareRezultat() {
        System.out.println("Rezultat resetat");
    }


}
