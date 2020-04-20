package Theme6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Фрейм");
        frame.setSize(200,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contents = new JPanel(new FlowLayout());
        JLabel text = new JLabel("Калькуятор примитивный ");
        JButton button = new JButton(" Посчитать");
        JTextField field = new JTextField(10);

        contents.add(text);
        contents.add(field);
        contents.add(button);

        // Слушатель
        ActionListener buttonListener = new ActionListener() {
            // Что будет выполняться при нажатии на кнопку
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажали кнопочку" + field.getText());
                String result = field.getText(); // тут типа должно посчитать..
                JOptionPane.showMessageDialog(contents, field.getText());
            }
        };

        ActionListener fieldLidtener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Набранное сообщение: " + field.getText());
                String result = field.getText() + " = "; // тут типа должно посчитать..
                JOptionPane.showMessageDialog(contents, result);
            }
        };

        // Установка слушателя
        button.addActionListener(buttonListener);
        field.addActionListener(fieldLidtener);
        // Размещаем панель в корнтейнере
        frame.setContentPane(contents);
        // Открываем окно
        frame.setVisible(true);
    }
}
