package domaci;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("UNOS FUDBALERA");
        System.out.print("Ime: ");
        String imeF = sc.nextLine();

        System.out.print("Godine: ");
        int godineF = sc.nextInt();

        System.out.print("Golovi: ");
        int golovi = sc.nextInt();
        sc.nextLine();

        Fudbaler f = new Fudbaler(imeF, godineF, golovi);

        System.out.println("UNOS KOŠARKAŠA");
        System.out.print("Ime: ");
        String imeK = sc.nextLine();

        System.out.print("Godine: ");
        int godineK = sc.nextInt();

        System.out.print("Poeni: ");
        double poeni = sc.nextDouble();

        Kosarkas k = new Kosarkas(imeK, godineK, poeni);

        System.out.println("PODACI ");
        f.info();
        System.out.println();
        k.info();

        sc.close();
    }
}
