package com.anurag.repository;

import com.anurag.models.Registration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository(value = "registrationRepository")
public class RegistrationRepositoryImpl implements RegistrationRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Registration save(Registration registration) {

        entityManager.persist(registration);

        return registration;
    }

    @Override
    public Registration getRegistration(Long id) {
        return entityManager.find(Registration.class,id);
    }

    @Override
    public List<Registration> findAll() {
        List<Registration> registrations = entityManager.createQuery("select r from Registration r").getResultList();

        return registrations;
    }
}
