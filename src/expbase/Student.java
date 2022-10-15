package expbase;

public class Student {
    String firstname;
    String lastname;
    String city;
    int age;

    public Student(){
        this.firstname = "Jan";
        this.lastname = "kowalski";
    }

    public Student(String firstname, String lastname, String city, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.age = age;
    }
    public void printStatusInfo() {
        System.out.println(this.firstname + " " + this.lastname);
    }
}

