package com.anurag.repository;

import com.anurag.models.Registration;

import java.util.List;

public interface RegistrationRepository {
    Registration addRegistration(Registration registration);

    Registration getRegistration(Long id);

    List<Registration> findAll();
}
