package com.selmi.seif.myapplication;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout layout = null;
    private TextView text = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
       /*
        5- On récupère notre layout par désérialisation. La méthode inflate retourne un View
        C'est pourquoi on caste (on convertit) le retour de la méthode avec le vrai type de
        notre layout, c'est-à-dire ConstraintLayout

        android.support.constraint.ConstraintLayout Reacine dans le ressource xml activity_main
        */


        layout = (ConstraintLayout) ConstraintLayout.inflate(this, R.layout.activity_main, null);
        // … puis on récupère TextView grâce à son identifiant
        text = (TextView) layout.findViewById(R.id.text);
        text.setText("Et cette fois, ça fonctionne !");
        setContentView(layout);
        // On aurait très bien pu utiliser « setContentView(R.layout.activity_main) » bien sûr !




        // 4- Call identifiant id create in R.layout.activity_main
       /* text = (TextView)findViewById(R.id.text);
        text.setText("Le texte de notre TextView");
        // N'oubliez pas que cette fonction n'utilise que des entiers
        text.setPadding(50, 60, 70, 90);*/

        // 1- Test view with text
       /* TextView text = new TextView(this);
        text.setText("Bonjour, vous me devez 1 000 000€.");
        setContentView(text);*/

        // 2- Use Class R to call resource string attribute app_name
       /* text = new TextView(this);
        text.setText(R.string.app_name);
        setContentView(text);*/

       // 3- Update R.string.app_name with getResources
    /*    String applicationName = getResources().getString(R.string.app_name);
        // Au lieu d'afficher "My Application" on va afficher "My way !"
        applicationName = applicationName.replace("Application", "way !");

        TextView view = new TextView(this);
        view.setText(applicationName);

        setContentView(view);*/
    }
}
