package ro.cts.seminar5.clase;

public class PacientBuilder implements AbstractBuilder{
    private Pacient pacient;

    public PacientBuilder(String numePacient) {
        this.pacient = new Pacient(numePacient,false, false, false, false, "Alt pacient");
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil){
        pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }
    public PacientBuilder setAreMicDejun(boolean areMicDejun){
        pacient.setAreMicDejun(areMicDejun);
        return this;
    }
    public PacientBuilder setArePapuciDeCamera(boolean arePapuciDeCamera){
        pacient.setArePapuciDeCamera(arePapuciDeCamera);
        return this;
    }
    public PacientBuilder setAreHalat(boolean areHalat){
        pacient.setAreHalat(areHalat);
        return this;
    }
    public PacientBuilder setNumePrieten(String numePrieten){
        pacient.setNumePacient(numePrieten);
        return this;
    }

    @Override
    public Pacient getPacient() {
        return pacient;
    }
}
