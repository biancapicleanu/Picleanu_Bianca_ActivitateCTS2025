package ro.cts.seminar10.template.clase;

public class MetrouSpecial extends AMetrou{

    @Override
    public void opresteStatia1() {
        System.out.println("Metroul a oprit in statia 1");
    }

    @Override
    public void opresteStatia2() {
        System.out.println("Metroul a oprit in statia 2");
    }

    @Override
    public void opresteStatia3() {
        System.out.println("Metroul nu a oprit in statia 3, statie in renovare");
    }

    @Override
    public void opresteStatia4() {
        System.out.println("Metroul a oprit in statia 4");
    }

    @Override
    public void opresteStatia5() {
        System.out.println("Metroul nu a oprit in statia 5, statie in renovare");
    }

}
