/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package militaryop;

/**
 *
 * @author nzau
 */
public class SuperSoldier extends Enemy {
    public SuperSoldier(int  hitPoints, int lives) {
        super(hitPoints, lives);
    }

    @Override
    public void takeDamage(int damage) {
         super.takeDamage(damage/2);
    }   
}

