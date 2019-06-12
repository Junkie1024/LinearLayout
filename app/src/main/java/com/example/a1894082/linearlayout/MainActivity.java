package com.example.a1894082.linearlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edit_uname, edit_pass;
    Button btn_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_uname = findViewById(R.id.edit_uname);
        edit_pass = findViewById(R.id.edit_pass);

        btn_sub = findViewById(R.id.btn_submit);

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uname=edit_uname.getText().toString();
                String pass=edit_pass.getText().toString();

                Bundle bundle= new Bundle();

                bundle.putString("un",uname);
                bundle.putString("ps",pass);

                Intent i = new Intent(MainActivity.this, LinearLayout_Main2Activity.class);

                i.putExtras(bundle);

                startActivity(i);

                //using noraml intent object

              /*  Intent i = new Intent(MainActivity.this, LinearLayout_Main2Activity.class);

                i.putExtra("un",uname);
                i.putExtra("ps",pass);

                startActivity(i);
                */
            }
        });
    }
}



