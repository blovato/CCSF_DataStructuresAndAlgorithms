package module13_queues;

import java.util.*;

public class HomeworkM13Driver {

    public static void main(String[] args) {

//        System.out.println("*****TESTING CLIENT VIEW SPLICE");
//        QueueInterface<Integer> q1 = new LinkedQueue<Integer>();
//        QueueInterface<Integer> q2 = new LinkedQueue<Integer>();
//        splice(q1, q2);
//        System.out.println("q1 empty: \ntrue\n" + q1.isEmpty());
//        System.out.println("q2 empty: \ntrue\n" + q2.isEmpty());
//        q1.enqueue(4);
//        q1.enqueue(8);
//        q1.enqueue(9);
//        q1.enqueue(2);
//        splice(q1, q2);
//        System.out.println("\nq1 contains: \n4 8 9 2");
//        ((LinkedQueue<Integer>) q1).display();
//        System.out.println("q2 still empty: \ntrue\n" + q2.isEmpty());
//
//        q2.enqueue(1);
//        q2.enqueue(3);
//        q2.enqueue(7);
//        q2.enqueue(6);
//        q2.enqueue(3);
//        q2.enqueue(1);
//        splice(q1, q2);
//        System.out.println("\nq1 contains: \n4 8 9 2 1 3 7 6 3 1");
//        ((LinkedQueue<Integer>) q1).display();
//        System.out.println("q2 still contains: \n1 3 7 6 3 1");
//        ((LinkedQueue<Integer>) q2).display();

//        System.out.println("\n\n*****TESTING ARRAYQUEUE SPLICE");
//        ArrayQueue<String> wordQueue1 = new ArrayQueue<String>();
//        ArrayQueue<String> wordQueue2 = new ArrayQueue<String>();
//        splice(wordQueue1, wordQueue2);
//        System.out.println("wordQueue1 empty: \ntrue\n" + wordQueue1.isEmpty());
//        System.out.println("wordQueue2 empty: \ntrue\n" + wordQueue2.isEmpty());
//        wordQueue1.enqueue("a");
//        wordQueue1.enqueue("b");
//        wordQueue1.enqueue("c");
//        wordQueue1.enqueue("a");
//        wordQueue1.splice(wordQueue2);
//        System.out.println("\nwordQueue1 contains: \na b c a");
//        wordQueue1.display();
//        System.out.println("wordQueue2 still empty: \ntrue\n" + wordQueue2.isEmpty());
//        wordQueue2.enqueue("d");
//        wordQueue2.enqueue("e");
//        wordQueue2.enqueue("f");
//        wordQueue2.enqueue("e");
//        wordQueue1.splice(wordQueue2);
//        System.out.println("\nwordQueue1 contains: \na b c a d e f e");
//        wordQueue1.display();
//        System.out.println("wordQueue2 still contains: \nd e f e");
//        wordQueue2.display();
//
//        ArrayQueue<Integer> aq1 = new ArrayQueue<Integer>(4);
//        aq1.enqueue(99);
//        aq1.enqueue(99);
//        aq1.enqueue(99);
//        aq1.enqueue(4);
//        aq1.dequeue(); // these lines included so that the contents of the array wrap around for testing purposes
//        aq1.dequeue();
//        aq1.dequeue();
//        aq1.enqueue(8);
//        aq1.enqueue(9);
//        aq1.enqueue(2);
//
//        ArrayQueue<Integer> aq2 = new ArrayQueue<Integer>(4);
//        aq2.enqueue(99);
//        aq2.enqueue(99);
//        aq2.enqueue(99);
//        aq2.enqueue(1);
//        aq2.dequeue(); // these lines included so that the contents of the array wrap around for testing purposes
//        aq2.dequeue();
//        aq2.dequeue();
//        aq2.enqueue(3);
//        aq2.enqueue(7);
//        aq2.enqueue(6);
//
//        aq1.splice(aq2);
//        System.out.println("\nq1 contains: \n4 8 9 2 1 3 7 6");
//        aq1.display();
//        System.out.println("q2 still contains: \n1 3 7 6");
//        aq2.display();

//        System.out.println("\n\n*****TESTING LINKEDQUEUE SPLICE");
//        LinkedQueue<Integer> lq1 = new LinkedQueue<Integer>();
//        LinkedQueue<Integer> lq2 = new LinkedQueue<Integer>();
//        lq1.splice(lq2);
//        System.out.println("lq1 empty: \ntrue\n" + lq1.isEmpty());
//        System.out.println("lq2 empty: \ntrue\n" + lq2.isEmpty());
//        lq1.enqueue(4);
//        lq1.enqueue(8);
//        lq1.enqueue(9);
//        lq1.enqueue(2);
//        lq1.splice(lq2);
//        System.out.println("\nlq1 contains: \n4 8 9 2");
//        lq1.display();
//        System.out.println("lq2 still empty (and no exception thrown): \ntrue\n" + lq2.isEmpty());
//
//        lq2.enqueue(1);
//        lq2.enqueue(3);
//        lq2.enqueue(7);
//        lq2.enqueue(6);
//        lq1.splice(lq2);
//        System.out.println("\nq1 contains: \n4 8 9 2 1 3 7 6");
//        lq1.display();
//        System.out.println("q2 still contains: \n1 3 7 6");
//        lq2.display();
        
        DequeStack<String> x = new DequeStack<>();
        x.push("a");
        x.push("b");
        x.push("c");
        System.out.println(x.isEmpty());
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.pop());
        

    }

    // note: don't worry about generics here; i've omitted them and supressed the
    // warnings so you can focus on the queue logic
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void splice(QueueInterface firstQueue, QueueInterface secondQueue) {
        QueueInterface tempQueue = new LinkedQueue();
        while(!secondQueue.isEmpty()) {
            Object item = secondQueue.dequeue();
            tempQueue.enqueue(item);
            firstQueue.enqueue(item);
        }
        while(!tempQueue.isEmpty()) {
            secondQueue.enqueue(tempQueue.dequeue());
        }
    }
}
