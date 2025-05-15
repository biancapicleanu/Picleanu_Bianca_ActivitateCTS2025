package ro.cts.decoratorFarmacie.main;

import ro.cts.decoratorFarmacie.clase.BonDeCasa;
import ro.cts.decoratorFarmacie.clase.BonDeCasaUrare;
import ro.cts.decoratorFarmacie.clase.IBonDeCasa;

public class Main {
    public static void main(String[] args) {
        IBonDeCasa bonDeCasa=new BonDeCasa(100);
        IBonDeCasa bonDeCasaUrare=new BonDeCasaUrare(bonDeCasa);
        bonDeCasaUrare.printeazaBon();
    }
}
