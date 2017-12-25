package top.chenwe.houseselljava.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User: asus
 * Date: 2017/12/22
 * Time: 10:53
 */
public class TimeUtil {
    public static String getTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = df.format(new Date());
        return date;
    }
}
