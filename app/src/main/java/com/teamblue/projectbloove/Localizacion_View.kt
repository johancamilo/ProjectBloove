package com.teamblue.projectbloove

import android.Manifest
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class Localizacion_View : AppCompatActivity(){
    private lateinit var mMap: GoogleMap
    lateinit var mapFragment: SupportMapFragment

    companion object{
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_localizacion__view)

        mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(OnMapReadyCallback {
            mMap = it
            val location1 = LatLng(4.588761, -74.204319)
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location1,10f))
            mMap.addMarker(MarkerOptions().position(location1).title("Fundación Hematologica Colombia"))

            val location2 = LatLng(4.615269, -74.093879)
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location2,10f))
            mMap.addMarker(MarkerOptions().position(location2).title("IDCBIS"))

            val location3 = LatLng(4.636991, -74.065320)
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location3,10f))
            mMap.addMarker(MarkerOptions().position(location3).title("Clínica de Marly, Banco de Sangre"))

            val location4 = LatLng(4.615472, -74.094118)
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location4,10f))
            mMap.addMarker(MarkerOptions().position(location4).title("Hemocentro Distrital"))

            val location5 = LatLng(4.649579, -74.063639 )
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location5,10f))
            mMap.addMarker(MarkerOptions().position(location5).title("Fundacion Hematologica Colombia"))

            val location6 = LatLng(4.654183, -74.063192)
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location6,10f))
            mMap.addMarker(MarkerOptions().position(location6).title("Punto móvil # 14 - Donación de Sangre"))

            val location7 = LatLng( 4.657599, -74.058677)
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location7,10f))
            mMap.addMarker(MarkerOptions().position(location7).title("Punto móvil # 11 - Donación de Sangre"))

            val location8 = LatLng(4.663467, -74.060266 )
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location8,10f))
            mMap.addMarker(MarkerOptions().position(location8).title("Punto móvil # 10 - Donación de Sangre"))

            val location9 = LatLng(4.664953, -74.060605 )
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location9,10f))
            mMap.addMarker(MarkerOptions().position(location9).title("Punto móvil # 9 - Donación de Sangre"))

            val location10 = LatLng(4.672653, -74.048639)
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location10,10f))
            mMap.addMarker(MarkerOptions().position(location10).title("Punto móvil # 8 - Donación de Sangre"))

            val location11 = LatLng(4.673127, -74.088688)
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location11,10f))
            mMap.addMarker(MarkerOptions().position(location11).title("Banco Nacional De Sangre Cruz Roja Colombiana"))

            val location12 = LatLng(4.747166, -74.045910)
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location12,10f))
            mMap.addMarker(MarkerOptions().position(location12).title("Banco de sangre Colsanitas"))

            val location13 = LatLng(4.757447, -74.046424            )
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location13,10f))
            mMap.addMarker(MarkerOptions().position(location13).title("Punto móvil # 2 - Donación de Sangre"))

            val location14 = LatLng(4.763047, -74.045121)
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location14,10f))
            mMap.addMarker(MarkerOptions().position(location14).title("Punto móvil # 3 - Donación de Sangre"))

            mMap.uiSettings.isZoomControlsEnabled = true
            setUpMap()

        })
    }
   private fun setUpMap(){
       if (ActivityCompat.checkSelfPermission(this,
           android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
           ActivityCompat.requestPermissions(this,
           arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
               LOCATION_PERMISSION_REQUEST_CODE)
           return
       }
       mMap.isMyLocationEnabled = true
       mMap.mapType=GoogleMap.MAP_TYPE_HYBRID
   }
}
