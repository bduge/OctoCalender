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

    public double getCustomLat(EditText hello){
        String customLatString = hello.getText().toString();
        double customLat = Double.parseDouble(customLatString);
        return customLat;
    }

    public double getCustomLong(EditText hallo){
        String customLongString = hallo.getText().toString();
        double customLong = Double.parseDouble(customLongString);
        return customLong;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_menu);

        Button mButton = (Button) findViewById(R.id.CustomConfirm);
        final EditText mEditLat = (EditText) findViewById(R.id.CustomLat);
        final EditText mEditLong = (EditText) findViewById(R.id.CustomLong);

        mButton.setOnClickListener(new View.OnClickListener() {
           // @Override




            //Intent sendingIntent = new Intent(getCom, MapCustom.class);

            public void onClick(View view) {

                //startActivity(new Intent(CustomMenu.this, MapCustom.class));
                double customLat = getCustomLat(mEditLat);
                double customLong = getCustomLong(mEditLong);
                Intent sendingIntent = new Intent(getBaseContext(), MapCustom.class);
                sendingIntent.putExtra("customLat", customLat);
                sendingIntent.putExtra("customLong", customLong);
                startActivity(sendingIntent);
            }

        });

    }
}
