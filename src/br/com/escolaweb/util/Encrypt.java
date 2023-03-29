package br.com.escolaweb.util;

import java.security.MessageDigest;
import java.util.Base64;
import java.util.Date;

public class Encrypt {

    public static String sha256(String keys, Boolean unique) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            String salt = String.valueOf(new Date().getTime());
            if (unique) {
                md.update((keys + salt).getBytes());
            } else {
                md.update((keys).getBytes());
            }
            return Base64.getEncoder().encodeToString(md.digest());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static String sha256(String keys) {
        return sha256(keys, false);
    }
}
