public class OrdemInversa {
  public static void main(String[] args) {

    int[] vetor = { -5, -6, 15, 50, 8, 4 };

    System.out.print("vetor: ");
    int count = 0;
    while (count < vetor.length) { // vetor.length volta quantos elementos tem no vetor
      System.out.print(vetor[count] + " ");
      count++;

    }
    System.out.print("\nvetor: ");
    for (int i = vetor.length - 1; i >= 0; i--) {
      System.out.print(vetor[i] + " ");
    }
  }
}