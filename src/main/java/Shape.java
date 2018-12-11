import java.awt.*;

public class Shape {
    int x;
    int y;
    private int imgWidth;
    private int imgHeight;
    Image image;

    public void setImage(Image image) {
        this.image = image;
    }

    public void setImgHeight(int imgHeight) {
        this.imgHeight = imgHeight;
    }

    public void setImgWidth(int imgWidth) {
        this.imgWidth = imgWidth;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Image getImage() {
        return image;
    }

    public int getImgHeight() {
        return imgHeight;
    }

    public int getImgWidth() {
        return imgWidth;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Rectangle getRect(){
        return new Rectangle(x, y, image.getWidth(null), image.getHeight(null));
    }

    public void getImageDims(){
        imgWidth = image.getWidth(null);
        imgHeight = image.getHeight(null);
    }

}

