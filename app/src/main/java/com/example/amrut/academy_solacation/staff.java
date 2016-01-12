package com.example.amrut.academy_solacation;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class staff extends Activity {
    Button bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);


        bt3 = (Button) findViewById(R.id.btn_id3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nw3 =new Intent(getApplication(), menu.class);
                startActivity(nw3);
            }
        });
    }

}
