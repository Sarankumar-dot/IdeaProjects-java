package oop6.Comparable;

public class Student implements Comparable<Student> {
    int num;
    float marks;

    public  Student(int n , float m){
        this.num = n;
        this.marks = m;
    }

    @Override
    public String toString() {
        return marks + " ";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.marks - o.marks);
        // diff = 0 both are equal
        // diff < 0 o is bigger else  > 0 this is bigger
        return diff;
    }
}
