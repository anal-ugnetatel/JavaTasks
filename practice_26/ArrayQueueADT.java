public class ArrayQueueADT {
    private final ArrayQueueModule queue;
    public ArrayQueueADT(ArrayQueueModule queue){
        this.queue = queue;
    }
    public Object dequeue() {
        return queue.dequeue();
    }
    public Object element() {
        return queue.element();
    }
    public void enqueue(Object obj) {
        queue.enqueue(obj);
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public void clear() {
        queue.clear();
    }
}
