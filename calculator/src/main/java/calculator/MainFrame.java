package calculator;

import javax.swing.JFrame;

/** Główny Frame aplikacji. */
public class MainFrame extends JFrame {
    /** Główny Panel aplikacji. */
    private MainPanel panel;

    /** Konstruktor Frame'a. */
    public MainFrame() {
        panel = new MainPanel();
        // setSize(800,800);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        setResizable(false);
        setLocationRelativeTo(null);
    }
}
