package com.pay.easou_mick.easoupay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup mRG;
    private Button mPay;
    private  int mCurrentPay = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRG = (RadioGroup) findViewById(R.id.radiogroup);

        mPay = (Button) findViewById(R.id.pay);

        mRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.mm:
                        mCurrentPay = 0;
                        break;
                    case R.id.wo:
                        mCurrentPay = 1;
                        break;
                    case R.id.ctcc:
                        mCurrentPay = 2;
                        break;

                }
            }
        });


        mPay.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        switch(mCurrentPay){
                                            case 0:
                                            case 1:
                                            case 2:
                                            Toast.makeText(MainActivity.this,"ss"+mCurrentPay,Toast.LENGTH_SHORT).show();
                                                break;
                                        }
                                    }
                                }
        );
    }
}
