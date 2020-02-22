import java.util.Scanner;

public class BesilkaMain {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Vnesi zbor koj ke se pogoduva");
        String zbor = cin.nextLine();
        System.out.println("Vnesi obidi :");
        int obid = cin.nextInt();
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
        Besilka besilka = new Besilka(zbor, obid);

        while (!besilka.gameOver()){
            Scanner scanner = new Scanner(System.in);
            besilka.printDetails();
            String vlez = scanner.nextLine();
            Character bukva = vlez.charAt(0);
            bukva = Character.toLowerCase(bukva);
            besilka.vnesiBukva(bukva);
        }
        besilka.printResult();
    }
}
