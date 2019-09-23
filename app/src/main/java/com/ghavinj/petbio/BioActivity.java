package com.ghavinj.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {
    private ImageView petImageView;
    private TextView petNameTextView;
    private TextView petBioTextView;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        petImageView = (ImageView)findViewById(R.id.petBioImageView);
        petNameTextView = (TextView)findViewById(R.id.petNameTextView);
        petBioTextView = (TextView)findViewById(R.id.bioTextView);


        extras = getIntent().getExtras();

        if (extras != null){
            String name = extras.getString("name");
            String bio = extras.getString("bio");
            setUp(name, bio);
        }

    }

    public void setUp(String name, String bio){
        if (name.equals("Prego")){
            //We Show Dog Stuff
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_dog));
            petNameTextView.setText(name);
            petBioTextView.setText(bio);

        }else if (name.equals("Midas")) {
            //We show Cat stuf
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_cat));
            petNameTextView.setText(name);
            petBioTextView.setText(bio);
        }

    }


}
