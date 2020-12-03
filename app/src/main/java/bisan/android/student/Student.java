package bisan.android.student;

public class Student {
    private int id;
    private String name;
    private int average;
    Student(int id, String name, int average){
        this.id=id;
        this.name = name;
        this.average=average;
    }
    public int getId(){return id;}
    public int getAverage(){return average;}
    public String getName(){return name;}

    @Override
    public String toString(){return name;}
}


