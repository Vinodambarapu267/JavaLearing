package OOP;

public class ConstructorTest {
    public static void main(String[] args) {
        Customer customer1;
        customer1 = new  Customer();
        customer1.displayDetails();
        Customer customer3 = new Customer(222,"bhanu","+91932449494","21mg10303","sfsgdg@gmail.com",21000,(byte)23);
        customer3.displayDetails();

    }
}
