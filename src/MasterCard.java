class MasterCard implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing MasterCard payment of " + amount);
    }
}