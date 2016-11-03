package chess;

import java.awt.Point;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.image.Image;

/**
 * Created by Daniel on 3/11/2016.
 */
public class Chessboard {
    private ArrayList<Tile> tiles;
    private ArrayList<GamePiece> pieces;
    private ArrayList<GamePiece> pawns;
    private int size;
    
    public Chessboard(int size) {
        this.size = size;
        createTiles();
        createPieces();
    }
    
    public ArrayList<Tile> getTiles(){
        return this.tiles;
    }

    public ArrayList<GamePiece> getPawns(){
        return this.pawns;
    }

    public ArrayList<GamePiece> getPieces(){
        return this.pieces;
    }

    
    /**
     * Create all the game pieces, place them in the correct spots.
     */
    private void createPieces() {
        //y2 and y7 all pawns.
        
        createPawns();

        //pieces.add(pieces.);
    }
    
    
    private void createPawns() {
        //create black pawns
        pawns = new ArrayList<>();
        //Point2D pos = new Point2D(0,0);
        for(int x = 0; x < size; x++){
          pawns.add(new Pawn("Pawn " + x, new Point2D(x,7),Color.BLACK ));
        }
        
    }

    /**
     * Create all the tiles, choose their name, position and color.
     */
    private void createTiles() {
        tiles = new ArrayList<>();
        for (int x = 1; x <= size ; x++) {
            for (int y = 1; y <= size; y++) {
                Point2D pt = new Point2D(x,y);
                tiles.add(new Tile(chooseName(x,y),pt,chooseColor(x,y)));
            }
        }
        setTileImage();
        ArrayList<Base> tileBase = (ArrayList)tiles;
        offsetPosition(tileBase);
        tileDebug();
    }
    
    private void offsetPosition(ArrayList<Base> units){
        //Offset the tiles x and y by its width and height. 
        for(Base t : units){
            double offsetX = t.getImg().getWidth();
            double offsetY = t.getImg().getWidth();
            t.setPos(new Point2D(t.getX() * offsetX, t.getY() * offsetY));
        }
    }
    
    private void setTileImage(){
        Image white = new Image("resources/tilewhite.png");
        Image black = new Image("resources/tileblack.png");
        for (Tile t: tiles) {
            if(t.getColor() == Color.BLACK){
                t.setImg(black);
            }else{
                t.setImg(white);
            }
        }
    }

    /**
     * Choose the color of the tile by
     * If x and y are both even, or x and y are both odd then white else black.
     * @param x
     * @param y
     * @return
     */
    private Color chooseColor(int x, int y) {

        Color result;
        if((x % 2 == 0 && y % 2 == 0) | (x % 2 != 0 && y % 2 != 0)){
            result = Color.WHITE;
        }else{
            result = Color.BLACK;
        }
        return result;
    }

    /**
     * Create a name for a tile by
     * Selecting a letter based upon the x coordinate, and cocatenate the Y coordinate, eg A1.
     * @param x
     * @param y
     * @return
     */
    private String chooseName(int x, int y) {
        String result = "";
        switch (x){
            case 1: result += "A";
                break;
            case 2: result += "B";
                break;
            case 3: result += "C";
                break;
            case 4: result += "D";
                break;
            case 5: result += "E";
                break;
            case 6: result += "F";
                break;
            case 7: result += "G";
                break;
            case 8: result += "H";
                break;
        }
        result += y; //Append the number of the y coordinate to the result.
        return result;
    }

    /**
     * Output all the tile information to the console.
     */
    private void tileDebug(){
        System.out.println(tiles.size() + " tiles");
        for (Tile t: tiles) {
            System.out.println(t.getName() + " " + t.getPos() + " " + t.getColor().toString());
        }

    }

}
