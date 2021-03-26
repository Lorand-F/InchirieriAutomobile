package com.example.inchiriereautomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TimePicker;

import com.google.android.material.textfield.TextInputLayout;

public class AddActivity extends AppCompatActivity {

    private TextInputLayout tilName;
    private SeekBar seekBarNrZileInchiriate;
    private RadioGroup rgMarcaMasina;
    private TimePicker tmDataInchirierii;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        tilName=findViewById(R.id.tiet_name);
        seekBarNrZileInchiriate=findViewById(R.id.seekBar);
        rgMarcaMasina=findViewById(R.id.rg_marci);
        tmDataInchirierii=findViewById(R.id.time_picker_actions);


    }
}