package ro.cts.templateRestaurant.clase;

public class Masa extends AMasa{
    @Override
    protected void curatareMasa() {
        System.out.println("Se curata masa");
    }

    @Override
    protected void asezareServetele() {
        System.out.println("Se aseaza servetele");
    }

    @Override
    protected void asezareTacamuri() {
        System.out.println("Se aseaza tacamuri");
    }

    @Override
    protected void asezarePersoane() {
        System.out.println("Va rog sa va asezati");
    }
}
