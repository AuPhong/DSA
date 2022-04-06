package Colection;

import java.util.Collections;
import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {

        // use LinkedList as a Colection.stack:
        LinkedList<String> data = new LinkedList<>();
        data.push("A");
        data.push("B");
        data.push("C");
        data.push("D");
        data.push("F");
        data.add(1,"E");
        data.poll();
        System.out.println(data.indexOf(data.peek()));
        //Collections.reverse(data);
        System.out.println(data);

        // use LinkedList as a queue
        LinkedList<String> data1 = new LinkedList<>();
        data1.offer("A");
        data1.offer("B");
        data1.offer("C");
        data1.offer("D");
        data1.offer("F");
        data1.remove(4);
        System.out.println(data1.indexOf("A"));;
        data1.addFirst("0");
        data1.addLast("1");



        System.out.println(data1);

    }
}
