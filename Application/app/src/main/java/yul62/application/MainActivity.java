package yul62.application;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }
    public void onButton2Clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-1234-5678"));
        startActivity(intent);
    }
    public void onButton3Clicked(View v){
        Intent intent = new Intent(Intent.ACTION_SENDTO,Uri.parse("smsto:010-1234-5678"));
        intent.putExtra("sms_body", "hello?");
        startActivity(intent);
    }
    public void onButton4Clicked(View v){
        Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
        startActivity(intent);
    }
}
