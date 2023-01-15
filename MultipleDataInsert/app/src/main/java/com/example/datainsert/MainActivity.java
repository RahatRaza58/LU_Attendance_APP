package com.example.datainsert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText text1,text2,text3,text4,text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View view) {
        text1= findViewById(R.id.text1);
        text2= findViewById(R.id.text2);
        text3= findViewById(R.id.text3);
        text4= findViewById(R.id.text4);
        text5= findViewById(R.id.text5);


        String sl= text1.getText().toString().trim();
        String name= text2.getText().toString().trim();
        String dept= text3.getText().toString().trim();
        String sid= text4.getText().toString().trim();
        String mobile= text5.getText().toString().trim();

        collectedData collect = new collectedData(name,dept,sid,mobile);

        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference root = db.getReference("student");
        root.child(sl).setValue(collect);

        text1.setText("");
        text2.setText("");
        text3.setText("");
        text4.setText("");
        text5.setText("");

        Toast.makeText(getApplicationContext(),"Data Inserted Successfully", Toast.LENGTH_SHORT).show();



    }

    /*public void process(View view){
        text1 = findViewById(R.id.text1);


        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference root = db.getReference();
        root.setValue(text1.getText().toString());
        text1.setText("");
        Toast.makeText(getApplicationContext(),"data insert", Toast.LENGTH_SHORT).show();
    }*/
}