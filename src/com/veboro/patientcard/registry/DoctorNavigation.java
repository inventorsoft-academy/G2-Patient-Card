package com.veboro.patientcard.registry;

public class DoctorNavigation {

    private int doctorChoice = 0;

    public DoctorNavigation(int doctorChoice) {
        this.doctorChoice = doctorChoice;

    }

    //Method call main doctor menu
    public void doctorMenu(){

        if(doctorChoice == 0){
            System.out.println("");
            System.out.println("Hello Doctor, now you can: \n1.Register \n2.Login");
        }
    }
}
