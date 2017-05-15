package com.codekul.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        final Intent responsible = getIntent();
        Bundle bundle = responsible.getExtras();
        if (bundle != null) {
            String date = bundle.getString("keyDate");
            ((TextView)findViewById(R.id.textDate)).setText(date);
        }
    }

    public void onImageOne(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("keyImg", R.drawable.bike);

        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(RESULT_OK, intent);

        finish();
    }

    public void onImageTwo(View view) {

        Bundle bundle = new Bundle();
        bundle.putInt("keyImg", R.drawable.plane);

        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(RESULT_OK, intent);

        finish();
    }

    public void onImageThree(View view) {

        Bundle bundle = new Bundle();
        bundle.putInt("keyImg", R.drawable.train);

        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(RESULT_OK, intent);

        finish();
    }
}
