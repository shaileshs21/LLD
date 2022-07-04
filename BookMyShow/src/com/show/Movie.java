package com.show;

import com.actors.SystemMember;
import com.constants.Genre;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie {
    int movieId;
    String title;
    String description;
    int durationInMins;
    String language;
    Date releaseDate;
    String country;
    Genre genre;
    SystemMember addedBy;
    List<Show> shows;


    public Movie(String title, String description, int durationInMins, String language, Date releaseDate, String country, Genre genre, SystemMember addedBy) {
        this.title = title;
        this.description = description;
        this.durationInMins = durationInMins;
        this.language = language;
        this.releaseDate = releaseDate;
        this.country = country;
        this.genre = genre;
        this.addedBy = addedBy;
        this.shows = new ArrayList<>();
    }

    public List<Show> getShows(){
        return shows;
    }
}
