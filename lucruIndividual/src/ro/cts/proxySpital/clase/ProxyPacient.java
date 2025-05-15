package ro.cts.proxySpital.clase;

public class ProxyPacient implements IPacient{
    private IPacient pacient;

    public ProxyPacient(IPacient pacient) {
        this.pacient = pacient;
    }

    public IPacient getPacient() {
        return pacient;
    }

    public void setPacient(IPacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void afisareDatePacient() {
        if (isAreAsigurare()){
            pacient.afisareDatePacient();
        } else System.out.println("Nu se poate interna, nu are asigurare de sanatate");
    }

    @Override
    public boolean isAreAsigurare() {
        return pacient.isAreAsigurare();
    }
}
