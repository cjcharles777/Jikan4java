/*
 *
 * This file is part of Jikan4java.
 *
 * Jikan4java is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Foobar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Jikan4java.  If not, see <https://www.gnu.org/licenses/>.
 * /
 */

/*
 *
 * This file is part of Jikan4java.
 *
 * Jikan4java is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Foobar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Jikan4java.  If not, see <https://www.gnu.org/licenses/>.
 * /
 */

package com.github.Doomsdayrs.Jikan4java.types.Main.Person;
/*
This file is part of Jikan4java.

Jikan4java is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Foobar is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Jikan4java.  If not, see <https://www.gnu.org/licenses/>.
*/

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.Doomsdayrs.Jikan4java.types.Support.Basic.AnimeBasic;
import com.github.Doomsdayrs.Jikan4java.types.Support.Basic.CharacterBasic;

public class VoiceActingRoles {
    @JsonProperty("role")
    private String role;
    @JsonProperty("anime")
    private AnimeBasic animeBasic;
    @JsonProperty("character")
    private CharacterBasic characterBasic;

    public String getRole() {
        return role;
    }

    public AnimeBasic getAnimeBasic() {
        return animeBasic;
    }

    public CharacterBasic getCharacterBasic() {
        return characterBasic;
    }

    @Override
    public String toString() {
        return "VoiceActingRoles{" +
                "role='" + role + '\'' +
                ", animeBasic=" + animeBasic +
                ", characterBasic=" + characterBasic +
                '}';
    }
}
