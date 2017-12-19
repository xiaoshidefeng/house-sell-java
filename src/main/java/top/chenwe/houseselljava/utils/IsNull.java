package top.chenwe.houseselljava.utils;

/**
 * User: asus
 * Date: 2017/12/12
 * Time: 15:14
 */
public class IsNull {

    public static boolean isNullField(String string) {
        Boolean string_is_null = string == null || string.equals("");
        if (string_is_null) {
            return true;
        }
        return false;
    }

    public static boolean isNullField(String s1, String s2) {
        Boolean s1_is_null = s1 == null || s1.equals("");
        Boolean s2_is_null = s2 == null || s2.equals("");

        if (s1_is_null || s2_is_null) {
            return true;
        }
        return false;
    }

    public static boolean isNullField(String s1, String s2, String s3) {
        Boolean s1_is_null = s1 == null || s1.equals("");
        Boolean s2_is_null = s2 == null || s2.equals("");
        Boolean s3_is_null = s3 == null || s3.equals("");
        if (s1_is_null || s2_is_null || s3_is_null) {
            return true;
        }
        return false;
    }
}
