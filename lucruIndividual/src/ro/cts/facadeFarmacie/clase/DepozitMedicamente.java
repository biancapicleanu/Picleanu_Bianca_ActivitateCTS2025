package ro.cts.facadeFarmacie.clase;

import java.util.ArrayList;
import java.util.List;

public class DepozitMedicamente {
    private List<String> medicamente;

    public DepozitMedicamente() {
        this.medicamente = new ArrayList<>();
    }

    public boolean verificaMedicamente(String medicament){
        return medicamente.contains(medicament);
    }
}
