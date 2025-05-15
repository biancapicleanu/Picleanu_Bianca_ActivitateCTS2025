package ro.cts.seminar10.chainOfResponsability.clase;

public class HandlerTroleibuz extends ARecomandaTransport{

    @Override
    public void recomanda(int distanta) {
        if(distanta<0){
            System.out.println("Selecteaza o distanta mai mare de 0");
        }
        if(distanta<=3){
            System.out.println("Iti recomand sa iei troleibuzul");
        } else if(urmator!=null){
            urmator.recomanda(distanta);
        }

    }
}
