public class ObservateurLog implements IObservateur<TypeGame> {

    @Override
    public void update(TypeGame obj) {
        System.out.println("Vous avez choisi " + obj.getLettre());
        System.out.println("Il vous reste " + obj.getVie() + " vie(s)");
        if (obj.getStatus() == 2) {
            System.out.println("Vous avez gagné!");
        }
    }

}
