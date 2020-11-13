package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity","调用 onStart()");
    }



    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity","调用 onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity","调用 onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity","调用 onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity","调用 onDestroy()");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        Button normalBtn =findViewById(R.id.start_normal_activity);
        normalBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity2.this,NormalActivity.class);

                startActivity(intent1);

            }
        });
        Button diama1Btn =findViewById(R.id.start_dialog_activity);
        normalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(MainActivity2.this,DialogActivity.class);
                intent2.putExtra("123","12345");

                startActivity(intent2);

            }
        });
    }
}