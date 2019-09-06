package com.example.sliders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSeekBar;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import com.appyvet.materialrangebar.RangeBar;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private AppCompatSeekBar appCompatSeekBar;
    private TextView txtSeekBarValue;
    private TextView txtRangeBarValue;
    private RangeBar rangeBar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appCompatSeekBar = findViewById(R.id.SeekBar_ID);
        txtSeekBarValue = findViewById(R.id.AppCompatSeekBarValue_ID);
        rangeBar1 = findViewById(R.id.RangeBar1_ID);
        txtRangeBarValue = findViewById(R.id.RangeBar2TXT_ID);

        appCompatSeekBar.setProgress(0);
        appCompatSeekBar.setKeyProgressIncrement(1);
        appCompatSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                String value = String.valueOf(i);
                txtSeekBarValue.setText(value);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        rangeBar1.setSeekPinByIndex(0);
        rangeBar1.setPinTextColor(getResources().getColor(R.color.colorAccent));
        rangeBar1.setSelectorColor(getResources().getColor(R.color.colorAccent));
        rangeBar1.setTickColors(getResources().getColor(R.color.colorAccent));
        rangeBar1.setConnectingLineColor(getResources().getColor(R.color.colorAccent));
        rangeBar1.setBarColor(getResources().getColor(R.color.colorAccent));
        rangeBar1.setPinColor(getResources().getColor(R.color.colorAccent));
        rangeBar1.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onRangeChangeListener(RangeBar rangeBar, int leftPinIndex, int rightPinIndex, String leftPinValue, String rightPinValue) {
                txtRangeBarValue.setText(rightPinValue);
            }

            @Override
            public void onTouchStarted(RangeBar rangeBar) {

            }

            @Override
            public void onTouchEnded(RangeBar rangeBar) {

            }
        });
    }
}
