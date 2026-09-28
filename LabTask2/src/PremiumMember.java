public class PremiumMember extends Member {
    private double annualFee;
    public PremiumMember(String name, double anualFee){
        super(name);
        this.annualFee = anualFee;
    }
    @Override
    public void describe(){
        System.out.println("Member ID: " + getMemberId());
        System.out.println("Name: " + getName());
        System.out.println("Book Limit: " + getMaxBook());
        System.out.println("Annual Fee: " + annualFee);
    }
    @Override
    public int getMaxBook(){
        return (int) (annualFee/1000);
    }

    public double getAnnualFee() {
        return annualFee;
    }
}
