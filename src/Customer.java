import java.util.ArrayList;
import java.util.List;

class Customer extends User {
    private List<Contract> rentedBuildings;

    public Customer(String name, String contactDetails) {
        super(name, contactDetails);
        this.rentedBuildings = new ArrayList<>();
    }

    public void rentBuilding(Contract contract) {
        rentedBuildings.add(contract);
    }

    public void payRent(Contract contract, Payment payment) {
        payment.processPayment(contract.getPrice());
    }

    public List<Contract> getRentedBuildings() {
        return rentedBuildings;
    }
}

