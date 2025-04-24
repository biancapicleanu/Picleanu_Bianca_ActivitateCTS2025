package ro.cts.seminar7.decorator.clase;

public class NotaCraciun extends AbstractDecorator{
    public NotaCraciun(Nota nota) {
        super(nota);
    }

    @Override
    void printareFelicitare() {
        System.out.println("Craciun fericit!");
    }
}
