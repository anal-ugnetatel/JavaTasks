public class QueueTest {
    public static void main(String[] args) {
        ArrayQueueModule aqm = ArrayQueueModule.getInstance();
        aqm.enqueue("test text1");
        aqm.enqueue("test text2");
        aqm.enqueue("test text3");
        System.out.println(aqm.dequeue());
        System.out.println(aqm.isEmpty());
        System.out.println();

        ArrayQueueADT adt = new ArrayQueueADT(aqm);
        System.out.println(adt.element());
        System.out.println(adt.isEmpty());
        adt.clear();
        System.out.println(adt.isEmpty());
        System.out.println();

        ArrayQueue aq = new ArrayQueue();
        aq.enqueue("test text3");
        System.out.println(aq.element());
        System.out.println(aq.dequeue());
        System.out.println(aq.isEmpty());
        System.out.println();
    }
}