package dev.bimbel.aplikasiku;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import dev.bimbel.aplikasiku.model.Buku;

public class DaftarBukuActivity extends AppCompatActivity {

    private static final String TAG = DaftarBukuActivity.class.getSimpleName();
    private RecyclerView rvDaftarBuku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "onCreate: activity created");

        setContentView(R.layout.activity_daftar_buku);

        String title = getIntent().getExtras().getString("title");

        setTitle(title);

        renderView();
    }

    private void renderView() {
        rvDaftarBuku = (RecyclerView) findViewById(R.id.rv_daftarbuku);
        rvDaftarBuku.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<Buku> dataBuku(){
        List<Buku> list = new ArrayList<>();

        list.add(new Buku(R.drawable.zplayer,"Belajar android","Buku ini  ...."));
        list.add(new Buku(R.mipmap.ic_launcher,"Belajar Matematika","Buku ini  ...."));
        list.add(new Buku(R.mipmap.ic_launcher,"Belajar IPA","Buku ini  ...."));
        list.add(new Buku(R.mipmap.ic_launcher,"Belajar Bah. Inggris","Buku ini  ...."));
        list.add(new Buku(R.mipmap.ic_launcher,"Belajar IPS","Buku ini  ...."));
        list.add(new Buku(R.mipmap.ic_launcher,"Belajar PPKN","Buku ini  ...."));

        return list;
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
