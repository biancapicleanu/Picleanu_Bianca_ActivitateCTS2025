package ro.cts.seminar10.chainOfResponsability.clase;

public class HandlerTramvai extends ARecomandaTransport{
    @Override
    public void recomanda(int distanta) {
        if(distanta<=10){
            System.out.println("Iti recomand sa iei tramvaiul");
        } else if(urmator!=null){
            urmator.recomanda(distanta);
        }

    }
}
