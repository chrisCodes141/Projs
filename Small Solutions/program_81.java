/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Class
 */
public class program_81 {
    public static void main(String[] args){
        // lets build a dog
        program_81class dog1 = new program_81class("corgi");
        
        dog1.eyeColor="blonde";
        dog1.furColor="blue";
        dog1.eatdrink="slurp or chomp";
        dog1.setAge(1);
        dog1.setBark("woof");
        
        System.out.println(dog1.breed);
        System.out.println(dog1.eyeColor);
        System.out.println(dog1.furColor);
        System.out.println(dog1.getAge());
        System.out.println(dog1.getBark());
        System.out.println(dog1.eatdrink);
    }
    
}
