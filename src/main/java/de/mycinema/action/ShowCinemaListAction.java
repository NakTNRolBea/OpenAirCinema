package de.mycinema.action;

import com.opensymphony.xwork2.Action;
import de.mycinema.model.OpenAirCinema;
import de.mycinema.service.OpenAirCinemaService;

import java.util.List;

public class ShowCinemaListAction implements Action{

    private List<OpenAirCinema> cinemaList;
    private OpenAirCinemaService openAirCinemaService;

    @Override
    public String execute() throws Exception {
        cinemaList = openAirCinemaService.loadAll();
        return SUCCESS;
    }

    public List<OpenAirCinema> getCinemaList() {
        return cinemaList;
    }

    public void setOpenAirCinemaService(OpenAirCinemaService openAirCinemaService) {
        this.openAirCinemaService = openAirCinemaService;
    }

}
