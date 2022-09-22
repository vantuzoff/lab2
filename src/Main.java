public class Main {
    public static void main(String[] args) {
        Customer [] customers = new Customer[4];

        for (int i = 0; i < customers.length; i++){
            customers[i] = new Customer();
        }
        Customer.customerName(customers,"Walter");
        Customer.creditInterval(customers, 456456, 74674787);
        Customer.isDebtor(customers);
    }
}