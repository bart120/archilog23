public class App {
    public static void main(String[] args) throws Exception {

        User u = new User();
        u.setName("");

        boolean test = IsValid(u);

    }

    private static boolean IsValid(Object o) {
        // return si l'objet est valide et afficher en console si il y a des erreurs.
        return false;
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
