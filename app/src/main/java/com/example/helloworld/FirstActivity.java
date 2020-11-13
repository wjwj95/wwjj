package com.example.helloworld;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){
            if (requestCode == RESULT_OK){
                String msg = data.getStringExtra("msg");
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("","");
        setContentView(R.layout.botton1);

        Button button1 = findViewById(R.id.Button1);
        button1.setOnClickListener(new View.OnClickListener() {
               @Override
                 public void onClick(View v) {
                 /*  Intent intent = new Intent();
                    intent.setData(Uri.parse("tel:123456778999"));
                    startActivity(intent);*/

                   Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                   startActivityForResult(intent,1);
                   Bundle bundle = new Bundle();
                   Message msg = new Message("张三","M",20);
                   bundle.putParcelable("msg",msg);
                   intent.putExtra("Message",bundle);
                   startActivity(intent);
                 }
            });






    }
}