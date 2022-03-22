package com.abhideveloper.animalpedia;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //when button A is clicked
        Button ape = findViewById(R.id.button_a);
        ape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentA = new Intent(getApplicationContext(), AlphabetA.class);
                startActivity(intentA);
            }
        });

        //when button B is clicked
        Button bear = findViewById(R.id.button_b);
        bear.setOnClickListener(view -> {
            Intent intentB = new Intent(getApplicationContext(), AlphabetB.class);
            startActivity(intentB);
        });
        //when button C is clicked
        Button cat = findViewById(R.id.button_c);
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetC.class);
                startActivity(numberIntent);
            }
        });
        //when button D is clicked
        Button dog = findViewById(R.id.button_d);
        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetD.class);
                startActivity(numberIntent);
            }
        });
        //when button E is clicked
        Button elephant = findViewById(R.id.button_e);
        elephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetE.class);
                startActivity(numberIntent);
            }
        });
        //when button F is clicked
        Button fox = findViewById(R.id.button_f);
        fox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetF.class);
                startActivity(numberIntent);
            }
        });
        //when button G is clicked
        Button gazele = findViewById(R.id.button_g);
        gazele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetG.class);
                startActivity(numberIntent);
            }
        });
        //when button H is clicked
        Button horse = findViewById(R.id.button_h);
        horse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetH.class);
                startActivity(numberIntent);
            }
        });
        //when button I is clicked
        Button impala = findViewById(R.id.button_i);
        impala.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetI.class);
                startActivity(numberIntent);
            }
        });
        //when button J is clicked
        Button jaguar = findViewById(R.id.button_j);
        jaguar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetJ.class);
                startActivity(numberIntent);
            }
        });
        //when button K is clicked
        Button kangaroo = findViewById(R.id.button_k);
        kangaroo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetK.class);
                startActivity(numberIntent);
            }
        });
        //when button L is clicked
        Button leopard = findViewById(R.id.button_l);
        leopard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetL.class);
                startActivity(numberIntent);
            }
        });
        //when button M is clicked
        Button monkey = findViewById(R.id.button_m);
        monkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetM.class);
                startActivity(numberIntent);
            }
        });
        //when button N is clicked
        Button numbat = findViewById(R.id.button_n);
        numbat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetN.class);
                startActivity(numberIntent);
            }
        });
        //when button O is clicked
        Button orangatun = findViewById(R.id.button_o);
        orangatun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetO.class);
                startActivity(numberIntent);
            }
        });
        //when button P is clicked
        Button polarbear = findViewById(R.id.button_p);
        polarbear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetP.class);
                startActivity(numberIntent);
            }
        });
        //when button Q is clicked
        Button quokka = findViewById(R.id.button_q);
        quokka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetQ.class);
                startActivity(numberIntent);
            }
        });
        //when button R is clicked
        Button rabbit = findViewById(R.id.button_r);
        rabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetR.class);
                startActivity(numberIntent);
            }
        });
        //when button S is clicked
        Button sheep = findViewById(R.id.button_s);
        sheep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetS.class);
                startActivity(numberIntent);
            }
        });
        //when button T is clicked
        Button tiger = findViewById(R.id.button_t);
        tiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetT.class);
                startActivity(numberIntent);
            }
        });
        //when button U is clicked
        Button anaconda = findViewById(R.id.button_u);
        anaconda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetU.class);
                startActivity(numberIntent);
            }
        });
        //when button V is clicked
        Button vulture = findViewById(R.id.button_v);
        vulture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetV.class);
                startActivity(numberIntent);
            }
        });
        //when button W is clicked
        Button warthog = findViewById(R.id.button_w);
        warthog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetW.class);
                startActivity(numberIntent);
            }
        });
        //when button X is clicked
        Button xerus = findViewById(R.id.button_x);
        xerus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetX.class);
                startActivity(numberIntent);
            }
        });
        //when button Y is clicked
        Button yak = findViewById(R.id.button_y);
        yak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetY.class);
                startActivity(numberIntent);
            }
        });
        //when button Z is clicked
        Button zebra = findViewById(R.id.button_z);
        zebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(getApplicationContext(), AlphabetZ.class);
                startActivity(numberIntent);
            }
        });



    }

}