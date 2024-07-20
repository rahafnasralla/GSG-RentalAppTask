class House extends Building {
    private double gardenSize;

    public House(String address, String name, double size, double gardenSize) {
        super(address, name, size);
        this.gardenSize = gardenSize;
    }

    @Override
    public double calculateRent() {
        return getSize() * 15 + gardenSize * 10; // Example calculation
    }
}