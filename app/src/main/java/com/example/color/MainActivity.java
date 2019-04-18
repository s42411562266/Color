package com.example.color;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView redR,redG,redB,BIG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redR=findViewById(R.id.textView3);
        redG=findViewById(R.id.textView4);
        redB=findViewById(R.id.textView5);
        BIG=findViewById(R.id.textView6);
    }
    int size=20;
    String str=new String();
    public void changeC(View v){
        Random rand=new Random();
        int red=rand.nextInt(256);
        redR.setText("Red: "+red);
        redR.setTextColor(Color.rgb(red,0,0));
        int green=rand.nextInt(256);
        redG.setText("Green: "+green);
        redG.setTextColor(Color.rgb(0,green,0));
        int blue=rand.nextInt(256);
        redB.setText("Blue: "+blue);
        redB.setTextColor(Color.rgb(0,0,blue));
        str+=(red+", "+green+", "+blue+"\n");
        BIG.setTextSize(size);
        BIG.setMovementMethod(new ScrollingMovementMethod());
        BIG.setText(str);
        BIG.setTextColor(Color.rgb(red,green,blue));
    }
}
