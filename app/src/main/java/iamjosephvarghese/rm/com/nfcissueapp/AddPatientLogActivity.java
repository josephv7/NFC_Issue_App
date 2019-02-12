package iamjosephvarghese.rm.com.nfcissueapp;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddPatientLogActivity extends AppCompatActivity {

    Button addLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_patient_log);

        addLog = findViewById(R.id.addLog);
        addLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Snackbar.make(findViewById(R.id.rootView),"Added Sucessfully", Snackbar.LENGTH_SHORT).show();
                Intent intent = new Intent(AddPatientLogActivity.this,Main2Activity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
