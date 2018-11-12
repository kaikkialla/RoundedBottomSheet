package com.example.tiget.modalbottomsheet;

import android.support.annotation.NonNull;
import android.support.design.bottomappbar.BottomAppBar;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView link = findViewById(R.id.linkTextView);
        link.setText("https://youtube.com/watch?v=text");
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RoundedBottomSheetDialogFragment bottomSheet = new RoundedBottomSheetDialogFragment();
                bottomSheet.show(getSupportFragmentManager(), "BottomSheet");
            }
        });




    }
}
