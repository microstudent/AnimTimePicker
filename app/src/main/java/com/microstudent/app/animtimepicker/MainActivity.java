package com.microstudent.app.animtimepicker;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void close(View view) {
        this.finish();
    }

    public void openTimePicker(View view) {
        TimePickerDialog dialog  = new TimePickerDialog(this,null,24,60,true);
        dialog.show();
    }
}
