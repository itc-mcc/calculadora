/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wsCalculadora;

public class App {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        
        System.out.println("CALCULADORA (v1.0)");
        System.out.println("=================");
        System.out.println("2+3="+c.suma(2, 3));
    }
}
