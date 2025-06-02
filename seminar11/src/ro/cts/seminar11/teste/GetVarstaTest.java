package ro.cts.seminar11.teste;

import org.junit.Before;
import org.junit.Test;
import ro.cts.seminar11.clase.Persoana;
import ro.cts.seminar11.exceptii.ExceptieCNPAlfaNumeric;
import ro.cts.seminar11.exceptii.ExceptieCNPInexistent;

import static org.junit.Assert.*;

public class GetVarstaTest {
    Persoana persoana;

    @Before
    public void setUp() throws Exception {
        persoana=new Persoana();
    }

    @Test
    public void getVarstaRight() {
        persoana=new Persoana("Adrian","5031228234888");
        assertEquals(21, persoana.getVarsta());
    }

    @Test
    public void getVarstaRight2(){
        persoana=new Persoana("Mirel", "1891011234567");
        assertEquals(35, persoana.getVarsta());
    }
    @Test
    public void getVarstaBoundarySuperior(){
        persoana=new Persoana("Ana", "2991231345999");
        assertEquals(25, persoana.getVarsta());
    }
    @Test
    public void getVarstaBoundaryInferior(){
        persoana=new Persoana("Maria", "6000101639123");
        assertEquals(25, persoana.getVarsta());
    }

    @Test(expected = ExceptieCNPAlfaNumeric.class)
    public void getVarstaCharacterError(){
        persoana=new Persoana("Adrian", "10e010102234");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPAlfaNumeric.class)
    public void getVarstaEroareLuna(){
        persoana = new Persoana("Marius", "1991410101232");
        persoana.getVarsta();
    }
    @Test(timeout = 100)
    public void getVarstaPerformance() {
        persoana = new Persoana("Paul", "1990203456789");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInexistent.class)
    public void getVarstaCNPInexistent() {
        persoana = new Persoana("Maria", null);
        persoana.getVarsta();
    }

    @Test
    public void getVarstaCardinality0() {
        persoana = new Persoana("Ion", "5241201211210");
        assertEquals(0, persoana.getVarsta());
    }

    @Test
    public void getVarstaCardinality1() {
        persoana = new Persoana("Ion", "5240301211210");
        assertEquals(1, persoana.getVarsta());
    }

    @Test
    public void getVarstaCardinalityN() {
        persoana = new Persoana("Ion", "5040301211210");
        assertEquals(21, persoana.getVarsta());
    }
}