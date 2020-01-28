package com.example.abhicheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    CheckBox android, java, python, php, unity3D;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initiate views
        android = (CheckBox) findViewById(R.id.androidCheckBox);
        android.setOnClickListener(this);
        java = (CheckBox) findViewById(R.id.javaCheckBox);
        java.setOnClickListener(this);
        python = (CheckBox) findViewById(R.id.pythonCheckBox);
        python.setOnClickListener(this);
        php = (CheckBox) findViewById(R.id.phpCheckBox);
        php.setOnClickListener(this);
        unity3D = (CheckBox) findViewById(R.id.unityCheckBox);
        unity3D.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.androidCheckBox:
                Toast.makeText(this, "Android", Toast.LENGTH_SHORT).show();
                break;
                case R.id.javaCheckBox:
                Toast.makeText(this, "Java", Toast.LENGTH_SHORT).show();
                break;case R.id.pythonCheckBox:
                Toast.makeText(this, "Python", Toast.LENGTH_SHORT).show();
                break;case R.id.phpCheckBox:
                Toast.makeText(this, "PHP", Toast.LENGTH_SHORT).show();
                break;case R.id.unityCheckBox:
                Toast.makeText(this, "unity", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
