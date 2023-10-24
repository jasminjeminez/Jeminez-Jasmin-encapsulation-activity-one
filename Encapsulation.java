public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person("Jasmin", "Carcallas", "Jeminez", 21, "March 12, 2002", "Cebu City");
        p.displayCredentials();
    }
}

class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String birthday;
    private String address;

    Person(String firstName, String middleName, String lastName, int age, String birthday, String address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
    }

    // Getters and setters (I've shortened the comments for brevity)
    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getFirstName() {
        return firstName;
    }

    void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    String getMiddleName() {
        return middleName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String getLastName() {
        return lastName;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    String getBirthday() {
        return birthday;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getAddress() {
        return address;
    }

    public void displayCredentials() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Middle Name: " + getMiddleName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Birthday: " + getBirthday());
        System.out.println("Address: " + getAddress());
    }
}