package com.veboro.patientcard.users;

import com.veboro.patientcard.registry.Authentication;

public class Doctor implements Authentication {

    @Override
    public void register() {
    }

    @Override
    public boolean logIn() {
        return false;
    }
}
