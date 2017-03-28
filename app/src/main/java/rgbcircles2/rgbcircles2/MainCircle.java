package rgbcircles2.rgbcircles2;

import android.graphics.Color;

/**
 * Created by ANDREY on 28.03.2017.
 */

public class MainCircle extends SimpleCircle{
    public static final int INIT_RADIUS = 50;
    public static final int MAIN_SPEED = 30;
    public static final int OUR_COLOR = Color.BLUE;

    public MainCircle(int x, int y) {
        super(x, y, INIT_RADIUS);
        setColor(OUR_COLOR);
    }


    public void moveMainCircleWhenTouchAt(int x1, int y1) {
        int dx = (x1-x) * MAIN_SPEED / GameManager.getWidth();
        int dy = (y1-y) * MAIN_SPEED / GameManager.getHeight();
        x += dx;
        y += dy;
    }

    public void initRadius() {
        radius = INIT_RADIUS;
    }

    public void growRadius(SimpleCircle circle) {
        // pi * newradius ^ 2 == pi * r^2 + pi * reat^2;
        // newradius = sqrt(r^2 + reat^2);
        radius = (int) Math.sqrt(Math.pow(radius,2) + Math.pow(circle.radius, 2));
    }
}
