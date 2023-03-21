
public class ImprimirQuadradoVazio {

  // Imprimir uma quadrado de asterisco vazio por dentro
  public static void main(String[] args) {

    int tamanhoQuadrado = 7;
    int linhas, colunas;

    for (linhas = 0; linhas < tamanhoQuadrado; linhas++) {
      System.out.println(""); // a cada linha lida dar um espaço

      for (colunas = 0; colunas < tamanhoQuadrado; colunas++) {

        // para cada coluna conferir
        if ((linhas == 0) || (linhas == tamanhoQuadrado - 1)) {
          System.out.print("*"); // se for a primeira ou ultima linha imprimir um "*" a cada coluna - preenchendo
                                 // linhas

        } else {

          // se for a primeira ou ultima coluna imprimir ou nao - preenchendo colunas
          if ((colunas == 0) || (colunas == tamanhoQuadrado - 1)) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
      }
    }

  }
}
