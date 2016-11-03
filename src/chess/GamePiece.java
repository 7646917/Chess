package chess;

import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.util.ArrayList;

/**
 * Created by Daniel on 3/11/2016.
 */
public abstract class GamePiece extends Base {

    private Color color;
    private PieceType pieceType;

    public GamePiece(Color color, PieceType pieceType) {
        this.color = color;
        this.pieceType = pieceType;
    }

    public GamePiece(String name, Point2D pos, Color color) {
        setName(name);
        setPos(pos);
        this.color = color;
    }

    public GamePiece(String name, Image img, Point2D pos, Color color, PieceType pieceType) {
        setName(name);
        setImg(img);
        setPos(pos);
        this.color = color;
        this.pieceType = pieceType;
    }

    public abstract void move(Tile newPos);
    public abstract ArrayList<Tile> legalMoves();

}
