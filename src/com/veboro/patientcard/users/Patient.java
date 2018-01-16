package com.veboro.patientcard.users;

import com.veboro.patientcard.registry.Authentication;

import java.util.Scanner;

public class Patient implements Authentication{

    Scanner authScanner = new Scanner(System.in);

    private String username;
    private String password;
    public boolean isRegistered = false;

    public Patient() {
        register();
    }

    @Override
    public void register() {
        System.out.print("Enter your name: ");
        username = authScanner.nextLine();
    }

    @Override
    public boolean logIn() {
        return false;
    }

    public String getUsername() {
        return username;
    }
}
