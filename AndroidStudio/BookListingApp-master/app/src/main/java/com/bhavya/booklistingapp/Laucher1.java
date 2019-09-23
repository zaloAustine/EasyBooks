package com.bhavya.booklistingapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import in.codeshuffle.typewriterview.TypeWriterView;

public class Laucher1 extends AppCompatActivity {
    TypeWriterView typeWriterView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laucher1);

        logoLauncher launcher = new logoLauncher();
        launcher.start();

       //Create Object and refer to layout view
                typeWriterView=(TypeWriterView)findViewById(R.id.textView);

        //Setting each character animation delay
        typeWriterView.setDelay(400);

        //Setting music effect On/Off
        typeWriterView.setWithMusic(true);

        //Animating Text
        String tt = typeWriterView.getText().toString();
        typeWriterView.animateText(tt);
    }


    class logoLauncher extends Thread{

        @Override
        public void run() {
            try{
                sleep(4000);

            }
            catch (Exception e){
                e.printStackTrace();
            }

            Intent main = new Intent(Laucher1.this, MainPage.class);
            startActivity(main);
            Laucher1.this.finish();



        }
    }

}
