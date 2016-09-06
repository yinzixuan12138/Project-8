package com.example.yinzixuan.project_8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static String TAG="LIFICYCLE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"(1)onCreate()");
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.i(TAG,"(2) onStart()");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.i(TAG,"(3) onRestart()");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.i(TAG,"(4) onResume()");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.i(TAG,"(5) onPause()");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.i(TAG,"(6) onStop()");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"(7) onDestroy()");
    }
}
