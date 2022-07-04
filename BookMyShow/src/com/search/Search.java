package com.search;

import com.constants.Genre;
import com.show.Movie;

import java.util.Date;
import java.util.List;

public interface Search {
    public List<Movie> searchByTitle(String title);

    public List<Movie> search_by_language(String language);


    public List<Movie> search_by_genre(Genre genre);


    public List<Movie> search_by_release_date(Date rel_date);


    public List<Movie> search_by_city(String city_name);

}
