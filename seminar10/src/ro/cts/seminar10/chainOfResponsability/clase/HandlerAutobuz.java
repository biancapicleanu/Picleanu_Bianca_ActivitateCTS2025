package ro.cts.seminar10.chainOfResponsability.clase;

public class HandlerAutobuz extends ARecomandaTransport{


    @Override
    public void recomanda(int distanta) {
        if(distanta <=5){
            System.out.println("Iti recomand sa iei autobuzul");
        } else if(urmator!=null){
            urmator.recomanda(distanta);
        }
    }
}
