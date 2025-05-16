package ro.cts.strategyBanca.clase;

public class GhiseuBanca {
    private IActe acte;

    public GhiseuBanca(IActe acte) {
        this.acte = acte;
    }

    public GhiseuBanca() {
        this.acte=new DocPersoanaFizica();
    }

    public void setActe(IActe acte){
        this.acte=acte;
    }

    public void alegeTipClient(TipClient tipClient){
        this.acte.cereActe(tipClient);
    }
}
