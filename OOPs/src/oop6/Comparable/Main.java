package oop6.Comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student saran = new Student(2,89.66f);
        Student kunal = new Student(22,86.88f);
        Student ali = new Student(1,87.66f);
        Student malik = new Student(3,77.66f);
        Student irul = new Student(4,99.66f);


        // inorder to solve this problem you have to implement comparable interface
        if(kunal.compareTo(saran) == 0){
            System.out.println("both has same marks");
        } else if (kunal.compareTo(saran) < 0) {
            System.out.println("saran has more marks");
        }else {
            System.out.println("kunal has more marks");
        }

        Student[] list = {saran , kunal , ali , malik , irul};

        System.out.println(Arrays.toString(list));

        // also you can use comparator in sort method
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.marks - o2.marks);
            }
        });
        
        // you can replace it with lambda expressions as well
        Arrays.sort(list, (o1, o2) -> (int) -(o1.marks - o2.marks)); // - is used to print in descending order

        System.out.println(Arrays.toString(list));



    }
}
