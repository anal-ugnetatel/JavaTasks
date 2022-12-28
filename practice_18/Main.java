public class Main {
    public void exceptionDemo() {
        // в блоке try код, в котором может произойти исключение
        try {
            System.out.println(2 / 0);
        // в блоке catch код по обработке исключения
        } catch (Exception e) {
            System.out.println("поймали исключение Exception");
        // в блоке finally код, который является необязательным, но при наличии выполняется в любом случае
        // независимо от того что произошло в блоке try.
        } finally {
            System.out.println("это в любом случае будет в консоли >_<");
        }
    }

    public static void main(String[] args) {
        Main task = new Main();
        task.exceptionDemo();
    }
}
