package com.mapsdos.dariocampaa.coldeportes;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

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
    }

    public void onSearch(View view)
    {
        EditText location_tf = (EditText)findViewById(R.id.Tfaddress);
        String location = location_tf.getText().toString();
        List<Address> adressList = null;

        if (location != null || !location.equals("")){

            Geocoder geocoder = new Geocoder(this);
            try {
                adressList = geocoder.getFromLocationName(location, 15);
            }catch (IOException e){
                e.printStackTrace();
            }

            Address adress = adressList.get(0);
            LatLng latLng = new LatLng(adress.getLatitude() ,adress.getLongitude());
            mMap.addMarker(new MarkerOptions().position(latLng).title("USTED ESTA AQUI.").snippet("PROGRAMA HEVS"));
            mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
        }



    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(4.546701, -74.076914), 5));
        // Add a marker in Sydney and move the camera
        // LatLng sydney = new LatLng(3.359221, -73.217557);
        // mMap.addMarker(new MarkerOptions().position(sydney).title("BOGOTA COLOMBIA MONITOR DANIEL SALAZAR GRUPO LOS PANCHOS"));
        // mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        //MARCADORES CON BANDERAS

        // mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
        //       new LatLng(41.889, -87.622), 16));

        // You can customize the marker image using images bundled with
        // your app, or dynamically generated bitmaps.
        //mMap.addMarker(new MarkerOptions()
        //      .icon(BitmapDescriptorFactory.fromResource(R.drawable.HUE_GREEN))
        //    .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
        //  .position(new LatLng(41.889, -87.622)));

        //MARCADOR DE POSITION


        // LatLng sydney = new LatLng(3.359221, -73.217557);

        //MARCADOR PASTO
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("PROGRAMA ZARANDEATE PASTO HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(1.206489, -77.285806))
                        .snippet("COLISEO SERGIO ANTONIO RUANO AV BOYACA TELEFONO 7214442")


        );
        //MARCADOR ARAUCA
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("PROGRAMA A MOVERSE CAMARITA ARAUCA HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(7.086013, -70.726775))
                        .snippet("IMFORMACIÓN")


        );
        //MARCADOR ATLANTICO
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("PROGRAMA ATLANTICO EN MOVIMIENTO MAS ACTIVO Y SALUDABLE HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(10.998039, -74.856829))
                        .snippet("IMFORMACIÓN")


        );

        //MARCADOR BOLIVAR
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("PROGRAMA POR TU SALUD PONTE PILAS HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(11.998515, -75.419491))
                        .snippet("IMFORMACIÓN")


        );
        //MARCADOR BOYACA
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("PROGRAMA BOYACÁ MÁS ACTIVA HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(5.570071, -73.367605))
                        .snippet("IMFORMACIÓN")


        );
        //MARCADOR CALDAS
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("PROGRAMA MUEVETE, MUEVETE CALDAS PONTE EN MOVIMIENTO POR TU SALUD HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(5.073520, -75.521328))
                        .snippet("IMFORMACIÓN")


        );
        //MARCADOR CAQUETÁ
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("CAQUETÁ HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(1.666939, -75.619597))
                        .snippet("IMFORMACIÓN")
        );
        //MARCADOR CARTAGENA

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("ACTIVATE POR TU SALUD HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(10.391017, -75.482756))
                        .snippet("IMFORMACIÓN")
        );


        //MARCADOR CASANARE

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("CASANARE EN MOVIMIENTO HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(5.341214, -72.412212))
                        .snippet("IMFORMACIÓN")


        );

        //MARCADOR CAUCA

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("CAUCA EN MOVIMIENTO HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(2.468287, -76.621838))
                        .snippet("IMFORMACIÓN")


        );

        //MARCADOR CESAR

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("SUCRE ACTIVA Y SALUDABLE HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(10.547060, -73.233891))
                        .snippet("IMFORMACIÓN")

        );


        //MARCADOR CÓRDOBA

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("POR TU SALUD MUEVETE CORDOBES  HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(8.777439, -75.873012))
                        .snippet("IMFORMACIÓN")

        );

        //MARCADOR CÚCUTA

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("CÚCUTA PARA GRANDES COSAS HAGÁLE TOCHE! HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(7.880471, -72.488234))
                        .snippet("IMFORMACIÓN")

        );

        //MARCADOR GUAINÍA

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("GUAINIA SE MUEVE ACTIVA HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(3.898145, -67.926081))
                        .snippet("IMFORMACIÓN")

        );

        //MARCADOR HUILA

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("HUILA ACTIVO Y SALUDABLE HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(3.898145, -67.926081))
                        .snippet("IMFORMACIÓN")

        );
        //MARCADOR IBAGUE

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("IBAGUÉ ACTIVA Y SALUDABLE HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(4.446692, -75.258763))
                        .snippet("IMFORMACIÓN")

        );


        //MARCADOR LA GUAJIRA

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("GUAJIRA VIVA Y ACTIVA HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(11.581741, -72.917264))
                        .snippet("IMFORMACIÓN")

        );

        //MARCADOR NARIÑO

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("ZARANDÉATE NARIÑO HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(0.825836, -77.638556))
                        .snippet("IMFORMACIÓN")

        );


        //MARCADOR NORTE DE SANTANDER

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("POR UN NORTE ACTIVO Y SALUDABLE HAGALE TOCHE HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(7.405340, -72.636827))
                        .snippet("IMFORMACIÓN")

        );

        //MARCADOR PEREIRA

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("PEREIRA ACTIVA Y SALUDABLE HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(4.811692, -75.692155))
                        .snippet("IMFORMACIÓN")

        );

        //MARCADOR PUTUMAYO

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("PUTUMAYO SALUDABLE EN MOVIMIENTO HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(0.526112, -76.461515))
                        .snippet("IMFORMACIÓN")

        );

        //MARCADOR QUINDIO

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("PALPITA QUINDIO HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(4.527714, -75.683687))
                        .snippet("IMFORMACIÓN")

        );

        //MARCADOR RISARALDA

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("RISARALDA HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(4.803956, -75.705732))
                        .snippet("IMFORMACIÓN")

        );

        //MARCADOR SAN ANDRÉS

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("MUEVETE ISLEÑO HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(4.803956, -75.705732))
                        .snippet("IMFORMACIÓN")

        );


        //MARCADOR SANTANDER

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("SANTANDER VIVE SALUDABLE Y FELIZ HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(7.199136, -73.190622))
                        .snippet("IMFORMACIÓN")

        );


        //MARCADOR SUCRE

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("SUCRE ACTIVA Y SALUDABLE HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(9.372767, -75.430920))
                        .snippet("IMFORMACIÓN")

        );

        //MARCADOR TOLIMA

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("TOLIMA ACTIVA HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(4.509645, -75.243101))
                        .snippet("IMFORMACIÓN")

        );

        //MARCADOR VALLEDUPAR

        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.addMarker(new MarkerOptions()
                        .title("MUÉVETE POR TUSALUD VALLEDUPAR HEVS")
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                        .position(new LatLng(10.456629, -73.273997))
                        .snippet("IMFORMACIÓN")

        );














//
//        LatLng pos = new LatLng(1.20446, -77.27950);
//
//        mMap.addMarker(new MarkerOptions().position(pos).title("BOGOTA COLOMBIA MONITOR DANIEL SALAZAR").snippet("GRUPO LOS PANCHOS"));


   /*     mMap.addMarker(new MarkerOptions()
        .icon(BitmapDescriptorFactory.fromResource(R.drawable.powered_by_google_dark))
        .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
        .position(new LatLng(lat,lon)));*/

//        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pos, 13));

        //mMap.addMarker(new MarkerOptions()
        // .title("Colombia")
        // .snippet("DANIEL SALAZAR")
        //      .position();

        //  mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
        //  new LatLng(-18.142, 178.431), 2));

        // Other supported types include: MAP_TYPE_NORMAL,
        // MAP_TYPE_TERRAIN, MAP_TYPE_HYBRID and MAP_TYPE_NONE
        // mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

//DIBUJAR MARCADORES
        // Agregamos marcadores para indicar sitios de interéses.
        //   Marker myMaker = mMap.addMarker(new MarkerOptions()
        //         .position(position)
        //       .title(titulo)  //Agrega un titulo al marcador
        //     .snippet(info)   //Agrega información detalle relacionada con el marcador
        //   .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))); //Color del marcador

    }
}
