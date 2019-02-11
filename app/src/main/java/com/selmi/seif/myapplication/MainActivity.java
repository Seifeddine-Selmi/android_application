package com.selmi.seif.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* setContentView(R.layout.activity_main); */

        // Test view with text
       /* TextView text = new TextView(this);
        text.setText("Bonjour, vous me devez 1 000 000€.");
        setContentView(text);*/

        // Use Class R to call resource string attribute app_name
       /* text = new TextView(this);
        text.setText(R.string.app_name);
        setContentView(text);*/

       // Update R.string.app_name with getResources
        String applicationName = getResources().getString(R.string.app_name);
        // Au lieu d'afficher "My Application" on va afficher "My way !"
        applicationName = applicationName.replace("Application", "way !");

        TextView view = new TextView(this);
        view.setText(applicationName);

        setContentView(view);
    }
}
