class Apartment extends Building {
    private int numRooms;

    public Apartment(String address, String name, double size, int numRooms) {
        super(address, name, size);
        this.numRooms = numRooms;
    }

    @Override
    public double calculateRent() {
        return getSize() * 20; // Example calculation
    }
}

