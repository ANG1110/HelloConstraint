package com.example.helloconstraint;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0; //Click the value count start for zero.
    private TextView mShowCount;
    private Button mZero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mZero = (Button) findViewById(R.id.button_zero);
    }


    public void showToast(View view){
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);

        toast.show();
    }

    public void countUp(View view){
        ++mCount;
        if (mShowCount !=null)
            mShowCount.setText(Integer.toString(mCount));

    }

    public void resetCount(View view){
        mCount = 0;
        mShowCount.setText(String.valueOf(mCount));
        mZero.setBackgroundColor(Color.LTGRAY);

    }
}