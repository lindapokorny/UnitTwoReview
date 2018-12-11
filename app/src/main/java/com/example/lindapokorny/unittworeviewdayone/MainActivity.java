package com.example.lindapokorny.unittworeviewdayone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity Jose";
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "I am in onCreate");
        editText = (EditText) findViewById(R.id.main_edit_text);
        if (savedInstanceState != null){
            editText.setText(savedInstanceState.getString("editText"));
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "I am in onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "I am in onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "I am in onPausee");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "I am in onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "I am in onDestroy");
    }
//explicit intent:
    /*public void buttonClickSaysGo(View view){
        Intent intent = new Intent(MainActivity.this, NavAcivity.class);
        intent.putExtra("name", "Jose");
        startActivity(intent);
    }*/
    //implicit intent:
    public void buttonClickSaysGo(View view){
        Uri phoneUri = Uri.parse("tel:5165610392");
        Intent intent = new Intent(Intent.ACTION_DIAL, phoneUri);
        startActivity(intent);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        editText.getText().toString();
        outState.putString("editText", editText.getText().toString());
    }
}
