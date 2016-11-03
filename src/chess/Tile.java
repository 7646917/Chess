package chess;

import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 * Created by Daniel on 3/11/2016.
 */
public class Tile extends Base {
    private Color color;
    
    public Color getColor() {
        return color;
    }

    public Tile(String name, Image img, Point2D pos, Color color) {
        setName(name);
        setImg(img);
        setPos(pos);
        this.color = color;
    }

    public Tile(String name, Point2D pos, Color color) {
        setName(name);
        setPos(pos);
        this.color = color;
    }
    


}
