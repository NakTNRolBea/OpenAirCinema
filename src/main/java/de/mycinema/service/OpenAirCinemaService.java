package de.mycinema.service;

import de.mycinema.model.OpenAirCinema;

import java.util.List;

/**
 * Created by 13912 on 14.10.2017.
 */
public interface OpenAirCinemaService {

    List<OpenAirCinema> loadAll();

    OpenAirCinema findBy(Long id);

    void save(OpenAirCinema openAirCinema);

    void delete(Long id);

}
