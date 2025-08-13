package GameHome;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HowToPlay {

    private static final int BUTTON_WIDTH = 315;
    private static final int BUTTON_HEIGHT = 74;

    private JButton backButton;
    private JLabel backgroundImage;

    public HowToPlay () {
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

        backButton = new JButton(new ImageIcon(getClass().getResource("/images/bback.png")));
        backButton.setBounds(340, 680, BUTTON_WIDTH, BUTTON_HEIGHT);
        backButton.addActionListener(new BackButtonActionListener());
        backButton.setBorder(null);
        frame.add(backButton);

        backgroundImage = new JLabel(new ImageIcon(getClass().getResource("/images/HowToPlay.png")));
        backgroundImage.setBounds(0, 0, 1000, 800);
        frame.add(backgroundImage);
    }

    private class BackButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Homepage homePage = new Homepage();
            ((JFrame) SwingUtilities.getWindowAncestor((JButton) e.getSource())).dispose();
        }
    }
}