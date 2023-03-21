public class printQuadradoCheio {

  // Imprimir uma quadrado de asteriscos cheio
  public static void main(String[] args) {

    int tamQuadrado = 5;
    int linhas, colunas;

    // Pra cada linha fazer:
    for (linhas = 0; linhas < tamQuadrado; linhas++) {
      System.out.println("");

      for (colunas = 0; colunas < tamQuadrado; colunas++) {
        System.out.print("*");
        // imprime um asterisco pra cada coluna da linha
      }
    }
  }
}