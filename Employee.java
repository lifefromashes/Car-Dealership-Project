public class Employee {
    private double amount;
    private String employeeName;

    public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
        if(finance == true) {
            double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
            runCreditHistory(customer, loanAmount);
        } else if(vehicle.getPrice() <= customer.getCashOnHand()) {
            //customer pays in cash
            processTransaction(customer, vehicle);
        } else {
            System.out.println("Customer will need more money to purchase vehicle: " + vehicle);
        }
    }

    public void runCreditHistory(Customer customer, double loanAmount) {
        System.out.println("Ran credit History for Customer " + customer.getName());
        System.out.println("Customer has been approved to purchase vehicle.");
    }

    public void processTransaction(Customer customer, Vehicle vehicle){
        System.out.println("Customer: " + customer.getName() + " has purchased the vehicle: " + vehicle +
                " for the price of: " + vehicle.getPrice());
    }

    public String getEmployeeName() {
        return this.employeeName;
    }
}
