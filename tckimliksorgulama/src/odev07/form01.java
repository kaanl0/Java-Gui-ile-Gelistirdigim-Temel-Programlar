package odev07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class form01 extends JFrame{
    private JPanel panel;
    private JTextField textField1;
    private JLabel label;

    form01(){
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,600);
        setTitle("TC Sorgulama ");

        label.setOpaque(true);

        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                String tc = textField1.getText();
                if (tc.length() == 11) {
                    if(isValidTC(tc)){
                        label.setText("Geçerli Tc kimlik numarası ");
                        label.setBackground(Color.GREEN);
                    }else {
                        label.setText("Geçersiz TC kimlik numarası");
                        label.setBackground(Color.RED);
                    }


                }else {
                    label.setText("11 hane giriniz");
                    label.setBackground(Color.white);
                }

            }
        });
    }
    private boolean isValidTC(String tc) {
        if (tc.length() != 11)
            return false;

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += Character.getNumericValue(tc.charAt(i));
        }

        if (sum % 2 == 0 && sum % 10 == Character.getNumericValue(tc.charAt(10)))
            return true;

        return false;
    }

}

