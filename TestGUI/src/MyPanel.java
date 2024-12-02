import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

class MyPanel extends JPanel {
    public MyPanel() {
        // Add components to the panel
        JButton button = new JButton("Click me");
        add(button);

        // Create a formatted text field for date input
        JFormattedTextField dateField = new JFormattedTextField();
        try {
            MaskFormatter maskFormatter = new MaskFormatter("##/##/####");
            maskFormatter.setPlaceholderCharacter('_');
            dateField.setFormatterFactory(new DefaultFormatterFactory(maskFormatter));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        add(dateField);

        // Add an action listener to the button
        button.addActionListener(e -> {
            String dateInput = dateField.getText();
            try {
                SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                Date enteredDate = formatter.parse(dateInput);

                Calendar calendar = Calendar.getInstance();
                calendar.setTime(enteredDate);

                Date currentDate = new Date();
                long diffInMillis = Math.abs(currentDate.getTime() - calendar.getTimeInMillis());
                long diffInYears = TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS) / 365;

                System.out.println("Years passed: " + diffInYears);
            } catch (ParseException ex) {
                System.out.println("Invalid date format. Please use MM/DD/YYYY.");
            }
        });
    }
}




//import javax.swing.*;
//
//class MyPanel extends JPanel {
//    public MyPanel() {
//        // Add components to the panel
//        JButton button = new JButton("Click me");
//        add(button);
//
//        // Add an action listener to the button
//        button.addActionListener(e -> {
//            // Handle button click event
//            System.out.println("Button clicked!");
//        });
//    }
//}