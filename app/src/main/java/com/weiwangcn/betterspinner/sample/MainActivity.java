package com.weiwangcn.betterspinner.sample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import com.weiwangcn.betterspinner.R;
import com.weiwangcn.betterspinner.library.BetterSpinner;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


public class MainActivity extends AppCompatActivity {

//    @BindView(R.id.spinner1) BetterSpinner spinner1;
//    @BindView(R.id.spinner2) MaterialBetterSpinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BetterSpinner spinner1 = findViewById(R.id.spinner1);
        MaterialBetterSpinner spinner2 = findViewById(R.id.spinner2);

        String[] list = getResources().getStringArray(R.array.month);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, list);

        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_visit_repo) {
            Uri uri = Uri.parse("https://github.com/Lesilva/BetterSpinner");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);


            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
