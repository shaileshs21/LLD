package com.search;

import com.constants.Genre;
import com.show.Movie;

import java.util.Date;
import java.util.List;

public class Catalog implements Search{
    @Override
    public List<Movie> searchByTitle(String title) {
        return null;
    }

    @Override
    public List<Movie> search_by_language(String language) {
        return null;
    }

    @Override
    public List<Movie> search_by_genre(Genre genre) {
        return null;
    }

    @Override
    public List<Movie> search_by_release_date(Date rel_date) {
        return null;
    }

    @Override
    public List<Movie> search_by_city(String city_name) {
        return null;
    }
}
