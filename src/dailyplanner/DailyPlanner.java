package dailyplanner;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Administrator
 */
public class DailyPlanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, BadLocationException {
     new Startup().setVisible(true);
        /*String arr[]={"","s","sad","sa","cc"};
        new Notepad("ddsa",arr ,"C:\\Users\\Administrator\\Desktop\\DailyDiary\\pracodearBirthday.html").setVisible(true);*/
    }
}