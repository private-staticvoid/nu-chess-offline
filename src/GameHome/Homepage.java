package GameHome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.*;

public class Homepage {

    private static final int BUTTON_WIDTH = 315;
    private static final int BUTTON_HEIGHT = 74;

    private JButton startButton;
    private JButton howToPlayButton;
    private JButton basicRulesButton;
    private JLabel backgroundImage;

    public Homepage() {
        JFrame frame = new JFrame("Chessboard Offline");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1000, 800);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        initComponents(frame);

        frame.setVisible(true);
    }

    private void initComponents(JFrame frame) {

        startButton = new JButton(new ImageIcon("C:\\Users\\Aki\\Java IJ IDE\\NuChess\\bstartt1.png"));
        startButton.setBounds(340, 510, BUTTON_WIDTH, BUTTON_HEIGHT);
        startButton.addActionListener(new StartButtonActionListener());
        startButton.setBorder(null);
        frame.add(startButton);

        howToPlayButton = new JButton(new ImageIcon("C:\\Users\\Aki\\Java IJ IDE\\NuChess\\bhtp2.png"));
        howToPlayButton.setBounds(340, 590, BUTTON_WIDTH, BUTTON_HEIGHT);
        howToPlayButton.addActionListener(new HowToPlayButtonActionListener());
        howToPlayButton.setBorder(null);
        frame.add(howToPlayButton);

        basicRulesButton = new JButton(new ImageIcon("C:\\Users\\Aki\\Java IJ IDE\\NuChess\\brules3.png"));
        basicRulesButton.setBounds(340, 670, BUTTON_WIDTH, BUTTON_HEIGHT);
        basicRulesButton.addActionListener(new BasicRulesButtonActionListener());
        basicRulesButton.setBorder(null);
        frame.add(basicRulesButton);

        backgroundImage = new JLabel(new ImageIcon("C:\\Users\\Aki\\Java IJ IDE\\NuChess\\Homepage.png"));
        backgroundImage.setBounds(0, 0, 1000, 800);
        frame.add(backgroundImage);
    }

    private class StartButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Main.main(new String[0]);
            ((JFrame) SwingUtilities.getWindowAncestor((JButton) e.getSource())).dispose();
        }
    }

    private class HowToPlayButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame howToPlayFrame = new JFrame();
            howToPlayFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            HowToPlay howToPlay = new HowToPlay();
            howToPlayFrame.pack();
            howToPlayFrame.setVisible(true);
            ((JFrame) SwingUtilities.getWindowAncestor((JButton) e.getSource())).dispose();
        }
    }

    private class BasicRulesButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame basicRulesFrame = new JFrame();
            basicRulesFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            BasicRules basicRules = new BasicRules();
            basicRulesFrame.pack();
            basicRulesFrame.setVisible(true);
            ((JFrame) SwingUtilities.getWindowAncestor((JButton) e.getSource())).dispose();
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new Homepage();
        });
    }
}
