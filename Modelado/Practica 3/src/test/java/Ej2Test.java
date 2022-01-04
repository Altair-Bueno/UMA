import ej2.Activo;
import ej2.MedioPensionista;
import ej2.Pensionista;
import org.junit.Test;

public class Ej2Test {
  @Test
  public void testActivo() {
    Activo a1 = new Activo("av", "N1", 1500.0);
    // El incremento del salario de un activo debe ser igual al salario  activo
    // sin incremento multiplicado por 1.02
    a1.incrementar();
    assert 1500.0 * 1.02 == a1.nomina();
  }

  @Test
  public void testPensionista() {
    Pensionista p1 = new Pensionista("dg", "N2", 800.0);
    // El incremento del salario de un pensionista debe ser igual al salario pensionista
    // sin incremento multiplicado por 1.04
    p1.incrementar();
    assert 800.0 * 1.04 == p1.nomina();
  }

  @Test
  public void testMedioPensionista() {
    MedioPensionista m1 = new MedioPensionista("ob", "N3", 1100.0, 450.0);
    // El incremento del salario de un pensionista debe ser igual al salario pensionista
    // sin incremento multiplicado por 1.04
    m1.incrementar();
    assert 1100.0 * 1.02 + 450.0 * 1.04 == m1.nomina();
  }
}
