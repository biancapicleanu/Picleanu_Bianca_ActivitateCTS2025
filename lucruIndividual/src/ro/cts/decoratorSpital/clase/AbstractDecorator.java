package ro.cts.decoratorSpital.clase;

public abstract class AbstractDecorator implements IRezultat{
    private IRezultat rezultat;

    public AbstractDecorator(IRezultat rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public void afisareRezultat() {
        rezultat.afisareRezultat();
        resetareRezultat();
    }
    protected abstract void resetareRezultat();
}
