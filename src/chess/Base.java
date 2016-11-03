package chess;

import javafx.geometry.Point2D;
import javafx.scene.image.Image;

/**
 * Created by Daniel on 3/11/2016.
 */
public abstract class Base {
    private String name;
    private Image img;
    private Point2D pos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public Point2D getPos() {
        return pos;
    }

    public void setPos(Point2D pos) {
        this.pos = pos;
    }
    
    public double getX(){
        return this.getPos().getX();
    }
    
    public double getY(){
        return this.getPos().getY();
    }
}
