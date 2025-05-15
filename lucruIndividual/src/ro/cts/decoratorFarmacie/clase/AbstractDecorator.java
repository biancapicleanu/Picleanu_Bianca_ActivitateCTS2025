package ro.cts.decoratorFarmacie.clase;

public abstract class AbstractDecorator implements IBonDeCasa{
    private IBonDeCasa bonDeCasa;

    public AbstractDecorator(IBonDeCasa bonDeCasa) {
        this.bonDeCasa = bonDeCasa;
    }

    public IBonDeCasa getBonDeCasa() {
        return bonDeCasa;
    }

    public void setBonDeCasa(IBonDeCasa bonDeCasa) {
        this.bonDeCasa = bonDeCasa;
    }

    @Override
    public void printeazaBon() {
        bonDeCasa.printeazaBon();
        printareMesaj();
    }
    abstract void printareMesaj();
}
