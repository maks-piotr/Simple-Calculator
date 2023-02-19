package calculator;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/** Główny panel. */
public class MainPanel extends JPanel {

    /** Konstruktor głównego panelu. */
    public MainPanel() {
        /* Referencja na logikę kalkulatora. */
        TheCalculator calculator = new TheCalculator();
        /* Frame z outputem kalkulatora. */
        Output output = new Output(calculator);
        /* Frame z inputem kalkulatora. */
        Input input = new Input(calculator, output);
        this.setLayout(new BorderLayout());
        // this.setLayout(new GridLayout(2,1));
        this.add(output, BorderLayout.NORTH);
        this.add(input, BorderLayout.SOUTH);

    }

}
