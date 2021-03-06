/*
 * Copyright (C) 2016  SamuelGjk <samuel.alva@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package moe.yukinoneko.gcomic.glide;

import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.LazyHeaders;

import moe.yukinoneko.gcomic.network.GComicApi;

/**
 * Created by SamuelGjk on 2016/4/18.
 */
public class GlideUrlFactory {
    public static GlideUrl newGlideUrlInstance(String url) {
        // @formatter:off
        return new GlideUrl(url, new LazyHeaders.Builder().addHeader("Referer", GComicApi.REFERER).build());
    }
}
