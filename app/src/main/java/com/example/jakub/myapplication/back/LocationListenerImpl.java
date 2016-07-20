package com.example.jakub.myapplication.back;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;

/**
 * Listens for the callbacks from OS. Updates the LocationProvider
 */
public class LocationListenerImpl implements LocationListener {
    private LocationProvider locationProvider;

    public LocationListenerImpl(LocationProvider locationProvider) {
        this.locationProvider = locationProvider;
    }

    public void onLocationChanged(Location location) {
        locationProvider.SetLocation(location);
        Log.d("log.gps","onLocationChanged");
    }

    public void onStatusChanged(String provider, int status, Bundle extras) {
        Log.d("log.gps","onStatusChanged");
    }

    public void onProviderEnabled(String provider) {
        Log.d("log.gps","onProviderEnabled");
    }

    public void onProviderDisabled(String provider) {
        Log.d("log.gps","onProviderDisabled");
    }
}
