package edu.android.apitest;

import android.location.Address;
import android.location.Geocoder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView textView ;
    private Geocoder geocoder ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        geocoder = new Geocoder(this);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView2);
        textView.setText("위도 127.031266 , 경도 37.499207");
    }
    public void getAdress(){
        double d1 = 37.499;//위도
        double d2 = 127.031;//경도
        List<Address> list =null;
        try {
            list = geocoder.getFromLocation(d1,d2,10);
        } catch (IOException e) {
            e.printStackTrace();
            Log.e("exception","애러다 ");
        }
        if (list != null) {
            if (list.size() == 0) {
                textView.setText("해당되는 주소 정보는 없습니다");
            } else {
                textView.setText(list.get(0).toString());
            }
        }
    }

    public void onClickButton(View view) {
        getAdress();
    }
}
