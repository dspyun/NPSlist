
import javax.swing.*;
import java.io.IOException;

public class Main extends JFrame{

    public static void main(String[] args) throws IOException {

        NPS mynps = new NPS();
        String result = mynps.getNPSlist();
        mynps.save_file(result);
    }
}
