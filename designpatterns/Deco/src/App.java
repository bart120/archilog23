import java.lang.reflect.Field;

public class App {
    public static void main(String[] args) throws Exception {

        User u = new User();
        u.setName("Leponge");
        u.setFirstname("Bob");

        boolean test = IsValid(u);
        if (test) {
            System.out.println("Le User est valide.");
        } else {
            System.out.println("Le User n'est pas valide.");
        }
    }

    private static boolean IsValid(Object o) {
        Class<?> cl = o.getClass();
        boolean isValid = true;
        for (Field f : cl.getDeclaredFields()) {
            if (f.isAnnotationPresent(Required.class)) {
                Required req = f.getAnnotation(Required.class);
                f.setAccessible(true);
                try {
                    String value = (String) f.get(o);
                    if (!(value != null && !value.isEmpty())) {
                        isValid = false;
                        if (f.isAnnotationPresent(Display.class)) {
                            Display disp = f.getAnnotation(Display.class);
                            String message = String.format(req.errorMessage(), disp.name());
                            System.out.println(message);
                        } else {
                            String message = String.format(req.errorMessage(), f.getName());
                            System.out.println(message);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return isValid;
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
