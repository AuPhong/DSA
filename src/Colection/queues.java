package Colection;

import java.util.*;


public class queues {

    // Queue = FIFO data structure. First-In First-Out
    // A collection designed elements prior to processing
    // Linear data structure
    // add = enqueue, offer()
    // remove = dequeue, poll()



    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        // remove the first element, this method return the first element
        System.out.println(queue.poll());

        // this method return the first element of array without removing it
        System.out.println(queue.peek());

        // check if queue is empty
        System.out.println(queue.isEmpty());

        // return queue size
        System.out.println(queue.size());

        // check if element exist in array
        System.out.println(queue.contains("Harold"));

        System.out.println(queue);


        // Priority Queue
        // Similar to Queue but serves elements with the highest priorities first before elements with lower priority

        Queue<Double> queue1 = new PriorityQueue<>(Collections.reverseOrder());
        queue1.offer(3.0);
        queue1.offer(2.5);
        queue1.offer(4.0);
        queue1.offer(1.5);
        queue1.offer(2.0);

        while (!queue1.isEmpty()){
            System.out.println(queue1.poll());
        }

    }
}
