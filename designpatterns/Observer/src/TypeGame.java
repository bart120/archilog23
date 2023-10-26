public class TypeGame {
    private String lettre;
    private String motTemporaire;
    private int vie;
    private int status;

    public TypeGame(int vie, int status) {
        this.vie = vie;
        this.status = status;
    }

    public String getLettre() {
        return lettre;
    }

    public void setLettre(String lettre) {
        this.lettre = lettre;
    }

    public String getMotTemporaire() {
        return motTemporaire;
    }

    public void setMotTemporaire(String motTemporaire) {
        this.motTemporaire = motTemporaire;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
