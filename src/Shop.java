class Shop extends Building {
    private int floorNumber;

    public Shop(String address, String name, double size, int floorNumber) {
        super(address, name, size);
        this.floorNumber = floorNumber;
    }

    @Override
    public double calculateRent() {
        return getSize() * 25 + floorNumber * 5; // Example calculation
    }
}

