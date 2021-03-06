package com.github.Doomsdayrs.Jikan4java.types.Main.Season;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * This file is part of Jikan4java.
 * Jikan4java is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * Foobar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with Jikan4java.  If not, see <https://www.gnu.org/licenses/>.
 * ====================================================================
 * Jikan4java
 * 01 / November / 2018
 *
 * @author github.com/doomsdayrs
 */
public class SeasonSearch {
    @JsonProperty("request_hash")
    private String request_hash;

    @JsonProperty("request_cached")
    private boolean request_cached;

    @JsonProperty("request_cache_expiry")
    private int request_cache_expiry;

    @JsonProperty("season_name")
    private String season_name;

    @JsonProperty("season_year")
    private int season_year;

    @JsonProperty("anime")
    private ArrayList<SeasonSearchAnime> animes;

    public String getRequest_hash() {
        return request_hash;
    }

    public boolean isRequest_cached() {
        return request_cached;
    }

    public int getRequest_cache_expiry() {
        return request_cache_expiry;
    }

    public String getSeason_name() {
        return season_name;
    }

    public int getSeason_year() {
        return season_year;
    }

    public ArrayList<SeasonSearchAnime> getAnimes() {
        return animes;
    }

    @Override
    public String toString() {
        return "SeasonSearch{" +
                "request_hash='" + request_hash + '\'' +
                ", request_cached=" + request_cached +
                ", request_cache_expiry=" + request_cache_expiry +
                ", season_name='" + season_name + '\'' +
                ", season_year=" + season_year +
                ", animes=" + animes +
                '}';
    }
}
