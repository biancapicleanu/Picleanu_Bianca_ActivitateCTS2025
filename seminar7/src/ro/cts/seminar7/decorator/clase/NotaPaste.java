package ro.cts.seminar7.decorator.clase;

public class NotaPaste extends AbstractDecorator{
    public NotaPaste(Nota nota) {
        super(nota);
    }

    @Override
    void printareFelicitare() {
        System.out.println("Paste fericit");
    }
}
