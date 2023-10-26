import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ObservateurFenetre extends JFrame implements IObservateur<TypeGame> {
    private JLabel labelMot = new JLabel();
    private JLabel labelVie = new JLabel();

    public ObservateurFenetre() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(800, 600);
        Font police = new Font("DS-digital", Font.TYPE1_FONT, 30);
        this.labelMot.setFont(police);
        this.labelMot.setHorizontalAlignment(JLabel.CENTER);
        this.labelVie.setFont(police);
        this.labelVie.setHorizontalAlignment(JLabel.CENTER);
        this.getContentPane().add(this.labelMot, BorderLayout.PAGE_START);
        this.getContentPane().add(this.labelVie, BorderLayout.CENTER);
        this.setVisible(true);
    }

    @Override
    public void update(TypeGame obj) {
        this.labelMot.setText(obj.getMotTemporaire());
        this.labelVie.setText(Integer.toString(obj.getVie()));
    }

}
