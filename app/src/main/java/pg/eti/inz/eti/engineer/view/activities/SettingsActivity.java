package pg.eti.inz.eti.engineer.view.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import pg.eti.inz.eti.engineer.R;
import pg.eti.inz.eti.engineer.settings.listeners.LanguageOnItemSelectedListener;

public class SettingsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_layout);

        Spinner languageSpinner = (Spinner) findViewById(R.id.languageSpinner);

        ArrayAdapter<CharSequence> languageAdapter = ArrayAdapter.createFromResource(this, R.array.settingsLanguages,
                R.layout.support_simple_spinner_dropdown_item);
        languageAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        languageSpinner.setAdapter(languageAdapter);
        languageSpinner.setOnItemSelectedListener(new LanguageOnItemSelectedListener());
    }
}
