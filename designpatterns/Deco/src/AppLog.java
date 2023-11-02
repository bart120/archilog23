import java.lang.reflect.Method;

public class AppLog {
    public static void main(String[] args) throws Exception {
        /*
         * Class<?> cl = Class.forName("User");
         * Object instance = cl.getDeclaredConstructor().newInstance();
         * cl.getMethod("setName", String.class).invoke(instance, "TOTO");
         */
        Class<?> cl = Class.forName("App");
        Method[] tab = cl.getDeclaredMethods();
        for (Method m : tab) {
            if (m.isAnnotationPresent(Log.class)) {
                System.out.println("Méthode " + m.getName() + " avec annotation Log et le commentaire "
                        + m.getAnnotation(Log.class).comments() + ".");
            }
        }

    }
}
