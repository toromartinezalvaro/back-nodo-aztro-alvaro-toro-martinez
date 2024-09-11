public class Division extends Operation {
  public Division(double number1, double number2) {
      super(number1, number2);
  }

  @Override
  public void operate() {
      if (number2 != 0) {
          double result = number1 / number2;
          System.out.println("El resultado de la división es: " + result);
      } else {
          System.out.println("Error: no se puede dividir por cero.");
      }
  }
}
