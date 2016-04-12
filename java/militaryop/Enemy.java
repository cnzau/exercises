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
public class Enemy {
    	private int hitPoints;
	private int lives;
	
	public Enemy(int hitPoints, int lives) {
		this.hitPoints = hitPoints;
		this.lives = lives;
	}
	
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}
	public int getLives() {
		return lives;
	}
	
	public void takeDamage(int damage) {
		int rem = hitPoints - damage;
		hitPoints = rem;
		System.out.print(hitPoints);
	}
}
