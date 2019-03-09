package nolzulfiu.shopathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class ShoppingList extends AppCompatActivity {


    public void MainScreen() {
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingList.this, MainScreen.class);
                startActivity(intent);

            }
        });
    }
    public void SearchItem(){
        Button g = (Button) findViewById(R.id.button2);
        g.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShoppingList.this, MapsActivity.class);
                startActivity(intent);

            }
        });

    }

    AutoCompleteTextView textView=null;
    private ArrayAdapter<String> adapter;

    //These values show in autocomplete
    String item[]={
            "Milk", "Bread", "Butter", "Chips",
            "Apples", "Water", "Chocolate", "Coffee"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);
        MainScreen();
        SearchItem();

        textView = (AutoCompleteTextView) findViewById(R.id.Auto);

        //Create adapter
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, item);

        textView.setThreshold(1);

        //Set adapter to AutoCompleteTextView
        textView.setAdapter(adapter);

        textView.setOnClickListener(new TextView.OnClickListener() {
            public void onClick(View v) {

            }
        });
        //textView.setOnItemSelectedListener(this);
        //textView.setOnItemClickListener(this);
    }
}
