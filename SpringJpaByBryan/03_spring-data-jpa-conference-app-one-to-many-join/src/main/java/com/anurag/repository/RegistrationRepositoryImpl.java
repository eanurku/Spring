package com.anurag.repository;

import com.anurag.models.Registration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository(value = "registrationRepository")
public class RegistrationRepositoryImpl implements RegistrationRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Registration save(Registration registration) {

        entityManager.persist(registration);

        entityManager.flush();
        return registration;
    }
}
