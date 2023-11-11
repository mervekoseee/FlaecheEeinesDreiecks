import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, u, cevre;
        double alanin_karesi, alan;

        System.out.println("Üçgenin kenar uzunluklarını giriniz: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        u = (a + b + c) / 2;
        cevre = 2 * u;
        alanin_karesi = u * (u - a)* (u - b) * (u - c);
        alan = Math.sqrt(alanin_karesi);

        System.out.println("Üçgenin Çevresi: " + cevre);
        System.out.println("Alanı: " + alan);
    }
}