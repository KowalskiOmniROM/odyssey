/*
 * Copyright (C) 2016  Hendrik Borghorst & Frederik Luetkes
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
 *
 */

package org.gateshipone.odyssey.activities;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

import org.gateshipone.odyssey.BuildConfig;
import org.gateshipone.odyssey.R;
import org.gateshipone.odyssey.utils.ThemeUtils;

public class OdysseyAboutActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Read theme preference
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        String themePref = sharedPref.getString("pref_theme", "indigo");
        boolean darkTheme = sharedPref.getBoolean("pref_key_dark_theme",true);
        if ( darkTheme) {
            switch (themePref) {
                case "indigo":
                    setTheme(R.style.AppTheme_indigo);
                    break;
                case "orange":
                    setTheme(R.style.AppTheme_orange);
                    break;
                case "deeporange":
                    setTheme(R.style.AppTheme_deepOrange);
                    break;
                case "blue":
                    setTheme(R.style.AppTheme_blue);
                    break;
                case "darkgrey":
                    setTheme(R.style.AppTheme_darkGrey);
                    break;
                case "brown":
                    setTheme(R.style.AppTheme_brown);
                    break;
                case "lightgreen":
                    setTheme(R.style.AppTheme_lightGreen);
                    break;
                case "red":
                    setTheme(R.style.AppTheme_red);
                    break;
            }
        } else {
            switch (themePref) {
                case "indigo":
                    setTheme(R.style.AppTheme_indigo_light);
                    break;
                case "orange":
                    setTheme(R.style.AppTheme_orange_light);
                    break;
                case "deeporange":
                    setTheme(R.style.AppTheme_deepOrange_light);
                    break;
                case "blue":
                    setTheme(R.style.AppTheme_blue_light);
                    break;
                case "darkgrey":
                    setTheme(R.style.AppTheme_darkGrey_light);
                    break;
                case "brown":
                    setTheme(R.style.AppTheme_brown_light);
                    break;
                case "lightgreen":
                    setTheme(R.style.AppTheme_lightGreen_light);
                    break;
                case "red":
                    setTheme(R.style.AppTheme_red_light);
                    break;
            }
        }
        if ( themePref.equals("oleddark") ) {
            setTheme(R.style.AppTheme_oledDark);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odyssey_about);

        String versionName = BuildConfig.VERSION_NAME;

        ((TextView)findViewById(R.id.activity_about_version)).setText(versionName);
        getWindow().setStatusBarColor(ThemeUtils.getThemeColor(this,R.attr.odyssey_color_primary_dark));
    }
}
