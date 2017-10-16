package de.mycinema.service;

import de.mycinema.dao.OpenAirCinemaDAO;
import de.mycinema.model.OpenAirCinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

// Strg + i = Methoden vom Interface importieren

@Component
public class OpenAirCinemaServiceImpl implements OpenAirCinemaService {

    @Autowired
    private OpenAirCinemaDAO openAirCinemaDAO;

    @Override
    public List<OpenAirCinema> loadAll() {
        return openAirCinemaDAO.loadAll();
    }

    @Override
    public OpenAirCinema findBy(Long id) {
        return openAirCinemaDAO.findById(id);
    }

    @Override
    public void save(OpenAirCinema openAirCinema) {
        openAirCinemaDAO.save(openAirCinema);
    }

    @Override
    public void delete(Long id) {
        OpenAirCinema cinema = openAirCinemaDAO.findById(id);
        if (cinema != null) {
            openAirCinemaDAO.delete(cinema);
        }
    }
}
