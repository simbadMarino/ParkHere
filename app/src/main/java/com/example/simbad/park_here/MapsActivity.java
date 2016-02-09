package com.example.simbad.park_here;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.widget.ZoomControls;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        // Create an instance of GoogleAPIClient.


    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        LatLng place_d000001 = new LatLng(20.714660, -103.372347);
        LatLng place_d000002 = new LatLng(20.724660, -103.332347);
        LatLng place_d000003 = new LatLng(20.734660, -103.342347);
        LatLng place_d000004 = new LatLng(20.744660, -103.352347);
        LatLng place_d000005 = new LatLng(20.754660, -103.362347);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(place_d000001, 13));

        mMap.addMarker(new MarkerOptions()
                .title("CajonAirLib")
                .snippet("Cajon al aire libre")
                .draggable(true)
                .position(place_d000001));


        mMap.addMarker(new MarkerOptions()
                .title("Cochera")
                .snippet("Cerrada con Vigilancia")
                .draggable(true)
                .position(place_d000002));

        mMap.addMarker(new MarkerOptions()
                .title("Estacionamiendo")
                .snippet("Estacionamiento Publico")
                .draggable(true)
                .position(place_d000003));

        mMap.addMarker(new MarkerOptions()
                .title("Pension")
                .snippet("Cerrada con Vigilancia")
                .draggable(true)
                .position(place_d000004));

        mMap.addMarker(new MarkerOptions()
                .title("Cochera")
                .snippet("Abierta sin Vigilancia")
                .draggable(true)
                .position(place_d000005));
        // Add a marker in Sydney and move the camera
       /* LatLng casa = new LatLng(20.714660, -103.372347);
        mMap.addMarker(new MarkerOptions().position(casa).title("Mi Casa"));
        mMap.moveCamera();
        mMap.moveCamera(CameraUpdateFactory.newLatLng(casa));*/

    }
}
