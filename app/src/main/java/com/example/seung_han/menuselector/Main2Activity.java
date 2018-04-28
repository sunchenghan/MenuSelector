package com.example.seung_han.menuselector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    Button button2;
    EditText t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12;
    public String i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button2 = findViewById(R.id.button2);
        t1 = findViewById(R.id.editText1);
        t2 = findViewById(R.id.editText2);
        t3 = findViewById(R.id.editText3);
        t4 = findViewById(R.id.editText4);
        t5 = findViewById(R.id.editText5);
        t6 = findViewById(R.id.editText6);
        t7 = findViewById(R.id.editText7);
        t8 = findViewById(R.id.editText8);
        t9 = findViewById(R.id.editText9);
        t10 = findViewById(R.id.editText10);
        t11 = findViewById(R.id.editText11);
        t12 = findViewById(R.id.editText12);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1 = t1.getText().toString();
                i2 = t2.getText().toString();
                i3 = t3.getText().toString();
                i4 = t4.getText().toString();
                i5 = t5.getText().toString();
                i6 = t6.getText().toString();
                i7 = t7.getText().toString();
                i8 = t8.getText().toString();
                i9 = t9.getText().toString();
                i10 = t10.getText().toString();
                i11 = t11.getText().toString();
                i12 = t12.getText().toString();
                openActivityOne();
            }
        });

    }
    public void openActivityOne() {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("i1",i1);
        intent.putExtra("i2",i2);
        intent.putExtra("i3",i3);
        intent.putExtra("i4",i4);
        intent.putExtra("i5",i5);
        intent.putExtra("i6",i6);
        intent.putExtra("i7",i7);
        intent.putExtra("i8",i8);
        intent.putExtra("i9",i9);
        intent.putExtra("i10",i10);
        intent.putExtra("i11",i11);
        intent.putExtra("i12",i12);
        startActivity(intent);
    }
}
