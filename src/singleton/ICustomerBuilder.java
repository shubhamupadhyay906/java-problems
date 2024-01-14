package singleton;

public interface ICustomerBuilder {

    ICustomerBuilder customerId(int customerId);
    ICustomerBuilder firstName(String firstName);
    ICustomerBuilder lastName(String lastName);
    ICustomerBuilder phoneNumber(String phoneNumber);

}
