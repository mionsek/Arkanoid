import javax.swing.*;

public class Brick extends Shape {
    private boolean isDestroed;

    public Brick(int x, int y){
        initBrick(x, y);
    }

    private void initBrick(int x, int y) {
        isDestroed = false;
        this.x = x;
        this.y = y;

        loadImg();
        getImageDims();
    }

    private void loadImg() {
        ImageIcon img = new ImageIcon("src/resources/brick.png");
        image = img.getImage();
    }

    public boolean isDestroed() {
        return isDestroed;
    }

    public void setDestroed(boolean destroed) {
        isDestroed = destroed;
    }
}
