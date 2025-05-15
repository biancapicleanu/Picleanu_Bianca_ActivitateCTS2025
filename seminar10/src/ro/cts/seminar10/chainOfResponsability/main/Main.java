package ro.cts.seminar10.chainOfResponsability.main;

import ro.cts.seminar10.chainOfResponsability.clase.*;

public class Main {
    public static void main(String[] args) {
        ARecomandaTransport troleibuz=new HandlerTroleibuz();
        ARecomandaTransport autobuz=new HandlerAutobuz();
        ARecomandaTransport tramvai=new HandlerTramvai();
        ARecomandaTransport metrou=new HandlerMetrou();
        troleibuz.setUrmator(autobuz);
        autobuz.setUrmator(tramvai);
        tramvai.setUrmator(metrou);
        troleibuz.recomanda(-1);
    }
}
