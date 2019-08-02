package com.example.parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_goto_activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_goto_activity = findViewById(R.id.btn_goto_activity);
        btn_goto_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Person person= new Person("Kiran","Nepali",28);

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra(SecondActivity.PERSON, person);
                startActivity(intent);
            }
        });

    }
}
