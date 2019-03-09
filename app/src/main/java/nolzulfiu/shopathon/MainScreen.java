package nolzulfiu.shopathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity{

    public void ShoppingList() {
        Button b = (Button) findViewById(R.id.List);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, ShoppingList.class);
                startActivity(intent);

            }
        });
    }
    public void SearchItem(){
        Button g = (Button) findViewById(R.id.Search);
        g.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainScreen.this, MapsActivity.class);
                startActivity(intent);

            }
        });

    }

    private Button btn1;
    private Button btton1;
    private Button btton2;
    private Button btton3;
    private Button btton4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        ShoppingList();
        SearchItem();






    }
}
