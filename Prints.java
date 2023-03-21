public class Prints {

  // Aqui testo exemplos simples de sysout print, println, e printf
  public static void main(String[] args) {

    int[] numbers = { 1, 2, 3, 4 };

    System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3] + ".");
    // imprime a sequencia de numeros e quebra a linha

    System.out.print(numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3] + ".");
    // imprime a sequencia sem quebra de linha

    System.out.printf("%n%d, %d, %d, %d", numbers[0], numbers[1], numbers[2], numbers[3]);
    // quebra uma linha e imprime a sequencia

  }
}
