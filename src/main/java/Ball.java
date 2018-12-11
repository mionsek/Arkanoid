import jdk.javadoc.internal.tool.Start;

import javax.swing.*;

public class Ball extends Shape implements StartVariables{
    private int xDir;
    private int yDir;

    public Ball(){
        initBall();
    }

    private void initBall() {
        this.xDir = 1;
        this.yDir = -1;
    }

    public void loadImage(){
        ImageIcon ii = new ImageIcon("src/resources/ball.png");
        image = ii.getImage();
    }

    public void moveBall(){
        x += xDir;
        y += yDir;

        if(x == 0)
            setxDir(1);

        if(y == 0)
            setyDir(1);

        if(x == HEIGHT - getImgWidth()){
            setxDir(-1);
        }

    }

    private void setxDir(int xDir) {
        this.xDir = xDir;
    }

    private void setyDir(int yDir) {
        this.yDir = yDir;
    }

    public void resetCords(){
        x = INIT_BALL_X;
        y = INIT_BALL_Y;
    }

    public int getxDir() {
        return xDir;
    }

    public int getyDir() {
        return yDir;
    }
}
