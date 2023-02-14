class PersonAdapter extends Customer {
    private final Person person;

    public PersonAdapter(Person person) {
        super("", "");
        this.person = person;
    }

    @Override
    public String getLastName() {
        return person.getFullName().split("\\s+")[1];
    }

    @Override
    public String getFirstName() {
        return person.getFullName().split("\\s+")[0];
    }

    @Override
    public void setFirstName(String firstName) {
        person.setFullName(firstName + " " + this.getLastName());
    }

    @Override
    public void setLastName(String lastName) {
        person.setFullName(this.getFirstName() + " " + lastName);
    }
}