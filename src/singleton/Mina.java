package singleton;

public class Mina {

    public static void main(String[] args) {
        Customer customer = Customer.CustomerBuilder.builder()
                .customerId(1)
                .firstName("shubham")
                .phoneNumber("213").build();

        System.out.println(customer);
    }
}
