package com.app.main;

public class MainFive {
	
public static void main(String[] args) {
	String letra = "Welcome to Barcelona";
        
        String pal = "Stephen"; 
        
        for (int i = 0; i < pal.length(); i++) {
            char caracter = pal.charAt(i); 
            System.out.println(caracter); 
            System.out.println(letra.charAt(i));
        }
    }

}
