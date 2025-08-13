package main;

import java.awt.*;

public class    Board {

    final int MAX_COL = 8;
    final int MAX_ROW = 8;
    public static final int SQUARE_SIZE = 100;
    public static final int HALF_SQUARE_SIZE = SQUARE_SIZE / 2;

    public void draw(Graphics2D g2) {

     int c = 0;

     g2.setColor(Color.WHITE);
     g2.setStroke(new BasicStroke(10));
     g2.drawRect(0, 0, MAX_COL * SQUARE_SIZE, MAX_ROW * SQUARE_SIZE);

    for(int row = 0; row < MAX_ROW; row++){
        for(int col = 0; col < MAX_COL; col++) {

            if (c == 0) {
                g2.setColor(new Color(181, 193, 211));
                c = 1;
            } else {
                g2.setColor(new Color(4, 4, 66));
                c = 0;
            }


            g2.fillRect(col * SQUARE_SIZE, row * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
        }
            if(c == 0){
                c = 1;
            }
            else {
                c = 0;
            }

}
}
}
