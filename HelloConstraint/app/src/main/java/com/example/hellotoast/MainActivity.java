package com.example.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mShowCount;
    private TextView mButtonCount;
    private TextView mButtonZero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mButtonCount  = (TextView) findViewById(R.id.button_count);
        mButtonZero  = (TextView) findViewById(R.id.button_zero);

    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        if( mCount%2==0){
            mButtonCount.setBackgroundColor(0xFFFF0000);
        }
        if( mCount%2==1){
            mButtonCount.setBackgroundColor(0xFF008577);
        }
        if( mCount!=0){
            mButtonZero.setBackgroundColor(0xFFFFFF00);
        }

    }

    public void showZero(View view){
        mCount=0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        if( mCount==0){
            mButtonZero.setBackgroundColor(0xFF90908A);
        }
    }
}
