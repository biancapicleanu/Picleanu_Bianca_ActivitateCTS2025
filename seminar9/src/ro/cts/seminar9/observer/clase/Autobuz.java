package ro.cts.seminar9.observer.clase;

public class Autobuz extends MijlocDeTransport{
    public Autobuz(int numarLinie) {
        super(numarLinie);
    }

    @Override
    public void pleacaDeLaCapat() {
        trimiteMesaj("Autobuzul cu nuamrul "+this.getNumarLinie()+" pleaca de la capatul liniei");
    }

    public void schimbaTraseu(){
        trimiteMesaj("Autobuzul "+this.getNumarLinie()+" isi schimba traseul");
    }
}
