public interface Queue {
    Object dequeue();
    Object element();
    void enqueue(Object obj);
    boolean isEmpty();
    boolean clear();
}