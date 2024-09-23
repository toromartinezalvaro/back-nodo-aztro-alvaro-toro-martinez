package calculadora.ejercicio.domains;

public class Multiplicar extends Operacion {

    public Multiplicar(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double calcular() {
        return numero1 * numero2;
    }
}
