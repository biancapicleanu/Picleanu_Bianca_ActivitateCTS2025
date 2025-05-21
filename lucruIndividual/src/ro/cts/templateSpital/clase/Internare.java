package ro.cts.templateSpital.clase;

public class Internare extends AInternare{
    @Override
    public void analizareStare() {
        System.out.println("A fost analizata starea pacientului");
    }

    @Override
    public void disponibilitateSalon() {
        System.out.println("Se verifica disponibilitatea salonului");
    }

    @Override
    public void emitereFisaInternare() {
        System.out.println("Se emite fisa de internare a pacientului");
    }
}
