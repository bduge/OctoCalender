package com.ocecream.octocalender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class CustomMenu extends AppCompatActivity {

    Button mButton;
    EditText mEditLat;
    EditText mEditLong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_menu);

        mButton = (Button) findViewById(R.id.CustomConfirm);
        mEditLat = (EditText) findViewById(R.id.CustomLat);
        mEditLong = (EditText) findViewById(R.id.CustomLong);

        mButton.setOnClickListener(new View.OnClickListener() {
           // @Override


            public double getCustomLat(){
                String customLatString = mEditLat.getText().toString();
                double customLat = Double.parseDouble(customLatString);
                return customLat;
            }

            public double getCustomLong(){
                String customLongString = mEditLong.getText().toString();
                double customLong = Double.parseDouble(customLongString);
                return customLong;
            }

            //Intent sendingIntent = new Intent(getCom, MapCustom.class);

            public void onClick(View view) {

                //startActivity(new Intent(CustomMenu.this, MapCustom.class));
                double customLat = getCustomLat();
                double customLong = getCustomLong();
                Intent sendingIntent = new Intent(getBaseContext(), MapCustom.class);
                sendingIntent.putExtra("customLat_1", customLat);
                sendingIntent.putExtra("customLong_1", customLong);
                startActivity(sendingIntent);
                startActivity(new Intent(CustomMenu.this, MapCustom.class));

            }

        });

    }
}
