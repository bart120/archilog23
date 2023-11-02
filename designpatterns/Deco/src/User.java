public class User {

    @Required(errorMessage = "%s obligatoire")
    private String name;

    @Required(errorMessage = "%s obligatoire")
    @Display(name = "Prénom")
    private String firstname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
