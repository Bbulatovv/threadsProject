/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interface_java;

/**
 *
 * @author User
 */

class Some implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++)
            System.out.println("Number - " + i);
    }
    
}

public class Inter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread new_one = new Thread();
        Thread new_two = new Thread();
        
        new_one.start();
        new_two.start();
        
    }
    
}
