package hafta04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class form1 extends JFrame {
    private JPanel panel;
    private JLabel lbl1;
    private boolean acikMi = false; // Toggle durumu

    form1() {
        panel = new JPanel();
        lbl1 = new JLabel();
        panel.add(lbl1);

        add(panel);
        setTitle("Toggle Buttom");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbl1.setSize(260, 121);
        lbl1.setOpaque(true);

        // Resimleri yükle
        ImageIcon offIcon = new ImageIcon(getClass().getResource("/off.png"));
        ImageIcon onIcon = new ImageIcon(getClass().getResource("/on.png"));

        lbl1.setIcon(offIcon); // İlk hali kapalı

        lbl1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                acikMi = !acikMi; // Durumu değiştir
                if (acikMi) {
                    lbl1.setIcon(onIcon);
                } else {
                    lbl1.setIcon(offIcon);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new form1().setVisible(true));
    }
}
