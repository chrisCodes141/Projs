/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Class
 */
public class program_81class {
    //variables
    //properties/state
    public String breed;
    public String eyeColor;
    public String furColor;
    private int age;
    private String bark;
    public String eatdrink;
    //constructor
    
    public program_81class (String dogType){
        breed=dogType;
    }
    //methods
    public int getAge(){
        return age;
    }
    public void setAge(int howold){
        age=howold*7;
    }
    public String getBark(){
        return bark;
    }
    public void setBark(String sound){
        bark = sound+"! ! ! !";
    }
}
