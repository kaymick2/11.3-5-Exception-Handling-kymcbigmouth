import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int x = 0;
    do {
      try {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number.");
        double no1 = input.nextDouble();
        System.out.println("Enter the second number.");
        double no2 = input.nextDouble();
        x = 1;
      } catch (Exception e) {
        System.out.println("computer broke, call microsoft tech support");
      }
    } while (x == 0);
  }
}