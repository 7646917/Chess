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
        if(color == Color.BLACK){
            setImg(new Image("resources/pawnblack"));
        }else if(color == Color.WHITE){
            setImg(new Image("resources/pawnwhite"));
        }
    }
    
    @Override
    public void move(Tile newPos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Tile> legalMoves() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
