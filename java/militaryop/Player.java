/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package militaryop;

import java.util.InputMismatchException;

/**
 *
 * @author nzau
 */
public class Player {
    
    private String handleName;
    private int lives, score, level;

    public Player(String handleName) {
//            this.handleName = handleName;
        setHandleName(handleName);  //uses the method to set handlename>=4
        this.lives = 3;
        this.score = 0;
        this.level = 1;
    }
    public String getHandleName() {
            return handleName;
    }
    public void setHandleName(String handleName) {
        try{
            if (handleName.length() >= 4) {
                this.handleName = handleName;
            } else {
                System.out.println("Name too short");
            }
        } catch (InputMismatchException e) {
            System.out.println();
        }
    }
    public int getLives() {
            return lives;
    }
    public void setLives(int lives) {
            this.lives = lives;
    }
    public int getScore() {
            return score;
    }
    public void setScore(int score) {
            this.score = score;
    }
    public int getLevel() {
            return level;
    }
    public void setLevel(int level) {
            this.level = level;
    }
}
