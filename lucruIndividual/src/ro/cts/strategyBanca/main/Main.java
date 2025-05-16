package ro.cts.strategyBanca.main;

import ro.cts.strategyBanca.clase.*;

public class Main {
    public static void main(String[] args) {
        IActe actePersoanaJuridica=new DocPersoanaJuridica();
        GhiseuBanca ghiseuBanca=new GhiseuBanca(actePersoanaJuridica);
        ghiseuBanca.alegeTipClient(TipClient.PERSOANA_FIZICA);
        ghiseuBanca.setActe(new DocPersoanaFizica());
        ghiseuBanca.alegeTipClient(TipClient.PERSOANA_FIZICA);
        ghiseuBanca.alegeTipClient(TipClient.PERSOANA_JURIDICA);
    }
}
