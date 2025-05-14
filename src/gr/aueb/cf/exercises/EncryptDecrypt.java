package gr.aueb.cf.exercises;

import java.util.Scanner;

public class EncryptDecrypt {
        static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("insert a word ");
            String s = scanner.nextLine();
            System.out.println("encrypted is: " + encrypting(s));
            System.out.println("decrypted is: " + decrypting(s));
        }

        public static String encrypting(String s) {
            StringBuilder encr = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetter(c)) {
                    if (c=='z'){
                        c = 'a';
                    } else if (c == 'Z') {
                        c = 'A';
                    } else{
                        c++;
                    }
                }
                encr.append(c);
            }
            return encr.toString();
        }
        public static String decrypting(String s) {
            StringBuilder encr = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetter(c)) {
                    if (c=='a'){
                        c = 'z';
                    } else if (c == 'A') {
                        c = 'Z';
                    } else{
                        c--;
                    }
                }
                encr.append(c);
            }
            return encr.toString();
        }
    }