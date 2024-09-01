package practice_proj;

import java.util.Scanner;

public class Vowels_consonants {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the input sentence: ");
        String snt = sc.nextLine();
        
        snt = snt.toLowerCase(); 

        int vcount = 0;
        int ccount = 0;
        int acount = 0, ecount = 0, icount = 0, ocount = 0, ucount = 0;
        
        for (int i = 0; i < snt.length(); i++) {
            char ch = snt.charAt(i);
            if (Character.isLetter(ch)) {
                switch (ch) {
                    case 'a':
                        acount++;
                        vcount++;
                        break;
                    case 'e':
                        ecount++;
                        vcount++;
                        break;
                    case 'i':
                        icount++;
                        vcount++;
                        break;
                    case 'o':
                        ocount++;
                        vcount++;
                        break;
                    case 'u':
                        ucount++;
                        vcount++;
                        break;
                    default:
                        ccount++;
                        break;
                }
            }
        }
        
        System.out.println("The vowels in the sentence are: " + vcount);
        System.out.println("  a: " + acount);
        System.out.println("  e: " + ecount);
        System.out.println("  i: " + icount);
        System.out.println("  o: " + ocount);
        System.out.println("  u: " + ucount);
        System.out.println("The consonants in the sentence are: " + ccount);
    }
}
