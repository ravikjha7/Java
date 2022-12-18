package staticandfinal;

import java.util.*;

class StudentRoll {
    private String rollNo;

    private static int count = 1;

    private String assignRollNo() {
        Date d = new Date();

        String rno = (d.getYear() + 1900) + "BTECS000" + count;
        count++;

        return rno;
    }

    public StudentRoll() {
        rollNo = assignRollNo();
    }

    public String getRollNo() {
        return rollNo;
    }
}

public class StudentRollNo {
    public static void main(String[] args) {
        StudentRoll s = new StudentRoll();
        System.out.println(s.getRollNo());

        StudentRoll s1 = new StudentRoll();
        System.out.println(s1.getRollNo());

        StudentRoll s2 = new StudentRoll();
        System.out.println(s2.getRollNo());
    }
}
