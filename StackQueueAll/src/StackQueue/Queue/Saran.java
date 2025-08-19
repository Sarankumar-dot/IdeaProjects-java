package StackQueue.Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Saran {
    public static void main(String[] args) throws Exception {
//        CustomStack s = new CustomStack(4);
//
//        s.push(10);
//        s.push(2);
//        s.push(44);
//        s.push(1);
//        s.display();
//        s.pop();
//        s.pop();
//        s.display();
//
//        DynamicStack ds = new DynamicStack(4);
//       ds.push(1);
//       ds.push(2);
//       ds.push(4);
//       ds.push(5);
//       ds.push(5);
//       ds.push(5);


        CustomQueue q = new CustomQueue();
        q.push(10);
        q.push(1);
        q.push(20);
        q.push(30);

        q.display();

        q.pop();
        System.out.println(q.front());
        System.out.println(q.front());
        q.display();


        DynamicQueue qq = new DynamicQueue(3);
        qq.push(44);
        qq.push(44);
        qq.push(44);
        qq.push(44);

        qq.display();


        ArrayList<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(2,3,4,5));
        System.out.println(list);

    }
}
