import facto.Factory;
import facto.IComputer;

public class App {
    public static void main(String[] args) throws Exception {
        Factory f = new Factory();
        IComputer c = f.createComputer("SERVER", 0, 0, 0);
        System.out.println(c.getRam());
    }
}
