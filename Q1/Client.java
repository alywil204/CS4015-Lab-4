import java.util.List;

class Client {
    private List<Customer> customers;

    public Client(List<Customer> customers) {
        this.customers = customers;
    }

    public String getCustomerInfo() {
        String info = "";
        for (Customer customer : customers) {
            info += customer + "\n";
        }
        return info;
    }
}