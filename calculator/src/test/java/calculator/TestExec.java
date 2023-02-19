package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/** Klasa testowa uruchamiająca kalkulator. */
public final class TestExec {
/** Constructor TestExec. */
  public TestExec() {
  }
  /**
  * Funkcja testujaca wlaczanie programu.
  */
  @Test
  public void testing()  {
      MainFrame m1 = new MainFrame();
      m1.setVisible(true);
      assertEquals(m1.isVisible(), true);
  }
}
