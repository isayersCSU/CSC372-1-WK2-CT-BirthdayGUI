import javax.swing.*;

class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("My JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Create a panel and add components to it
        MyPanel panel = new MyPanel();
        add(panel);
    }
}
