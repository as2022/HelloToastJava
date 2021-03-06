package com.smithsona2.hellotoastjava;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
            Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
//        mButtonCount = (Button) findViewById(R.id.button_count);
        ++mCount;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
//            if (Integer.parseInt((mShowCount.getText().toString())) > 0) {
//                view.setBackgroundColor(Color.MAGENTA);
//            }
        }
    }

    public void zero(View view) {
//        mButtonZero = (Button) findViewById(R.id.button_zero);
        mCount = 0;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
//            if (Integer.parseInt((mShowCount.getText().toString())) > 0) {
//                view.setBackgroundColor(Color.GREEN);
//            }
        }
    }
}