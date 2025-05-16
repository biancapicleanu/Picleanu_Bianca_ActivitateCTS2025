package ro.cts.flyweightRestaurant.clase;

public class Client implements IClient{
    private String nume;
    private String numarDeTelefon;
    private String adresaEmail;

    public Client(String nume, String numarDeTelefon, String adresaEmail) {
        this.nume = nume;
        this.numarDeTelefon = numarDeTelefon;
        this.adresaEmail = adresaEmail;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNumarDeTelefon() {
        return numarDeTelefon;
    }

    public void setNumarDeTelefon(String numarDeTelefon) {
        this.numarDeTelefon = numarDeTelefon;
    }

    public String getAdresaEmail() {
        return adresaEmail;
    }

    public void setAdresaEmail(String adresaEmail) {
        this.adresaEmail = adresaEmail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarDeTelefon='").append(numarDeTelefon).append('\'');
        sb.append(", adresaEmail='").append(adresaEmail).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisareDetalii(Masa masa) {
        System.out.println(this);
        System.out.println(masa.toString());
    }
}
