package final_exam;

public class Driver {

    public static void main(String[] args) {
//        QueueInterface<Integer> testQ = new ArrayQueue<>();
//        testQ.enqueue(4);
//        testQ.enqueue(-3);
//        testQ.enqueue(2);
//        testQ.enqueue(-1);
//        System.out.println("Front[4, -3, 2, -1]Back");
//        ListInterface<Integer> res = removeNegativesFromQueue(testQ);
//        System.out.print("result queue: ");
//        for (int i = 0; i < 2; i++) {
//            System.out.print(testQ.dequeue() + ", ");
//        }
//        System.out.println("");
//        System.out.print("result list: ");
//        for (int i = 1; i < 3; i++) {
//            System.out.print(res.getEntry(i) + ", ");
//        }

        LinkedStack<String> testStack = new LinkedStack<>();
        testStack.push("a");
        testStack.push("b");
        testStack.push("c");
        int count = testStack.countEntries("a");
        System.out.println(count);
    }

    public static ListInterface<Integer> removeNegativesFromQueue(QueueInterface<Integer> queue) {
        ListInterface<Integer> list = new AList();
        QueueInterface<Integer> tempQueue = new ArrayQueue<>();
        while(!queue.isEmpty()) {
            int item = queue.dequeue();
            if (item >= 0) {
                list.add(item);
            } else {
                tempQueue.enqueue(item);
            }
        }
        while (!tempQueue.isEmpty()) {
            queue.enqueue(tempQueue.dequeue());
        }
        return list;
    }
}
