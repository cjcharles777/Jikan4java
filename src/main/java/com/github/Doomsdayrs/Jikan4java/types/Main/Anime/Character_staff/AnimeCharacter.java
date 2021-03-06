package com.github.Doomsdayrs.Jikan4java.types.Main.Anime.Character_staff;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.Doomsdayrs.Jikan4java.types.Support.Voice_actors;

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
 * 28 / October / 2018
 *
 * @author github.com/doomsdayrs
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class AnimeCharacter {
    @JsonProperty("mal_id")
    private int mal_id;

    @JsonProperty("url")
    private String url;

    @JsonProperty("image_url")
    private String image_url;

    @JsonProperty("name")
    private String name;

    @JsonProperty("role")
    private String role;

    @JsonProperty("voice_actors")
    private ArrayList<Voice_actors> voice_actors;

    /**
     * Gets MAL id
     *
     * @return returns myanimelist id
     */
    public int getMal_id() {
        return mal_id;
    }

    /**
     * Gets URL
     *
     * @return returns url of character
     */
    public String getUrl() {
        return url;
    }

    /**
     * Gets image URL
     *
     * @return returns image of character
     */
    public String getImage_url() {
        return image_url;
    }

    /**
     * Gets name
     *
     * @return Name of character
     */
    public String getName() {
        return name;
    }

    /**
     * Gets role of character
     *
     * @return role of character
     */
    public String getRole() {
        return role;
    }

    /**
     * Gets voice actors of anime
     *
     * @return voice actors of character
     */
    public ArrayList<Voice_actors> getVoice_actors() {
        return voice_actors;
    }

    @Override
    public String toString() {
        return "CharacterList{" +
                "mal_id=" + mal_id +
                ",\n url='" + url + '\'' +
                ",\n image_url='" + image_url + '\'' +
                ",\n name='" + name + '\'' +
                ",\n role='" + role + '\'' +
                ",\n voice_actors=" + voice_actors +
                '}';
    }
}
