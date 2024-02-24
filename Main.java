import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1, n2, select;
        System.out.print("Birinci sayiyi giriniz : ");
        n1 = inp.nextInt();
        System.out.print("İkinci sayiyi giriniz : ");
        n2 = inp.nextInt();

        System.out.println("1 - toplama | 2 - cikartma | 3 - carpma | 4 - bolme");
        System.out.print("Seçiminizi giriniz: ");
        select = inp.nextInt();
        //withElseIf(select, n1, n2);
        withSwitchCase(select, n1, n2);

    }

    private static void withSwitchCase(int select, int n1, int n2) {
        switch (select) {
            case 1:
                System.out.print("Toplama sonucu : ");
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println("Cıkarma sonucu : ");
                System.out.print(n1 - n2);
                break;
            case 3:
                System.out.println("Çarpma sonucu : ");
                System.out.print(n1 * n2);
                break;
            case 4:
                System.out.println("Bölme sonucu");
                System.out.print(n1 / n2);
                break;
            default:
                System.out.println("Geçerli bir seçim yapınız. ");
                break;
        }
    }
    private static void withElseIf(int select, int n1, int n2) {
        if (select == 1) {
            System.out.println(n1 + n2);
        } else if (select == 2) {
            System.out.println(n1 - n2);
        } else if (select == 3) {
            System.out.println(n1 * n2);
        } else if (select == 4) {
            System.out.println(n1 / n2);
        }
    }

}