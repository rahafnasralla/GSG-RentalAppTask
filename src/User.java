abstract class User {
    private String name;
    private String contactDetails;

    public User(String name, String contactDetails) {
        this.name = name;
        this.contactDetails = contactDetails;
    }

    public String getName() {
        return name;
    }

    public String getContactDetails() {
        return contactDetails;
    }
}

