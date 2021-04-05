/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wsCalculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Calculadora c;

    @BeforeAll public static void setUp() {
        c = new Calculadora();
    }
    
    @Test void testSuma() {
        assertTrue(c.suma(2.0,3.0)==5.0);
    }

    @Test void testResta() {
        assertTrue(c.resta(4.0,3.0)==1.0);
    }

}
