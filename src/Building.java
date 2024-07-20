abstract class Building {
    private String address;
    private String name;
    private double size;

    public Building(String address, String name, double size) {
        this.address = address;
        this.name = name;
        this.size = size;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public String getDetails() {
        return "Name: " + name + ", Address: " + address + ", Size: " + size + " sqm";
    }

    public abstract double calculateRent();
}