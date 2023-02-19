package calculator;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

/** Klasa przycisku kalkulatora. */
public class CButton extends JButton {

    /** Constructor przycisku kalkulatora.
     * @param content tekst przycisku
     * */
    public CButton(final String content) {
        super(content);
        this.setFont(new Font("Serif", Font.BOLD, 20));
        this.setPreferredSize(new Dimension(80, 80));
    }
}
