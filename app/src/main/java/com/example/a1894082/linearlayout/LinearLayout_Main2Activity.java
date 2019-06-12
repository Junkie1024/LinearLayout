package com.example.a1894082.linearlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LinearLayout_Main2Activity extends AppCompatActivity {


    String uname,upass;
    TextView txt_uname,txt_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout__main2);

        Bundle bundle = getIntent().getExtras();

        uname= bundle.getString("un");
        upass=bundle.getString("upass");



      /*  Intent i = getIntent();

        uname=i.getStringExtra("un");
        upass=i.getStringExtra("ps");
      */

        txt_uname=findViewById(R.id.lb1_uname);
        txt_pass=findViewById(R.id.lb1_pass);

        txt_uname.setText(uname);
        txt_pass.setText(upass);
    }
}

