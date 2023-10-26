public class ObservateurLog implements IObservateur {

    @Override
    public void update(String lettre, String motTemporaire, int vie, int status) {
        System.out.println("Vous avez choisi " + lettre);
        System.out.println("Il vous reste " + vie + " vie(s)");
        if (status == 2) {
            System.out.println("Vous avez gagné!");
        }
    }

}
