// CommercialClass
public class CommercialClass {

    private String name;
    private int val=5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void calculateBill(int n){
        System.out.println("Bill amount = "+val*n+" Rs");
    }

}

// DomesticClass
public class DomesticClass extends CommercialClass{

    private double val=2.5;
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void calculateBill(int n) {
        int bill=(int)val*n;
       // System.out.printf("%.0f Rs",val*n);
        System.out.println("Bill amount = "+bill+"Rs");
    }

    public static void main(String[] args){
        CommercialClass cc=new CommercialClass();
        cc.setName("Raj Kumar");
        System.out.println("Customer: "+cc.getName());
        cc.calculateBill(100);
        DomesticClass dc=new DomesticClass();
        dc.setName("Lalith Raj");
        System.out.println("Customer: "+dc.getName());
        dc.calculateBill(100);
    }
}
