package com.yul.rastone.rastone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonBisang = (Button)findViewById(R.id.button_stone01);

        buttonBisang.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        BisangActivity.class
                );
                System.out.println("버튼1");
                startActivity(intent);
                System.out.println("버튼2");
            }
        });



    }

//    RadioButton.OnClickListener radioButtonOnClickListener = new RadioButton.OnClicklistener(){
//        public void onClick(View view) {
//            Toast.makeText(MainActivity.this, "라디오버튼", Toast.LENGTH_SHORT).show();
//        }
//
//    };

//    public void pushButtonStone01(View v) {
//        Toast.makeText(getApplicationContext(), "비상의 돌", Toast.LENGTH_SHORT).show(); // 하단에 둥그런 메시지를 보여준다.
//
//
//
//        public void onClick(View view) {
//            Intent intent = new Intent(
//                    getApplicationContext(),
//                    BisangActivity.class
//            );
//            startActivity(intent);
//        }
//
//
//
//    }


}
