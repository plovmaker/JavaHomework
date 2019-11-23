import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Student s1 = new Student(1, "Yusupov", "Suleyman", "R", 19950315, "San Diego", 1234, "SDSU", "Computer Eng", "Champions" );
        Student s2 = new Student(1, "Yusupov", "Suleyman", "R", 19950315, "San Diego", 1234, "SDSU", "Computer Eng", "Champions" );
        Student s3 = new Student(1, "Yusupov", "Suleyman", "R", 19950315, "San Diego", 1234, "SDSU", "Computer Eng", "Champions" );
        Student s4 = new Student(1, "Yusupov", "Suleyman", "R", 19950315, "San Diego", 1234, "UCSD", "Computer Eng", "Champions" );

        List <Student> studns = new ArrayList<Student>();
        studns.add(s1);
        studns.add(s2);
        studns.add(s3);
        studns.add(s4);

        for(int i = 0; i < studns.size(); i++) {
            if(studns.get(i).getInstitute() == "UCSD") {
               System.out.println(studns.get(i).toString());
            }
        }

        List a = Student.instances;
        System.out.print(s1.toString());
    }
}
