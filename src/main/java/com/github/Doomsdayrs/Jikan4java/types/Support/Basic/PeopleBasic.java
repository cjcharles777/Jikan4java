package com.github.Doomsdayrs.Jikan4java.types.Support.Basic;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.Doomsdayrs.Jikan4java.types.Main.Person.Person;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Objects;

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
 * 03 / November / 2018
 *
 * @author github.com/doomsdayrs
 */
public class PeopleBasic {
    @JsonProperty("mal_id")
    private int mal_id;

    @JsonProperty("url")
    private String url;

    @JsonProperty("image_url")
    private String image_url;

    @JsonProperty("name")
    private String name;

    public int getMal_id() {
        return mal_id;
    }

    public String getUrl() {
        return url;
    }

    public String getImage_url() {
        return image_url;
    }

    public String getName() {
        return name;
    }

    /**
     * Returns the Person object of this object
     *
     * @return Person Object
     * @throws IOException    IOException
     * @throws ParseException ParseException
     */
    public Person getPerson() throws IOException, ParseException {
        return new ObjectMapper().readValue(((JSONObject) new JSONParser().parse(Objects.requireNonNull(new OkHttpClient().newCall(new Request.Builder().url("api.jikan.moe/v3/person/" + mal_id).build()).execute().body()).string())).toJSONString(), Person.class);
    }

    @Override
    public String toString() {
        return "PeopleBasic{" +
                "mal_id=" + mal_id +
                ", url='" + url + '\'' +
                ", image_url='" + image_url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
