package classes;

class Subject {
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subId, String name, int maxMarks, int marksObtain) {
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtain = marksObtain;
    }

    public String toString() {
        return "Subject ID : " + subId + "\nSubject Name : " + name + "\nMax Marks : " + maxMarks + "\nMarks Obtained : " + marksObtain;
    }
}

class ArrayOfObjects {
    public static void main(String[] args)
    {
        Subject subs[] = new Subject[3];
        subs[0] = new Subject("C","C",100,100);
        subs[1] = new Subject("CPP","C++",100,100);
        subs[2] = new Subject("J","Java",100,100);
        for(int i = 0; i < 3; i++) System.out.println(subs[i].toString());
    }
}