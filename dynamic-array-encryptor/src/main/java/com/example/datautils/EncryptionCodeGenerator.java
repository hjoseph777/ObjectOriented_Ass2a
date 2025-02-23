package com.example.datautils;

public class EncryptionCodeGenerator {
    public static String generateRotatedAlphabet(int shift) {
        StringBuilder rotatedAlphabet = new StringBuilder();
        for (char c = 'A'; c <= 'Z'; c++) {
            char rotatedChar = (char) ((c - 'A' + shift) % 26 + 'A');
            rotatedAlphabet.append(rotatedChar);
        }
        return rotatedAlphabet.toString();
    }
}
