package com.map.personalitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class home extends AppCompatActivity implements View.OnClickListener {
    Button start,abt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        start=findViewById(R.id.startid);
        start.setOnClickListener(this);
        abt=findViewById(R.id.aboutid2);
        abt.setOnClickListener(this);



    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){

            //When User Clicks the 16 Personalities button then the Test will start and the new activity opened is PersonalityMenu
            case R.id.aboutid2:
                Intent intent1=new Intent(this,PersonalityMenu.class);
                startActivity(intent1);

                break;

            //When User Clicks the Start Test button then the Test will start and the new activity opened is FirstActivity
            case R.id.startid:
                Intent intent2=new Intent(this,FirstActivity.class);
                Toast.makeText(this,"Let's begin !", Toast.LENGTH_SHORT).show();
                startActivity(intent2);
                finish();
                break;
            /*case R.id.team:
                Intent intent4=new Intent(this,TeamInfo.class);
                startActivity(intent4);
                break;*/ //Removed activity

        }


    }

}
