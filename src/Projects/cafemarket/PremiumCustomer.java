package Projects.cafemarket;

public class PremiumCustomer extends  Customer{

    public PremiumCustomer(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public double getDiscount() {
        return 0.20;
    }
}
