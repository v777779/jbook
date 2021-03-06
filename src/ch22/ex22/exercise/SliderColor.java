package ch22.ex22.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Vadim Voronov
 * Created: 21-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SliderColor extends JFrame {
    private JSlider jsRed = new JSlider(0, 255, 255);
    private JSlider jsGreen = new JSlider(0, 255, 255);
    private JSlider jsBlue = new JSlider(0, 255, 255);
    private JTextField jtRed = new JTextField("255",4);
    private JTextField jtGreen = new JTextField("255",4);
    private JTextField jtBlue = new JTextField("255",4);



    private Color color = new Color(255, 255, 255); // исходный цвет
    private ChangeListener changeListener = new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {         // отрабатывает JSlider
            color = new Color(jsRed.getValue(), jsGreen.getValue(), jsBlue.getValue());
            jtRed.setText(""+jsRed.getValue());
            jtGreen.setText(""+jsGreen.getValue());
            jtBlue.setText(""+jsBlue.getValue());
            repaint();
        }
    };

    private JPanel jPanel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            jPanel.setBackground(color);
        }
    };

    public SliderColor() throws HeadlessException {
        setLayout(new FlowLayout());
        jPanel.setBackground(color);
        jPanel.setPreferredSize(new Dimension(600, 250));
        jsRed.setPreferredSize(new Dimension(550, 20));
        jsGreen.setPreferredSize(new Dimension(550, 20));
        jsBlue.setPreferredSize(new Dimension(550, 20));
        jsRed.addChangeListener(changeListener);
        jsGreen.addChangeListener(changeListener);
        jsBlue.addChangeListener(changeListener);

        jtRed.setEditable(false);
        jtRed.setHorizontalAlignment(SwingConstants.CENTER);
        jtGreen.setEditable(false);
        jtGreen.setHorizontalAlignment(SwingConstants.CENTER);
        jtBlue.setEditable(false);
        jtBlue.setHorizontalAlignment(SwingConstants.CENTER);

        add(new JLabel("Color JPanel with Sliders"));
        add(jPanel);
//        add(jsRed);
        JPanel jpRed = new JPanel();
        jpRed.add(new JLabel("Red   :"));
        jpRed.add(jsRed);
        jpRed.add(jtRed);
        add(jpRed);

//        add(jsGreen);
        JPanel jpGreen = new JPanel();
        jpGreen.add(new JLabel("Green:"));
        jpGreen.add(jsGreen);
        jpGreen.add(jtGreen);
        add(jpGreen);
//        add(jsBlue);
        JPanel jpBlue = new JPanel();
        jpBlue.add(new JLabel("Blue  :"));
        jpBlue.add(jsBlue);
        jpBlue.add(jtBlue);
        add(jpBlue);
    }

    public static void check() {
        SwingConsole.run(new SliderColor(), 700, 450);
    }


}
