import java.lang.reflect.Array;
public class MyArrayList<T>{
    private final int size;
    private int actual_size = 0;
    private final T[] array;

    public MyArrayList(Class<T> c, int size){
        this.size = size;
        array = (T[]) Array.newInstance(c, size);
    }

    public T get(int index){
        return array[index];
    }

    public int size(){
        return actual_size;
    }

    public void add(T item){
        int i = 0;
        while (i < size && array[i] != null){
            ++i;
        }
        if (size == i){
            System.out.println("Not enough space");
            return;
        }
        actual_size = i;

        array[i] = item;
    }

    public void set(int index, T item){
        array[index] = item;
    }


    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("[" + array[0]);
        for(int i=1; i<actual_size; i++){
            out.append(", ").append(array[i]);
        }
        out.append("]");
        return out.toString();
    }
}