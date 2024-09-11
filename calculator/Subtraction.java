public class Subtraction extends Operation {
  public Subtraction(double number1, double number2) {
      super(number1, number2);
  }

  @Override
  public void operate() {
      double result = number1 - number2;
      System.out.println("El resultado de la resta es: " + result);
  }
}
