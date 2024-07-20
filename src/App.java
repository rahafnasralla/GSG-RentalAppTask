public class App {
    public static void main(String[] args) {
        BuildingOwner owner = new BuildingOwner("Rahaf Nasrallah", "Rahaf@gmail.com.com");
        Customer customer = new Customer("Jack Hamilton", "jack@gmail.com");

        Apartment apartment = new Apartment("15 St", "Flowers Apartment", 80.0, 3);
        owner.addBuilding(apartment);

        Payment paymentMethod = new PayPal();
        Contract contract = new Contract(customer, owner, apartment, "1 year", apartment.calculateRent(), paymentMethod);

        customer.rentBuilding(contract);
        customer.payRent(contract, paymentMethod);

        System.out.println(contract.generateContract());
    }
}