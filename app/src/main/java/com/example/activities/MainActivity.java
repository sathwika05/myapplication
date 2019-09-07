package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.UriPermission;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.t1);
    }
    public void hii(View view)
    {
        String s=e1.getText().toString();
        Uri uri= Uri.parse("tel:9100726529");
        Intent i=new Intent(Intent.ACTION_DIAL,uri);
        i.putExtra("hai",s);
        startActivity(i);
    }
}
