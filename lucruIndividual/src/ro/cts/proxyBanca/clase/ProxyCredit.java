package ro.cts.proxyBanca.clase;

public class ProxyCredit implements ICredit{
    private ICredit credit;

    public ProxyCredit(ICredit credit) {
        this.credit = credit;
    }

    public ICredit getCredit() {
        return credit;
    }

    public void setCredit(ICredit credit) {
        this.credit = credit;
    }

    @Override
    public void realizareCont(String moneda) {
        if(moneda.equalsIgnoreCase("RON")){
            credit.realizareCont(moneda);
        } else {
            System.out.println("Nu se pot face credite in valuta");
        }
    }
}
