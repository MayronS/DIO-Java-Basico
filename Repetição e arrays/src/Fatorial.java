import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Fatorial: ");
      int fatorial = scan.nextInt();

      int multiplicação = 1;
      System.out.print(fatorial + "! = ");
      for (int i = fatorial; i >= 1; i--) {

        multiplicação = multiplicação * i;

      }

      System.out.println(multiplicação);
    }

  }
}
