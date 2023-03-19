package com.example.class1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_Panel extends AppCompatActivity {

    private EditText panel_edt_name ;
    private Button panel_btn_ok;
    private TextView panel_lbl_result;
    private Button panel_btn_a;
    private Button panel_btn_b;
    private Button panel_btn_c;
    private ImageView panel_img_background;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);

        findViows();

        panel_img_background.setImageResource();

//        Glide
//                .with(myFragment)
//                .load(url)
//                .centerCrop()
//                .placeholder(R.drawable.loading_spinner)
//                .into(myImageView);

        panel_btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickOk();
            }
        });
        panel_btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchText(view);
            }
        });
        panel_btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchText(view);
            }
        });
        panel_btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchText(view);
            }
        });
//        panel_btn_ok.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Log.d("ppt","my button click");
//            }
//        });
    }

    private void clickOk() {

        String input = panel_edt_name.getText().toString();
       panel_lbl_result.setText(input);
    }

    private void switchText(View view) {


        if(!((Button) view).getText().equals("hi"))
        ((Button)view).setText("hi");

       else {
            if (((String) view.getTag()).equals("a"))
                ((Button) view).setText("a");
            else if (((String) view.getTag()).equals("b"))
                ((Button) view).setText("B");
            else
                ((Button) view).setText("C");
        }

    }

    private void findViows() {

    panel_edt_name = findViewById(R.id.panel_edt_name);
    panel_btn_ok = findViewById(R.id.panel_btn_ok);
    panel_lbl_result = findViewById(R.id.panel_lbl_result);
        panel_btn_a = findViewById(R.id.panel_btn_a);
        panel_btn_b = findViewById(R.id.panel_btn_b);
        panel_btn_c = findViewById(R.id.panel_btn_c);
        panel_img_background=findViewById(R.id.panel_img_background);
    }


}