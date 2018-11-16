package com.github.Doomsdayrs.Jikan4java.types.Main.Anime.Videos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

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
 * 30 / October / 2018
 *
 * @author github.com/doomsdayrs
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class Episode {
    @JsonProperty("title")
    private String title;

    @JsonProperty("episode")
    private String episode;

    @JsonProperty("url")
    private String url;

    @JsonProperty("image_url")
    private String image_url;

    /**
     * Gets title of episode
     *
     * @return episode title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets episode
     *
     * @return episode
     */
    public String getEpisode() {
        return episode;
    }

    /**
     * Gets URL
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Gets image url
     * @return url
     */
    public String getImage_url() {
        return image_url;
    }

    @Override
    public String toString() {
        return "Episode{" +
                "title='" + title + '\'' +
                ", episode='" + episode + '\'' +
                ", url='" + url + '\'' +
                ", image_url='" + image_url + '\'' +
                '}';
    }
}
