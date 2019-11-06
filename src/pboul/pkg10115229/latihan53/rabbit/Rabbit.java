/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan53.rabbit;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG
 
 */
public class Rabbit extends Animal{

    private final String color;
    private final String name;

    public Rabbit(String color, String name, boolean vegetarian, String food, int legs) {
        super(vegetarian, food, legs);
        this.color = color;
        this.name = name;
    }

    public Rabbit(String color, String name) {
        this.color = color;
        this.name = name;
    }

  

    public String getColor() {
        return color;
    }

   
    public String getName() {
        return name;
    }
  
    }
   
    
  
   
    
   


