package com.example.datautils;

public class CipherUtils {
    public static boolean isValidShift(int shift) {
        return shift >= 0 && shift < 26;
    }

    public static boolean isValidMessage(String message) {
        return message != null && !message.trim().isEmpty();
    }
}
