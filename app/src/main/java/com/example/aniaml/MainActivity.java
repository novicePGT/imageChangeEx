package com.example.aniaml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2;
    CheckBox checkBox1;
    LinearLayout LinearLayout1;
    RadioGroup group1;
    RadioButton radioButton1, radioButton2, radioButton3;
    Button button1;
    ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ImageChangeEx");

        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        LinearLayout1 = (LinearLayout) findViewById(R.id.LinearLayout1);
        group1 = (RadioGroup) findViewById(R.id.group1);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        button1 = (Button) findViewById(R.id.button1);
        imageView1 = (ImageView) findViewById(R.id.imageView1);

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox1.isChecked() ==true) {
                    LinearLayout1.setVisibility(View.VISIBLE);
                }else {
                    LinearLayout1.setVisibility(View.INVISIBLE);
                }
            }
        });

        group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int CheckedId) {
                switch (CheckedId) {
                    case R.id.radioButton1:
                        imageView1.setImageResource(R.drawable.ic_android_black_24dp);
                        Toast.makeText(getApplicationContext(), "라디오버튼 1번", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton2:
                        imageView1.setImageResource(R.drawable.ic_android_green_24dp);
                        Toast.makeText(getApplicationContext(), "라디오버튼 2번", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton3:
                        imageView1.setImageResource(R.drawable.ic_android_red_24dp);
                        Toast.makeText(getApplicationContext(), "라디오버튼 3번", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        button1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                LinearLayout1.setVisibility(View.INVISIBLE);
                return false;
            }
        });
    }
}