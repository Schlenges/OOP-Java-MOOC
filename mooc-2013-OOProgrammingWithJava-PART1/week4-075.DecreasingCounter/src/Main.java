public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(1);

        counter.printValue();
        counter.decrease();
        counter.decrease();
        counter.printValue();
    }
}
