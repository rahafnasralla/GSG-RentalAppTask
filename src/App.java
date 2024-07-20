public class App {
    public static void main(String[] args) {
        BuildingOwner owner = new BuildingOwner("John Doe", "john@example.com");
        Customer customer = new Customer("Jane Smith", "jane@example.com");

        Apartment apartment = new Apartment("123 Main St", "Sunny Apartment", 80.0, 3);
        owner.addBuilding(apartment);

        Payment paymentMethod = new PayPal();
        Contract contract = new Contract(customer, owner, apartment, "1 year", apartment.calculateRent(), paymentMethod);

        customer.rentBuilding(contract);
        customer.payRent(contract, paymentMethod);

        System.out.println(contract.generateContract());
    }
}