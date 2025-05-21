package ro.cts.templateSpital.clase;

public abstract class AInternare {
    protected abstract void analizareStare();
    protected abstract void disponibilitateSalon();
    protected abstract void emitereFisaInternare();
    public final void procesInternare(){
        analizareStare();
        disponibilitateSalon();
        emitereFisaInternare();
    }
}
