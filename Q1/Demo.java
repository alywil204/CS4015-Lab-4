import java.util.List;
import java.util.stream.Collectors;

class Demo {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Bilbo Baggins"),
            new Person("Frodo Baggins"),
            new Person("Samwise Gamgee"),
            new Person("Meriadoc Brandybuck"),
            new Person("Peregrin Took")
        );

        List<Customer> customers = people.stream().map(person -> new PersonAdapter(person)).collect(Collectors.toList());

        Client client = new Client(customers);
        System.out.println(client.getCustomerInfo());

        // Change some names
        people.get(2).setFullName("Sam Gamgee");
        customers.get(3).setFirstName("Merry");
        customers.get(1).setLastName("B.");
        System.out.println(client.getCustomerInfo());
    }
}