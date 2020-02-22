import java.util.ArrayList;
import java.util.List;

public class Besilka {
    int obidi;
    List<Character> bukviOdZbor;
    List<Character> maskiranZbor;
    List<Character> probaniBukvi;

    Besilka(String zbor, int obidi){
        this.obidi = obidi;
        this.bukviOdZbor = new ArrayList<>();
        this.maskiranZbor = new ArrayList<>();
        this. probaniBukvi = new ArrayList<>();
        zbor = zbor.trim();
        zbor = zbor.toLowerCase();
        for (int i = 0; i < zbor.length(); i++) {
            bukviOdZbor.add(zbor.charAt(i));
            maskiranZbor.add('*');
        }
    }

    public void vnesiBukva(Character bukva){
        if(probaniBukvi.contains(bukva)){
            return;
        } else {
            probaniBukvi.add(bukva);
        }
        boolean jaIma = false;
        for (int i = 0; i < bukviOdZbor.size(); i++) {
            if(bukviOdZbor.get(i) == bukva){
                jaIma = true;
                maskiranZbor.set(i, bukva);
            }
        }
        if(!jaIma){
            obidi--;
        }
    }
    public boolean isWin(){
        return !maskiranZbor.contains('*');
    }

    public boolean gameOver() {
        return isWin() || obidi == 0;
    }

    public void printDetails() {
        System.out.println("Vi preostuvaat ushte " + obidi);
        if(probaniBukvi.isEmpty()){
            System.out.println("Nemate probano bukvi do sega");
        } else {
            System.out.println("Dosega gi imate probano ovie bukvi :");
            for (int i = 0; i < probaniBukvi.size(); i++) {
                System.out.print(probaniBukvi.get(i) + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < maskiranZbor.size(); i++) {
            System.out.print(maskiranZbor.get(i));
        }
        System.out.println();
    }
    public void printResult(){
        if(isWin()){
            System.out.println("YOU WIN !!!");
        } else {
            System.out.println("YOU LOSE :'( ..");
            System.out.println("Zborot beshe ");
            for (int i = 0; i < bukviOdZbor.size(); i++) {
                System.out.print(bukviOdZbor.get(i));
            }
        }
    }
}
