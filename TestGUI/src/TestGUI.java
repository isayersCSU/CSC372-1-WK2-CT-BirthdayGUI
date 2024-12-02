import javax.swing.*;

// Main class
public class TestGUI{
    public static void main(String[] args) {
        JFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}















//import java.awt.*;
//import java.util.Calendar;
//import java.util.Date;
//import javax.swing.*;
//
//
//public class main extends JFrame {
//
//    static JFrame frame;
//    static JButton button;
//    static JLabel frameLabel;
//    static JPanel panel;
//    static SpinnerDateModel birthday;
//    static Date date;
//    static Calendar calendar;
//
//    public static void main(String[] args) {
//
//        frame = new JFrame("Birthday Age Getter");
//        frame.setSize(300, 300);
//        frame.setVisible(true);
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane().setBackground(Color.BLUE);
//
//        frameLabel = new JLabel("Enter your Birthdate");
//        frame.add(frameLabel);
//        frameLabel.setSize(550,500);
//
//        button = new JButton("Calculate!");
//        frame.add(button);
//        button.setSize(100,100);
//
//        Date initDate = calendar.getTime();
//
//        calendar.add(Calendar.YEAR, -100);
//        Date earliestDate = calendar.getTime();
//        calendar.add(Calendar.YEAR, 200);
//        Date latestDate = calendar.getTime();
//        birthday = new SpinnerDateModel(initDate, earliestDate, latestDate, Calendar.YEAR);
//
//        frame.add(birthday);
//        panel = new JPanel();
//
//
//    }
//}
