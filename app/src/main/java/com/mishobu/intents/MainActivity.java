package com.mishobu.intents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText lat, lon;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lat = (EditText) findViewById(R.id.lat);
        lon = (EditText) findViewById(R.id.lon);
    }

    public void showMe(View v) {
        String _lat = lat.getText().toString();
        String _lon = lon.getText().toString();
        Uri uri = Uri.parse("geo:" + _lat +"," + _lon);

        Toast.makeText(getApplicationContext(), "geo:" + _lat +"," + _lon, Toast.LENGTH_LONG).show();

        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
