package calculator;

/** Klasa zawierająca logikę kalkulatora. */
public class TheCalculator {
  /** Baza liczb w kalkulatorze.*/
  public static final int BASE = 10;
  /** Liczba buforowana. */
  private double buffer;
  /** Czy buforowana liczba istnieje. */
  private boolean bufferB;
  /** Operacja buforowana. */
  private char operation;
  /** Aktualnie wpisywana liczba. */
  private double current;
  /** Czy aktualnie wpisywana liczba istnieje. */
  private boolean currentB;
  /** Czy użytkownik może usuwać/dodawać znaki z inputu. */
  private boolean deletable;

    /** Konstrukotr kalkulatora. */
    public TheCalculator() {
        buffer = 0;
        operation = ' ';
        current = 0;
        currentB = false;
        deletable = false;
        bufferB = false;
    }
    /**
     * Wczytywanie cyfr.
     *
     * @param input cyfra
     */
    public void inputCurrent(final double input) {
        if (currentB && deletable) {
            current *= BASE;
            current += input;
        } else {
            currentB = true;
            current = input;
        }
        deletable = true;
    }

    /**
     * Funkcja "=".
     */
    public void equalsTo() {
        if (currentB && bufferB) {
            if (operation == '+') {
                current = current + buffer;
            }
            if (operation == '-') {
                current = buffer - current;
            }
            if (operation == '*') {
                current = current * buffer;
            }
            if (operation == '/') {
                current = buffer / current;
            }
            bufferB = false;
            buffer = 0;
            operation = ' ';
            deletable = true;
        }
    }

    /**
     * Wczytywanie operatorów.
     * @param input operator
     */
    public void inputOperation(final char input) {
        if (input == '*' || input == '/' || input == '+' || input == '-') {
            if (currentB && !bufferB) {
                operation = input;
                buffer = current;
                bufferB = true;
                currentB = false;
                current = 0;

            } else if (currentB && bufferB) {
                equalsTo();
                operation = input;
                buffer = current;
                bufferB = true;
                currentB = false;
                current = 0;
            } else if (!currentB && bufferB) {
                operation = input;
            }
        }
    }
    /** Funkcja zwracająca aktualną liczbę jako string.
     * @return aktualna liczba jako string
     * */
    public String getCurrent() {
        if (!currentB) {
            return  " ";
        }
        if (current == Math.floor(current)) {
            return "  " + Long.toString(Math.round(current));
        }
        else {
            return "  " + Double.toString(current);
        }
    }
    /** Funkcja zwracająca buforowaną liczbę jako string.
     * @return buforowana liczba jako string
     * */
    public String getBuffer() {
        if (!bufferB) {
            return  " ";
        }
        if (buffer == Math.floor(buffer)) {
            return "  " + Long.toString(Math.round(buffer))  + " " + operation;
        }
        else {
            return "  " + Double.toString(buffer)  + " " + operation;
        }
    }
    /** Funkcja usuwająca ostatnią cyfrę aktualnej liczby. */
    public void delete() {
        if (deletable) {
            current -= current % BASE;
            current /= BASE;
        }
    }
}
