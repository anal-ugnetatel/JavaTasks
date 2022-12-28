public class ArrayQueue {
    private final ArrayQueueModule queue;

    public ArrayQueue(){
        this.queue = ArrayQueueModule.getInstance();
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
    public boolean clear() {
        return queue.clear();
    }
}