package ro.cts.strategyBanca.clase;

public class DocPersoanaFizica implements IActe{
    public DocPersoanaFizica() {
    }

    @Override
    public void cereActe(TipClient tipClient) {
        if(tipClient.equals(TipClient.PERSOANA_FIZICA)){
            System.out.println("Va rog sa imi prezentati buletinul si adeverinta de munca");
        }else System.out.println("Prezentati doc pt persoane juridice");
    }
}
