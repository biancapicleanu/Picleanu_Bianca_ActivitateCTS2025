package ro.cts.proxyBanca.clase;

public class Credit implements ICredit{
    private String moneda;
    private String numeClient;

    public Credit(String moneda, String numeClient) {
        this.moneda = moneda;
        this.numeClient = numeClient;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void realizareCont(String moneda) {
        System.out.println("Clientul "+numeClient+" solicita un credit in moneda "+moneda);
    }
}
