package nolzulfiu.shopathon;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    public void ShoppingList() {
        Button b = (Button) findViewById(R.id.button6);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapsActivity.this, ShoppingList.class);
                startActivity(intent);

            }
        });
    }
    public void MainScreen() {
        Button b = (Button) findViewById(R.id.button4);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapsActivity.this, MainScreen.class);
                startActivity(intent);

            }
        });
    }

    public void lidl() {
        Button l = (Button) findViewById(R.id.lidl);
        l.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                LatLng lidl = new LatLng(51.5352158, -0.4837677);
                mMap.addMarker(new MarkerOptions().position(lidl).title("Lidl"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(lidl));

            }
        });
    }

    public void sainsburys() {
        Button s = (Button) findViewById(R.id.sainsburys);
        s.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                LatLng sainsburys = new LatLng(51.5485243, -0.4752127);
                mMap.addMarker(new MarkerOptions().position(sainsburys).title("Sainsburys"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sainsburys));

            }
        });
    }

    public void costcutter(){
        Button c = (Button) findViewById(R.id.costcutter);
        c.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                LatLng costcutter = new LatLng(51.5332392, -0.4737381);
                mMap.addMarker(new MarkerOptions().position(costcutter).title("Costcutter"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(costcutter));

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        ShoppingList();
        MainScreen();
        lidl();
        sainsburys();
        costcutter();
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.setMyLocationEnabled(true);
    }
}
