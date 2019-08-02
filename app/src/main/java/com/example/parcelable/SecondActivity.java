package com.example.parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView tv_fname, tv_sname, tv_age;
    public static final String PERSON = "person";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv_fname = findViewById(R.id.textView_fname);
        tv_sname = findViewById(R.id.textView2_sname);
        tv_age = findViewById(R.id.textView3_age);
        Person person = getIntent().getParcelableExtra(PERSON);
        tv_fname.setText(person.getFirstName());
        tv_sname.setText(person.getSecondName());
        tv_age.setText(String.valueOf(person.getAge()));

    }
}
