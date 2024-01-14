package singleton;

public class Customer {

    public int customerId;
    public String firstName;
    public String lastName;
    public String phoneNumber;

    public Customer(CustomerBuilder customerBuilder) {
        this.customerId = customerBuilder.customerId;
        this.firstName = customerBuilder.firstName;
        this.lastName = customerBuilder.lastName;
        this.phoneNumber = customerBuilder.phoneNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    static class CustomerBuilder {
        private int customerId;
        private String firstName;
        private String lastName;
        private String phoneNumber;

        public static CustomerBuilder builder() {
            return new CustomerBuilder();
        }

        public CustomerBuilder customerId(int customerId) {
            this.customerId = customerId;
            return this;
        }
        public CustomerBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public CustomerBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public CustomerBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }
    }
}
