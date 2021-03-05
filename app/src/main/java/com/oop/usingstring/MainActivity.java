package com.oop.usingstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t2.setText(R.string.Msg1);


        Log.i("Lifecycle","onCreate() invoke;");
    }
    public  void  onStart(){
        super.onStart();
        Log.i("Lifecycle","onStart() invoke;");
    }
    public  void  onRestart(){
        super.onRestart();
        Log.i("Lifecycle","onRestart() invoke;");
    }
    public  void  onResume(){
        super.onResume();
        Log.i("Lifecycle","onResume() invoke;");
    }
    public  void  onDestroy(){
        super.onDestroy();
        Log.i("Lifecycle","onDestroy() invoke;");
    }


}