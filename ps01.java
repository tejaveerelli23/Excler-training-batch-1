public class ps01 {

    private int id;
    private String firstName;
    private String lastName;
    private String address;

    public ps01() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.address = "";
    }

    public ps01(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {

        ps01 emp1 = new ps01();
        System.out.println("Default Constructor:");
        System.out.println(
                "ID: " + emp1.getId() + ", Full Name: " + emp1.getFullName() + ", Address: " + emp1.getAddress());

        ps01 emp2 = new ps01(1, "John", "Doe", "123 Main St");
        System.out.println("\nParameterized Constructor:");
        System.out.println(
                "ID: " + emp2.getId() + ", Full Name: " + emp2.getFullName() + ", Address: " + emp2.getAddress());
    }
}
