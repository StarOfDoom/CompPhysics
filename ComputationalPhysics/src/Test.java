/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brett
 */
public class Test {
    public static void main(String[] args) {
//        for (int i = 0; i < 100000; i++) {
//            Vector a = new Vector(Math.random()*100,Math.random()*100,Math.random()*100);
//            Vector b = new Vector(Math.random()*100,Math.random()*100,Math.random()*100);
//            Vector c = a.add(b);
//            double dub = a.dotProduct(b);
//            Vector d = a.crossProduct(b);
//            
//        }
        Vector a = new Vector(1,3,-5);
        Vector b = new Vector(4,-2,-1);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("mag(a) = " + a.mag);
        System.out.println("mag(b) = " + b.mag);
        
        System.out.println("a•b = " + a.dotProduct(b));
        System.out.println("a•a = " + a.dotProduct(a));
        System.out.println("b•a = " + b.dotProduct(a));
        System.out.println("a+b = " + a.add(b));
        System.out.println("a-b = " + a.subtract(b));
        System.out.println("b-a = " + b.subtract(a));
        System.out.println("axb = " + a.crossProduct(b));
        System.out.println("axa = " + a.crossProduct(a));
        System.out.println("bxa = " + b.crossProduct(a));
    }
}
