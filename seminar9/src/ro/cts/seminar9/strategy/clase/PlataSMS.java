package ro.cts.seminar9.strategy.clase;

public class PlataSMS implements IMetodaPlata{


    public PlataSMS() {

    }

    @Override
    public void plateste(float pretBilet) {
        System.out.println("Ai platit prin sms");
    }
}
