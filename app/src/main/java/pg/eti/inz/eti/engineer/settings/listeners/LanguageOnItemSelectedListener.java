package pg.eti.inz.eti.engineer.settings.listeners;

import android.content.res.Configuration;
import android.view.View;
import android.widget.AdapterView;

import java.util.Locale;

/**
 * Listener for language spinner in settings
 */
public class LanguageOnItemSelectedListener implements AdapterView.OnItemSelectedListener {

    private final String POLISH = "Polski";
    private final String ENGLISH = "English";
    private final String POLISH_LOCALE = "pl";
    private final String ENGLISH_LOCALE = "en";

    public LanguageOnItemSelectedListener() {}

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        Configuration config = new Configuration();

        switch (parent.getItemAtPosition(pos).toString()) {
            case POLISH:
                Locale locale = new Locale(POLISH_LOCALE);
                config.locale = locale;
                break;
            case ENGLISH:
                config.locale = Locale.ENGLISH;
                break;
        }
        view.getResources().updateConfiguration(config, view.getResources().getDisplayMetrics());
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }
}
