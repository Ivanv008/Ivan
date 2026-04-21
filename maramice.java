package patika;

public class maramice {
    static int REDOVI = 2;
      static int KOLONE = 2;

      static void popuni(int[][] mat) {
          int broj = 1;
          for (int i = 0; i < REDOVI; i++)
              for (int j = 0; j < KOLONE; j++)
                  mat[i][j] = broj++;     //mat[0][0] = 1  mat[0][1] = 2 mat[1][0] = 3 mat[1][1] = 4
      }

      static void stampaj(int[][] mat) {
          for (int i = 0; i < REDOVI; i++) {
              for (int j = 0; j < KOLONE; j++)
                  System.out.print(mat[i][j] + " ");
              System.out.println();
          }
      }

      static int zbir(int[][] mat, int i, int j) {
          if (i >= REDOVI) return 0;
          if (j >= KOLONE) return zbir(mat, i + 1, 0);
          return mat[i][j] + zbir(mat, i, j + 1);
      }

      static int najveci(int[][] mat) {
          int max = mat[0][0];
          for (int i = 0; i < REDOVI; i++)
              for (int j = 0; j < KOLONE; j++)
                  if (mat[i][j] > max)
                      max = mat[i][j];
          return max;
      }

      public static void main(String[] args) {
          int[][] matrica = new int[REDOVI][KOLONE];

          popuni(matrica);
          stampaj(matrica);

          System.out.println("Zbir: " + zbir(matrica, 0, 0));
          System.out.println("Najveci: " + najveci(matrica));
       }
  }

