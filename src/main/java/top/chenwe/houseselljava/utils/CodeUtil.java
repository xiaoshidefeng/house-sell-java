package top.chenwe.houseselljava.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.security.MessageDigest;
import java.util.Date;

/**
 * Created by cw on 2017/7/19.
 * 加密
 */
public class CodeUtil {

    private static final String SALT = "housesell";

    private static String[] strings = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public static String generateCode(String password) {
        password = password + SALT;
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        char[] charArray = password.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();

    }

    public static String generateToken(String name) {
        String token = Jwts.builder().setSubject(name).claim("roles", "user").setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "housesell").compact();
        return token;
    }

    public static String generateRandNum() {
        String num = "";
        for (int i = 0; i < 6; i++) {

            int randNum = (int) (Math.random() * 10);

            num = num + strings[randNum];
        }
        return num;
    }
}
