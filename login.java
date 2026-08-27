class Student {
    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Prajwal";
        s1.marks = 90;
        s1.display();
    }
}