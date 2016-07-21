package pg.eti.inz.main.back;

import android.location.Location;
import android.location.LocationListener;
import android.util.Log;

/**
 * Created by jakub on 21.07.16.
 */
public abstract class LocationProvider {
    private Location location;
    private LocationListener locationListener = new LocationListenerImpl(this);

    public LocationListener GetLocationListener() {
        Log.d("log.LocationProvider","GetLocationListener");
        return locationListener;
    }

    /// Pass something more ...
    abstract public void onLocationUpdate(Location location);

    public void SetLocation(Location location) {
        Log.d("log.LocationProvider","SetLocation");
        this.location = location;
        // calc speed etc

        onLocationUpdate(location);
    }
}
