public class printLosango {

  // Imprimir um losango vazio por dentro
  public static void main(String[] args) {

    int tamLosango = 9;
    int linha, coluna;

    for (linha = 0; linha < tamLosango; linha++) { // para cada linha
      System.out.println("");

      for (coluna = 0; coluna < tamLosango; coluna++) { // para cada coluna

        switch (linha) { // preenchendo o losando com espaços vazios ou asterisco

          case 0, 8:
            if (coluna == 4) {
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
            break;

          case 1, 7:
            if ((coluna == 3) || coluna == 5) {
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
            break;

          case 2, 6:
            if ((coluna == 2) || coluna == 6) {
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
            break;

          case 3, 5:
            if ((coluna == 1) || coluna == 7) {
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
            break;

          case 4:
            if ((coluna == 0) || coluna == 8) {
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
            break;
        }
      }
    }
  }

}
