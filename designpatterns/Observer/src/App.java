public class App {
    public static void main(String[] args) throws Exception {
        Game game = new Game();

        IObservateur obs1 = new ObservateurFenetre();
        game.addObservateur(obs1);

        ObservateurLog obs2 = new ObservateurLog();
        game.addObservateur(obs2);

        game.setVisible(true);

    }
}
