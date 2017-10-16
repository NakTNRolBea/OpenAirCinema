package de.mycinema.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by 13912 on 14.10.2017.
 */

@Entity
public class OpenAirCinema {
    private Long id;
    private String name;
    private Integer carSpaceCount;
    private Date openingDate;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCarSpaceCount() {
        return carSpaceCount;
    }

    public void setCarSpaceCount(Integer carSpaceCount) {
        this.carSpaceCount = carSpaceCount;
    }

    @Temporal(TemporalType.DATE)
    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }
}
