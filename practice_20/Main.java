public class Main {


    public static <E> void  ptr  (String s, E [] arr){

        AnyType <E> ptr = new AnyType<> ();
        ptr.setArr(arr);

        System.out.print(s + "  ");

        for(int i = 0; i< ptr.getLength(); i++)
            System.out.print(ptr.getArrIndex(i)+" ");

        System.out.println();
    }
    public static void main(String[] args) {
        //20.1
        Integer[] numbers = {0, 1, 2, 3, 4};
        Conversion<Integer> listInt = new Conversion<>(numbers);
        listInt.showList();

        String[] lines = {"line", "one", "plus", "twenty one", "ok", "and"};
        Conversion<String> listStr = new Conversion<>(lines);
        listStr.showList();
        //20.2
        String [] s = {"testing", "the","array"};
        ptr("String:\t" , s);

        Integer [] integer = {1, 2, 4, 3};
        ptr("Integer:\t" , integer);

        Double [] ad = {1.2, 1.5, 6.7};
        ptr("Double:\t" , ad);
        //20.2
        Integer[] numbers1 = {1, 2, 4, 3};
        TakeFromArray<Integer> array = new TakeFromArray<>(numbers1);
        System.out.print(array.getElement(1));
        System.out.println();

    }
}



