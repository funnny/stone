package com.yul.rastone.rastone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class BisangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bisang);

        Button buttonRun = (Button)findViewById(R.id.button_run); // 강화버튼

        final RadioButton radioButtonStat01 = (RadioButton)findViewById(R.id.radioButtonStat01); // 1번 스텟 라디오 버튼
        RadioButton radioButtonStat02 = (RadioButton)findViewById(R.id.radioButtonStat02); // 2번 스텟 라디오 버튼
        RadioButton radioButtonStat03 = (RadioButton)findViewById(R.id.radioButtonStat03); // 3번 스텟 라디오 버튼


        buttonRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(radioButtonStat01.isChecked()){ // 라디오버튼 잡아와야됨
                    System.out.println("1번 스탯");

                }

            }
        });
    }
}
