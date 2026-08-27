
public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);

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