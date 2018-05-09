package com.mytimer.gozdekaval.mahkums;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;
    TextView t2;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkEditText()) {
                    int inputSize = Integer.valueOf(e.getText().toString());
                    Prisoner lastPrisoner = PrisonerUtil.getLastPrisoner(inputSize);
                    print(lastPrisoner);
                }
            }
        });
    }

    private void initViews(){
        t = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);
        e = findViewById(R.id.editText);
    }

    void print(Prisoner alivePrisoner){
        t.setText(String.valueOf(alivePrisoner.getNo()));
        t2.setText(getResources().getString(R.string.made_by));
    }

    boolean checkEditText(){
        if(e.getText().toString().equals("") || e.getText().toString().equals("0")) {
            t.setText(R.string.enter_prisoner);
            return false;
        }
        return true;
    }
}
