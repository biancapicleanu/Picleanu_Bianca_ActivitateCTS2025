package ro.cts.facadeFarmacie.clase;

import java.util.List;

public class Facade {
    public String verificare(Reteta reteta, List<Reteta> retete, String medicament, List<String> medicamente){
        DepozitMedicamente depozitMedicamente=new DepozitMedicamente();
        CardSanatate cardSanatate=new CardSanatate();
        if(reteta.verificaReteta(reteta)){
            if(depozitMedicamente.verificaMedicamente(medicament)){
                if(cardSanatate.isEsteValid()){
                    return "Poftiti reteta dumneavoastra";
                } else return "Cardul dumneavoastra nu este valid";
            } else return "Medicamentul nu este in stoc";
        } else return "Reteta nu este valida";

    }
}
