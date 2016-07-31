package pg.eti.inz.settings;

import java.util.Map;

/**
 * Created by Manio on 2016-07-30.
 */
public class Settings {

    private Map<String, Object> settingsMap;

    public Settings() {
        //TODO pobieranie ustawien z bazy
    }

    public Map<String, Object> getSettingsMap() {
        return settingsMap;
    }

    public void setSettingsMap(Map<String, Object> settingsMap) {
        this.settingsMap = settingsMap;
    }
}
