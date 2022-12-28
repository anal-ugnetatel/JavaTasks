import java.util.Stack;

public class practice16 {
    Stack<Integer> firstPlayer, secondPlayer;

    public practice16(String firstPlayer, String secondPlayer) {
        this.firstPlayer = new Stack<>();
        this.secondPlayer = new Stack<>();
        for(int i = 4; i >= 0; i --){
            this.firstPlayer.push(Integer.parseInt(firstPlayer.substring(i, i+1)));
            this.secondPlayer.push(Integer.parseInt(secondPlayer.substring(i, i+1)));
        }
    }

    private void pushBack(Stack<Integer> s, Integer item){
        Stack<Integer> ns = new Stack<>();
        while (!s.isEmpty())
            ns.push(s.pop());
        s.push(item);
        while (!ns.isEmpty())
            s.push(ns.pop());
    }

    public String play(){
        int count = 0;
        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty() && count <= 106){
            if(firstPlayer.peek() > secondPlayer.peek()
                    && secondPlayer.peek() != 0){
                pushBack(firstPlayer, firstPlayer.pop());
                pushBack(firstPlayer, secondPlayer.pop());
            }else{
                pushBack(secondPlayer, firstPlayer.pop());
                pushBack(secondPlayer, secondPlayer.pop());
            }
            count++;
        }
        String res = "";
        if(count >= 106) res += "botva";
        else {
            if(firstPlayer.isEmpty()) res += "second ";
            else res += "first ";
            res += count;}
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new practice16("33333", "11111").play());
        System.out.println(new practice16("13468", "97520").play());
        System.out.println(new practice16("69578", "23140").play());
    }
}
