package com.iutblagnac.r303trace;

/**
 * Hello world!
 * 
 * @author THEOPHILE Adrien 
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(hello());
    }

    /**
     * méthode retournant un string
     * 
     * @return "Hello World !"
     */
    public static String hello() {
        return  "Hello World!" ;
    }

    /**
     * méthode retournant un string passé en paramètre
     * 
     * @return param le String passé en paramètre
     */
    public static String hello(String param) {
        return  param ;
    }
    
}
