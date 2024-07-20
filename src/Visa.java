class Visa implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Visa payment of " + amount);
    }
}