public class App {
    public static void main(String[] args) throws Exception {
        Game<TypeGame> game = new Game<TypeGame>(new TypeGame(10, 0));

        IObservateur<TypeGame> obs1 = new ObservateurFenetre();
        game.addObservateur(obs1);

        ObservateurLog obs2 = new ObservateurLog();
        game.addObservateur(obs2);

        game.setVisible(true);

    }
}
