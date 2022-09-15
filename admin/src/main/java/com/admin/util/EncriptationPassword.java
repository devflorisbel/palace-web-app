package com.admin.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author flori
 */
public class EncriptationPassword {
    
    public static void main(String[] args) {
        
        var password = "123";
        System.out.println("password: " + password);
        System.out.println("password encriptado: " + passwordEncriptation(password));
    }
    
    public static String passwordEncriptation(String password){
        
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
        
    }
    
}
