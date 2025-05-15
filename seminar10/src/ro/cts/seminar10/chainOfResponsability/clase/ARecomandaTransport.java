package ro.cts.seminar10.chainOfResponsability.clase;

public abstract class ARecomandaTransport {
    protected ARecomandaTransport urmator;

    public void setUrmator(ARecomandaTransport urmator) {
        this.urmator = urmator;
    }
    public abstract void recomanda(int distanta);
}
