package com.uca.apps.isi.nct;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.uca.apps.isi.nct.activities.SignInActivity;
import com.vlonjatg.android.apptourlibrary.AppTour;
import com.vlonjatg.android.apptourlibrary.MaterialSlide;

public class Tour extends AppTour {



    @Override
    public void init( Bundle savedInstanceState) {

        int firstColor = Color.parseColor("#0097A7");
        int secondColor = Color.parseColor("#FFA000");
        int customSlideColor = Color.parseColor("#009866");

        //Create pre-created fragments
        Fragment firstSlide = MaterialSlide.newInstance(R.drawable.user_icon, "Primer Imagen",
                "Get stuff done with or without an internet connection.", Color.WHITE, Color.WHITE);

        Fragment secondSlide = MaterialSlide.newInstance(R.drawable.water_icon, "Segunda imagen",
                "Write on your own or invite more people to contribute.", Color.WHITE, Color.WHITE);

        //Add slides
        addSlide(firstSlide, firstColor);
        addSlide(secondSlide, secondColor);

        //Custom slide
        //addSlide(new CustomSlide(), customSlideColor);

        //Customize tour
        setSkipButtonTextColor(Color.WHITE);
        setNextButtonColorToWhite();
        setDoneButtonTextColor(Color.WHITE);
        setSkipText("Saltar");
        
    }

    @Override
    public void onSkipPressed() {
        Toast.makeText(Tour.this, "Skip funciona", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Tour.this, SignInActivity.class);
        finish();
       startActivity(intent);

    }

    @Override
    public void onDonePressed() {

        Toast.makeText(Tour.this, "Done funciona", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Tour.this, SignInActivity.class);
        finish();
        startActivity(intent);

    }
}
