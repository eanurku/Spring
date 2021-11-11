package com.anurag.services;

import com.anurag.models.Registration;

import java.util.List;

public interface RegistrationService {
    Registration addRegistration(Registration registration);

    Registration getRegistration(Long id);

    List<Registration> findAll();
}
