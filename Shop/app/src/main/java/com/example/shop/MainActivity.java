package com.example.shop;

import android.content.Intent;
import android.net.Uri;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST = 1;
    private TextView textview;
    private EditText editText;
    private static ArrayList<String> choices_list = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText2);
        if (savedInstanceState != null) {
            choices_list=savedInstanceState.getStringArrayList("choices_list");
        }
        Intent intent1 = getIntent();
        String message = intent1.getStringExtra(Main2Activity.EXTRA_MESSAGE);
        choices_list.add(message);
        show();

    }
    public void show(){
        for(int i=1;i<choices_list.size()&&i<10;i++)
        {
           String item_text = choices_list.get(i);
            String text_name = "textView"+i;
            int text_id = getResources().getIdentifier(text_name,"id",getPackageName());
            TextView textView = findViewById(text_id);
            int string_id = getResources().getIdentifier(item_text,"string",getPackageName());
            String message = getResources().getString(string_id);
            textView.setText(message);
        }

            }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putStringArrayList("choices_list",choices_list);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    public void locate(View view) {
        String loc = editText.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("shop", "Can't handle this intent!");
        }
    }
}
