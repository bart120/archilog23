public class App {
    public static void main(String[] args) throws Exception {

    }

    @Log
    public static int multi(int i, int j) {
        int total = i * j;
        return total;
    }

    @Log(comments = "test")
    public static int add(int i, int j) {
        int total = i + j;
        return total;
    }

}
