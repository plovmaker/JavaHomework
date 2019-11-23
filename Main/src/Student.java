import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private int birthDate;
    private String addr;
    private int phone;
    private String institute; // Факультет
    private String major;
    private String group;
    public static List instances = new ArrayList();

    public Student(int id, String lastName, String firstName, String middleName, int birthDate, String addr, int phone, String institute, String major, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.addr = addr;
        this.phone = phone;
        this.institute = institute;
        this.major = major;
        this.group = group;
        instances.add(this);
    }



    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMiddleName() {
        return middleName;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
    public int getBirthDate() {
        return birthDate;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public String getAddr() {
        return addr;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public int getPhone() {
        return phone;
    }
    public void setInstitute(String institute) {
        this.institute = institute;
    }
    public String getInstitute() {
        return institute;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getMajor() {
        return major;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public String getGroup() {
        return group;
    }

    public String toString() {
        return "Student name: " + getFirstName() + " " + getLastName() + " was born on " + getBirthDate() + " goes to " + getInstitute();
    }

}
