package com.example.prc3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;


public class MainActivity extends AppCompatActivity {

    @Override
   protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
            Log.d("lifecycle", "oncreate invoked");
   }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle", "onStart invoked");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.d("Lifecycle", "onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle", "onPause invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle", "onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle", "onDestroy invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle", "onStop invoked");
    }

}
