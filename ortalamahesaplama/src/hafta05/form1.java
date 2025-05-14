package hafta05;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class form1  extends JFrame {
    
    int v,o,f;
    float ort;
    private JPanel panel;
    private JSlider vs;
    private JSlider os;
    private JSlider fs;
    private JSlider orts;
    private JLabel lv;
    private JLabel lo;
    private JLabel lf;
    private JLabel lort;

    form1(){
        add(panel);
        setSize(1100,1100);
        setTitle("ORTALAMA HESAPLAMA ");
        v=f=o=0;
        ort=0f;

        vs.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                v = (int) vs.getValue();
                o = (int) os.getValue();
                f = (int) fs.getValue();
                ort = ((float) v+o+f)/2;
                orts.setValue(Math.round(ort));
                lv.setText("VİZE = " +Integer.toString(v));
                lo.setText("ÖDEV = " +Integer.toString(o));
                lf.setText("FİNAL = " +Integer.toString(f));
                lort.setText("ORTALAMA = " +Float.toString(ort));
                if (ort>=60 && ort<=100)  orts.setBackground(Color.GREEN);
                else if (ort>=55 && ort<60)orts.setBackground(Color.ORANGE);
                else orts.setBackground(Color.RED);

            }
        });

        fs.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                v = (int) vs.getValue();
                o = (int) os.getValue();
                f = (int) fs.getValue();
                ort = ((float) v+o+f)/2;
                orts.setValue(Math.round(ort));
                lv.setText("VİZE = " +Integer.toString(v));
                lo.setText("ÖDEV = " +Integer.toString(o));
                lf.setText("FİNAL = " +Integer.toString(f));
                lort.setText("ORTALAMA = " +Float.toString(ort));
                if (ort>=60 && ort<=100)  orts.setBackground(Color.GREEN);
                else if (ort>=55 && ort<60)orts.setBackground(Color.ORANGE);
                else orts.setBackground(Color.RED);

            }
        });

        os.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                v = (int) vs.getValue();
                o = (int) os.getValue();
                f = (int) fs.getValue();
                ort = ((float) v+o+f)/2;
                orts.setValue(Math.round(ort));
                lv.setText("VİZE = " +Integer.toString(v));
                lo.setText("ÖDEV = " +Integer.toString(o));
                lf.setText("FİNAL = " +Integer.toString(f));
                lort.setText("ORTALAMA = " +Float.toString(ort));
                if (ort>=60 && ort<=100)  orts.setBackground(Color.GREEN);
                else if (ort>=55 && ort<60)orts.setBackground(Color.ORANGE);
                else orts.setBackground(Color.RED);

            }
        });





    }
    
}
