package ro.cts.strategyBanca.clase;

public class DocPersoanaJuridica implements IActe{
    public DocPersoanaJuridica() {
    }

    @Override
    public void cereActe(TipClient tipClient) {
        if(tipClient.equals(TipClient.PERSOANA_JURIDICA)){
            System.out.println("Va rog sa imi prezentati actele de infiintare a firmei si dovada de la Registrul Comertului");
        } else System.out.println("Prezentati doc pt persoane fizice");
    }
}
