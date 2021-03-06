package com.reynaldiwijaya.mengenalbuah;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnMasuk)
    public void onViewClicked() {
        Intent pindah = new Intent(this, MainActivity.class);
        startActivity(pindah);
    }
}
