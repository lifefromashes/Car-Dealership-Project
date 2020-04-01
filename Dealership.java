public class Dealership {

    public static void main(String[] args) {

        Customer customer1 = new Customer();

        customer1.setName("Tom");
        customer1.setAddress("1234 Liberty Way");
        customer1.setCashOnHand(12000);

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleMake("Honda");
        vehicle.setVehicleModel("Accord");
        vehicle.setPrice(10000);

        Employee employee = new Employee();

        customer1.purchaseCar(vehicle, employee, true);

        Customer cust2 = new Customer("Becca", "1872 SunneyVale Blvd", 23000);

        Vehicle veh2 = new Vehicle(25000, "Camaro", "Chevy");

        cust2.purchaseCar(veh2, employee, false);

        boolean value = veh2.equals(vehicle);
        System.out.println(value);





    }
}
