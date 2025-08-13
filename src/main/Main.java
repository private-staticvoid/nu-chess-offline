package main;

import javax.swing.*;
import java.awt.*;

public class Main {

//    static ImageIcon logo = new ImageIcon(Main.class.getClassLoader().
//            getResource("res/chess.png"));

    public static void main(String[] args) {

        try {
            Font mcFont = Font.createFont(
                    Font.TRUETYPE_FONT,
                    Main.class.getResourceAsStream("/res/fonts/minecraft.ttf")
            );
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(mcFont);
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame window = new JFrame("Chessboard Offline");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
//        window.getIconImage(logo.getImage());

        //Add Main.Main.GamePanel to the window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gp.launchGame();
    }
}