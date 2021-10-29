public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // Account bobsAccount = new Account(); // ("12345", 100.0, "Bob Brown",
        // "myemail@bob.com", "(91) 123-4567");
        // System.out.println(bobsAccount.getNumber());
        // System.out.println(bobsAccount.getBalance());
        // // bobsAccount.setNumber("12345");
        // // bobsAccount.setBalance(100.0);
        // // bobsAccount.setCustomerName("Bob Brown");
        // // bobsAccount.setCustomerEmailAddress("myemail@bob.com");
        // // bobsAccount.setCustomerPhoneNumber("(91) 123-4567");

        // bobsAccount.withdrawal(100.0);

        // bobsAccount.deposit(50.0);
        // // System.out.println("#####");
        // bobsAccount.withdrawal(100.0);

        // bobsAccount.deposit(51.0);
        // bobsAccount.withdrawal(100.0);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        // VipCustomer person1 = new VipCustomer();
        // System.out.println(person1.getName());

        // VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        // System.out.println(person2.getName());

        // VipCustomer person3 = new VipCustomer("Thanos", 100.00, "Thanos@gmail.com");
        // System.out.println(person3.getName());
        // System.out.println(person3.getEmaiAddress());
    }
}
