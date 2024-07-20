class Contract {
    private Customer customer;
    private BuildingOwner owner;
    private Building building;
    private String rentalPeriod;
    private double price;
    private Payment paymentMethod;

    public Contract(Customer customer, BuildingOwner owner, Building building, String rentalPeriod, double price, Payment paymentMethod) {
        this.customer = customer;
        this.owner = owner;
        this.building = building;
        this.rentalPeriod = rentalPeriod;
        this.price = price;
        this.paymentMethod = paymentMethod;
    }

    public Customer getCustomer() {
        return customer;
    }

    public BuildingOwner getOwner() {
        return owner;
    }

    public Building getBuilding() {
        return building;
    }

    public String getRentalPeriod() {
        return rentalPeriod;
    }

    public double getPrice() {
        return price;
    }

    public Payment getPaymentMethod() {
        return paymentMethod;
    }

    public String generateContract() {
        return "Contract between " + customer.getName() + " and " + owner.getName() + " for " + building.getName() + ". Rental Period: " + rentalPeriod + ", Price: " + price;
    }
}

