import java.util.Scanner;
public class Customer {
    private int id;
    private String fstName;
    private String lstName, fatherName;
    private String address;
    private long creditNumb;
    private String balance;

    public Customer() {
        System.out.println("Enter info about customer:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer's first name:");
        fstName = scanner.nextLine();

        System.out.println("Enter customer's last name:");
        lstName = scanner.nextLine();

        System.out.println("Enter customer's father`s name:");
        fatherName = scanner.nextLine();

        System.out.println("Enter customer's address:");
        address = scanner.nextLine();

        System.out.println("Enter customer's balance:");
        balance = scanner.nextLine();

        System.out.println("Enter customer's ID:");
        id = scanner.nextInt();

        System.out.println("Enter customer's credit card number:");
        creditNumb = scanner.nextLong();
    }

    public Customer(int id, String fstName, String lstName, String fatherName, String address, long creditNumb, String balance) {
        this.id = id;
        this.fstName = fstName;
        this.lstName = lstName;
        this.fatherName = fatherName;
        this.address = address;
        this.creditNumb = creditNumb;
        this.balance = balance;
    }

    public int getId() {return id;}

    public String getFstName() {return fstName;}

    public String getLstName() {return lstName;}

    public String getFatherName() {return fatherName;}

    public String getAddress() {return address;}

    public long getCreditNumb() {return creditNumb;}

    public String getBalance() {return balance;}

    public void setId(int id) {this.id = id;}


    public void setFstName(String fstName) {this.fstName = fstName;}

    public void setLstName(String lstName) {this.lstName = lstName;}

    public void setFatherName(String fatherName) {this.fatherName = fatherName;}

    public void setAddress(String address) {this.address = address;}

    public void setCreditNumb(long creditNumb) {this.creditNumb = creditNumb;}

    public void setBalance(String balance) {this.balance = balance;}

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fstName='" + fstName + '\'' +
                ", lstName='" + lstName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", address='" + address + '\'' +
                ", creditNumb=" + creditNumb +
                ", balance=" + balance +
                '}';
    }

    static public void customerName(Customer [] customers, String fstName){
        System.out.println("Customers with name " +fstName+ ":");
        for (int i = 0; i < customers.length; i++){
            if((customers[i].fstName).equals(fstName))
                System.out.println(customers[i]);
        }
    }

    static public void creditInterval(Customer [] customers, long min, long max){
        System.out.println("\nCustomer`s credit number from " +min+ " to " +max+ ":");
        for (int i = 0; i < customers.length; i++)
            if(customers[i].creditNumb > min && customers[i].creditNumb < max)
                System.out.println(customers[i]);
    }

    static public void isDebtor(Customer [] customers){
        int debtors = 0;
        System.out.println("\nCustomers with debts:");
        for (int i = 0; i < customers.length; i++){
            if (customers[i].balance.charAt(0) == '-') {
                System.out.println(customers[i]);
                debtors++;
            }
        }
        System.out.println("Amount of debtors: " +debtors);
    }
}