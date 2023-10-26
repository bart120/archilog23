import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Game<T extends TypeGame> extends JFrame {
    private JLabel label = new JLabel();
    private JTextField textField = new JTextField();
    private JButton button = new JButton();
    private String mot = "architecture";
    private int status = 0;
    private int vie = 10;
    private StringBuilder motTemporaire = new StringBuilder("____________");

    private T tg;

    private List<IObservateur<TypeGame>> observateurs = new ArrayList<>();

    public Game(T typeGame) {
        this.tg = typeGame;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(800, 600);

        /* On initialise notre JLabel */
        Font police = new Font("DS-digital", Font.TYPE1_FONT, 30);
        this.label.setFont(police);
        this.label.setHorizontalAlignment(JLabel.CENTER);
        this.label.setText("Pendu");

        this.button.setText("Tester");
        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char lettre = textField.getText().charAt(0);
                boolean state = false;
                for (int i = 0; i < mot.length(); i++) {
                    if (mot.charAt(i) == lettre) {
                        state = true;
                        motTemporaire.setCharAt(i, lettre);
                    }
                }
                if (!state) {
                    vie--;
                    if (vie == 0) {
                        status = 2;
                    }
                }
                if (motTemporaire.toString().equals(mot)) {
                    status = 1;
                }
                textField.setText("");
                update(lettre);
            }
        });

        /* On ajoute le JLabel et notre JFrame */
        this.getContentPane().add(this.label, BorderLayout.PAGE_START);
        this.getContentPane().add(this.textField, BorderLayout.CENTER);
        this.getContentPane().add(this.button, BorderLayout.PAGE_END);
    }

    private void update(char lettre) {
        for (IObservateur<TypeGame> obs : observateurs) {
            tg.setLettre(Character.toString(lettre));
            tg.setMotTemporaire(motTemporaire.toString());
            tg.setStatus(status);
            tg.setVie(vie);
            obs.update(tg);
        }
    }

    public void addObservateur(IObservateur<TypeGame> obs) {
        this.observateurs.add(obs);
    }

    public void removeObservateur(IObservateur<TypeGame> obs) {
        this.observateurs.remove(obs);
    }

}
