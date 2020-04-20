package Theme6;

import javax.swing.*;
import java.awt.*;

public class SimpleJFrame {
    public  static void createGui(){
        JFrame frame = new JFrame("Тестовый фрейм");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Тестовый лэйбл");
        frame.getContentPane().add(label);

        frame.setPreferredSize(new Dimension(300, 200));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //JFrame.setDefaultLookAndFeelDecorated(true);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                createGui();
            }
        });
    }
}
