/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.util.ArrayList;
import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

/**
 *
 * @author Daniel
 */
public class Pawn extends GamePiece {

    public Pawn(String name, Point2D pos, Color color) {
        super(name, pos, color);
        setImage();
    }
    
    private void setImage(){
        if(this.getColor() == Color.BLACK){
            setImg(new Image("resources/pawnblack.png"));
        }else if(this.getColor() == Color.WHITE){
            setImg(new Image("resources/pawnwhite.png"));
        }
    }
    
    @Override
    public void move(Tile newPos) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Tile> legalMoves() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }
    
}
