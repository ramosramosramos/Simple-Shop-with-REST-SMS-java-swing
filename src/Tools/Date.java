
package Tools;

import java.text.SimpleDateFormat;

/**
 *
 * @author User
 */
public class Date {

    public static String getDate() {
        java.util.Date now = new java.util.Date();
        SimpleDateFormat format = new SimpleDateFormat("MMMM-dd-YYYY");
        String date = format.format(now);
 
        return date;
    }
    public static String getTime() {
        java.util.Date now = new java.util.Date();
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
        String time = format.format(now);
 
        return time;
    }
}
