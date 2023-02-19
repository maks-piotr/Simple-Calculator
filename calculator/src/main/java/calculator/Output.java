package calculator;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class Output extends JPanel {

    /** Referencja na logikę kalkulatora.*/
    private TheCalculator calculator;
    /** Label z bufferem. */
    private JLabel bufferLabel;
    /** Label z aktualną liczbą. */
    private JLabel currentLabel;
    /** Label seperujący. */
    private JLabel separator;
    /** Aktualizacja wyświetlanych liczb. */
    public void updateOutput() {
        bufferLabel.setText(calculator.getBuffer());
        currentLabel.setText(calculator.getCurrent());
        revalidate();
        repaint();
    }
    /** Wielkość czcionki dla seperatora. */
    public static final int SEPERATOR_SIZE = 15;
    /** Wielkość czcionki dla wyświetlanych liczb. */
    public static final int FONT_SIZE = 40;
    /** Pierwszy wymiar layoutu. */
    public static final int GRID_SIZE1 = 3;
    /** Drugi wymiar layoutu. */
    public static final int GRID_SIZE2 = 24;
    /** Konstruktor Outputu.
     * @param calculatorR referencja na logikę kalkulatora.
     */
    public Output(final TheCalculator calculatorR) {
        this.calculator = calculatorR;
        bufferLabel = new JLabel(calculator.getBuffer());
        bufferLabel.setFont(new Font("Serif", Font.BOLD, FONT_SIZE));
        separator = new JLabel(" ");
        separator.setFont(new Font("Serif", Font.BOLD, SEPERATOR_SIZE));
        currentLabel = new JLabel(calculator.getCurrent());
        currentLabel.setFont(new Font("Serif", Font.BOLD, FONT_SIZE));
        this.setLayout(new GridLayout(GRID_SIZE1, GRID_SIZE2));
        this.add(bufferLabel);
        this.add(separator);
        this.add(currentLabel);
    }
}
