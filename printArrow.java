public class printArrow {

  // Imprimir uma seta para cima com asteriscos
  public static void main(String[] args) {

    int tamSeta = 7;
    int linha, coluna;

    // Iniciando contagem de linhas e espaço após cada uma
    for (linha = 0; linha < tamSeta; linha++) {
      System.out.println("");

      // iniciando a leitura de cada coluna em cada linha
      for (coluna = 0; coluna < tamSeta; coluna++) {
        if ((linha == 0) || (linha > 2)) { // preenchendo a linha 0 e as linhas 3 e 4

          if (coluna == 2) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }

        } else if (linha == 1) { // Preenchendo a linha 1
          if ((coluna > 0) && (coluna < 4)) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }

        } else if (linha == 2) { // preenchendo a linha 2
          if (coluna < 5) {
            System.out.print("*");
          }
        }
      }
    }
  }
}
