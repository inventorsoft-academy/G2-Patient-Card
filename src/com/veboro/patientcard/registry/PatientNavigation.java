package com.veboro.patientcard.registry;

import com.veboro.patientcard.users.Patient;

import java.util.Scanner;

public class PatientNavigation {

    //unchecked choice
    private String rawChoise = "";
    //correct choice
    private int patientChoice = 0;
    String mainMenu = "\n1.Register \n2.Login";
    Patient patient;

    public PatientNavigation(int patientChoice) {
        this.patientChoice = patientChoice;

    }

    Scanner patientScanner = new Scanner(System.in);

    //Method call authentification patient menu
    public void patientAuthMenu(){

        if(patientChoice == 0){
            System.out.println("");
            System.out.println("Hello Patient, now you can: "+mainMenu);
            System.out.println("Enter your choice:");
            rawChoise = patientScanner.nextLine();

            try {
                patientChoice = Integer.parseInt(rawChoise);
            }catch (NumberFormatException e){

            }
            if(patientChoice == 1 || patientChoice == 2){
                if(patientChoice== 1){
                   patient = new Patient();
                    patient.isRegistered = true;
                    System.out.println("Hello "+patient.getUsername()+" now you can");
                    PatientNavigation.patientMainMenu();

                } else {
                    //log In
                    System.out.println("Log int");
                }
            } else {
                System.out.println("Enter correct number\n");
            }

        }
    }

    //Method call main patient menu
    public static void patientMainMenu(){
        System.out.println("1.View own diagnoses \n2.Choose doctor \n3.Register for doctor’s appointment \n4.View current diagnos"
        +"\n5.View assigned pills \nExport card");
    }
}
