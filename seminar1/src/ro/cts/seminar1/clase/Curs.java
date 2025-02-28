package ro.cts.seminar1.clase;

import ro.cts.seminar1.interfete.IPersoana;
import ro.cts.seminar1.interfete.IPredabil;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private IPredabil profesor; //ca sa fie asistent sau profesor nu si
    private List<Student> listaStudenti;

    public String getNumeCurs() {
        return numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public Curs(String numeCurs, int credite, IPredabil profesor, List<Student> listaStudenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.listaStudenti = listaStudenti;
    }

    public Curs() {
        numeCurs="CTS";
        credite=5;
        profesor= (IPredabil) new Profesor();
        listaStudenti=new ArrayList<>();
    }

    public IPredabil getProfesor() {
        return profesor;
    }

    public List<Student> getListaStudenti() {
        return listaStudenti;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public void setProfesor(IPredabil profesor) {
        this.profesor = profesor;
    }

    public void setListaStudenti(List<Student> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }

    public void afisareDetalii()
    {
        StringBuilder sb=new StringBuilder("La cursul").append(this.numeCurs).append("cu ")
                .append(this.credite).append("puncte credit")
                .append("predat de").append(((IPersoana)this.profesor).getNume())
                .append("are").append(listaStudenti.size()).append("studenti");
        System.out.println(sb);
    }
    public void sustineExamen(String data){
        StringBuilder sb=new StringBuilder("Pe data de ").append(data)
                .append(" cadru didactic ").append(((IPersoana)this.profesor).getNume())
                .append(" sustine examen cu urmatorii studenti ");
        System.out.println(sb.toString());
        listaStudenti.forEach(s->System.out.println(s.getNume()));
    }
}
