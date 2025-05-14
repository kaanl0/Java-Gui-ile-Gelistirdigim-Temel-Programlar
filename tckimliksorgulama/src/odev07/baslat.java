package odev07;

import javax.swing.*;

public class baslat {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form01 f1 = new form01();
                f1.setVisible(true);


            }
        });
    }
}
