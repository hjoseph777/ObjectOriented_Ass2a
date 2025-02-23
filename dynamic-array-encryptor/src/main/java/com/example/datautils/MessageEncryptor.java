package com.example.datautils;

public class MessageEncryptor {
    public static String encryptMessage(String message, String rotatedAlphabet) {
        StringBuilder encryptedMessage = new StringBuilder();
        for (char c : message.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                encryptedMessage.append(rotatedAlphabet.charAt(c - 'A'));
            } else {
                encryptedMessage.append(c);
            }
        }
        return encryptedMessage.toString();
    }
}
