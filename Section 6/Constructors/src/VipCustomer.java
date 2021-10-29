public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emaiAddress;

    public VipCustomer() {
        this("Default name", 50000.00, "default@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String name, double creditLimit, String emaiAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emaiAddress = emaiAddress;
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmaiAddress() {
        return this.emaiAddress;
    }

}
