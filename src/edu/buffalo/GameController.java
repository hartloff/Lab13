package edu.buffalo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Controls the game logic including user inputs and movement as well as creating and
 * placing enemies, items, and the player. Implements KeyListener to handle keyboard inputs
 */
public class GameController implements KeyListener{

    private GameBoard board;

    /**
     * Initializes the game by adding all the game objects to the board
     */
    public GameController(GameBoard board){
        this.board = board;
        init();
    }


    private void init(){
    }



    @Override
    public void keyTyped(KeyEvent e){
    }

    @Override
    public void keyPressed(KeyEvent e){
    }

    @Override
    public void keyReleased(KeyEvent e){
    }

}
