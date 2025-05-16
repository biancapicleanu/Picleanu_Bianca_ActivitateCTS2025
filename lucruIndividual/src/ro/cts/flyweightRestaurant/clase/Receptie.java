package ro.cts.flyweightRestaurant.clase;

import java.util.HashMap;
import java.util.Map;

public class Receptie {
    private Map<String, IClient> clienti;

    public Receptie() {
        clienti=new HashMap<>();
    }

    public Map<String, IClient> getClienti() {
        return clienti;
    }

    public void setClienti(Map<String, IClient> clienti) {
        this.clienti = clienti;
    }

    public IClient getClient(String nume, String adresaEmail, String numarTelefon){
        if(!clienti.containsKey(nume)){
            clienti.put(nume, new Client(nume, numarTelefon, adresaEmail));
        }
        return clienti.get(nume);
    }

    public IClient getClient(String nume){
        if(clienti.containsKey(nume)){
            return clienti.get(nume);
        } else {
            throw new RuntimeException("Nu s-a gasit clientul in baza de date");
        }
    }
}
