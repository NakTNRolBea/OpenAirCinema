package de.mycinema.dao;

import de.mycinema.model.OpenAirCinema;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by 13912 on 14.10.2017.
 */
@Component
public class OpenAirCinemaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<OpenAirCinema> loadAll() {
        return entityManager.createQuery("select c from OpenAirCinema c",
                OpenAirCinema.class).getResultList();
    }

    public OpenAirCinema findById(Long id) {
        return entityManager.find(OpenAirCinema.class, id);
    }

    public void save(OpenAirCinema openAirCinema) {
        entityManager.persist(openAirCinema);
    }

    public void delete(OpenAirCinema openAirCinema) {
        entityManager.remove(openAirCinema);
    }

}

