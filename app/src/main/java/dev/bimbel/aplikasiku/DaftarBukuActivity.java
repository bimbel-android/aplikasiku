package dev.bimbel.aplikasiku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class DaftarBukuActivity extends AppCompatActivity {

    private static final String TAG = DaftarBukuActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "onCreate: activity created");

        setContentView(R.layout.activity_daftar_buku);

        String title = getIntent().getExtras().getString("title");

        setTitle(title);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: activity start");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: activity stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ativity stop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: activity resume");
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: activity destroy");
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(TAG, "onBackPressed: activity back press");
    }
}
