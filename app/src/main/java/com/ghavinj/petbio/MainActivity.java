package com.ghavinj.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView catImageView;
    private ImageView dogImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catImageView = (ImageView)findViewById(R.id.catImageView);
        dogImageView = (ImageView)findViewById(R.id.dogImageView);

        catImageView.setOnClickListener(this);
        dogImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.catImageView:
                //Go to second Activity
                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("name", "Midas");
                catIntent.putExtra("bio", "Midas is a cat's cat he loves snowballs and warm baths!");
                startActivity(catIntent);

                //Toast.makeText(MainActivity.this,"Cat was pressed!", Toast.LENGTH_LONG).show();
                break;

            case R.id.dogImageView:
                //Go to third Activity
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name", "Prego");
                dogIntent.putExtra("bio", "Great Dog, Prego is a loveble guy and loves dirt and digging holes!");
                startActivity(dogIntent);

                //Toast.makeText(MainActivity.this,"Dog was pressed!", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
