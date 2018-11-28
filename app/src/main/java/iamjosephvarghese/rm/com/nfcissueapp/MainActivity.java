package iamjosephvarghese.rm.com.nfcissueapp;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button proceed;
    EditText ip_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        proceed = findViewById(R.id.proceed);
        ip_address = findViewById(R.id.ip_address);


        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ip_address.getText().toString().equals("")){
                    Snackbar.make(findViewById(R.id.rootView),"Enter IP Address", Snackbar.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(MainActivity.this,Home.class);
                    startActivity(intent);
                }
            }
        });



    }
}
