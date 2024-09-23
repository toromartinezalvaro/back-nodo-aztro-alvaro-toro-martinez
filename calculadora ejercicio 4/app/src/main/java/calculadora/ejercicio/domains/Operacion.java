package calculadora.ejercicio.domains;

// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.NoArgsConstructor;
// @Data
// @AllArgsConstructor
// @NoArgsConstructor
public abstract class Operacion {

    // private String Nombre;
    protected double numero1;
    protected double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public abstract double calcular();
}
