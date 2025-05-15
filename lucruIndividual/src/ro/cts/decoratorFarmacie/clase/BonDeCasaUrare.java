package ro.cts.decoratorFarmacie.clase;

import ro.cts.decoratorSpital.clase.IRezultat;

public class BonDeCasaUrare extends AbstractDecorator{

    public BonDeCasaUrare(IBonDeCasa bonDeCasa) {
        super(bonDeCasa);
    }

    @Override
    void printareMesaj() {
        System.out.println("La multi ani!");
    }
}
