package com.company.dailyCoding;

public class DecryptCaesarCipher {
    public static void main(String[] args) {
        String output = decipher("khoor", 3);
        System.out.println(output); // --> hello

        output = decipher("zruog", 3);
        System.out.println(output); // --> world
    }
    public static String cipher(String str, int secret) {
        if (str.length() == 0) return "";
        StringBuilder cipher = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                int originalAlphabetPosition = c - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + secret) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                cipher.append(newCharacter);
            } else {
                cipher.append(c);
            }
        }
        return cipher.toString();
    }

    static String decipher(String message, int offset) {
        return cipher(message, 26 - (offset % 26));
    }
}
