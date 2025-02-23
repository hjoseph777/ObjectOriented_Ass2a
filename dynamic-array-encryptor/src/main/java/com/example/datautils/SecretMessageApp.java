package com.example.datautils;

import java.util.Scanner;

public class SecretMessageApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = scanner.nextLine();
        int shift = 5;

        if (CipherUtils.isValidShift(shift) && CipherUtils.isValidMessage(message)) {
            String rotatedAlphabet = EncryptionCodeGenerator.generateRotatedAlphabet(shift);
            String encryptedMessage = MessageEncryptor.encryptMessage(message, rotatedAlphabet);
            System.out.println("Original Message: " + message);
            System.out.println("Encryption Code: " + rotatedAlphabet);
            System.out.println("Secret Message: " + encryptedMessage);
        } else {
            System.out.println("Invalid input. Please try again.");
        }
        scanner.close();
    }
}
