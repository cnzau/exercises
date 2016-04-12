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
public class MilitaryOp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Enemy alshabab = new Enemy(3, 3);
        Soldier cop = new Soldier(5, 6);
        SuperSoldier kdf = new SuperSoldier(10, 8);
        Player clement= new Player ("cnzau");
    }
    
}
