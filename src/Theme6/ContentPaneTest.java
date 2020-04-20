package Theme6;

import javax.swing.*;

public class ContentPaneTest extends JFrame {
    public ContentPaneTest() {
        super("Тест ContentPane");
        setDefaultCloseOperation((EXIT_ON_CLOSE));

        JPanel contents = new JPanel();
        contents.add(new JButton("Java"));
        contents.add(new JButton("Python"));

        setContentPane(contents);
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new ContentPaneTest();
    }
}
