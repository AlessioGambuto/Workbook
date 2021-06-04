package ires.corso.partone;

public class StringTest {
    public static void main(String[] args) {

        int lung1, lung2, lung3;
        char iniz1, iniz2, iniz3;
        char fin1, fin2, fin3;
        int narg =args.length;

        if (narg != 3) {
            System.out.println("Il n° di stringhe dato in input non è corretto!");
        }
        else
        {
            String str1 = args[0];
            String str2 = args[1];
            String str3 = args[2];
            lung1 = str1.length();
            lung2 = str2.length();
            lung3 = str3.length();
            iniz1 = str1.charAt(0);
            iniz2 = str2.charAt(0);
            iniz3 = str3.charAt(0);
            fin1 = str1.charAt(lung1-1);
            fin2 = str2.charAt(lung2-1);
            fin3 = str3.charAt(lung3-1);

            String report1 = String.format("La stringa %s ha lunghezza %d, comincia per %c e finisce per %c", str1, lung1, iniz1, fin1);
            String report2 = String.format("La stringa %s ha lunghezza %d, comincia per %c e finisce per %c", str2, lung2, iniz2, fin2);
            String report3 = String.format("La stringa %s ha lunghezza %d, comincia per %c e finisce per %c", str3, lung3, iniz3, fin3);

            System.out.println(report1 + "\n" + report2 + "\n" + report3);
        }
        }
    }
