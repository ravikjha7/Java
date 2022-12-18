package abstraction;

class Exams {
    public int marks;
    Exams () {
        marks = 100;
        System.out.println("Hey! I am The Non Parametrised Constructor !!!");
    }

    Exams (int a) {
        marks = a;
        System.out.println("Hey! I am The Parametrised Constructor !!!");
    }

    static class PLExams2 {
        void display() {
            System.out.println("I am a Method Defined Inside a Inner Static Class");
        }
    }

    class PLExams {
        void display() {
            System.out.println("I am a Method Defined Inside a Inner Class");
        }
    }
}

public class Practical1 {
    public static void main(String[] args) {
        Exams e = new Exams();
        System.out.println("Marks For Object Initialised with Non Parametrised Constructor : " + e.marks);

        Exams e2 = new Exams(95);
        System.out.println("Marks For Object Initialised with Parametrised Constructor : " + e.marks);

        Exams.PLExams2 ex = new Exams.PLExams2();
        ex.display();

        Exams e3 = new Exams();
        Exams.PLExams e4 = e3.new PLExams();
        e4.display();
    }
}
