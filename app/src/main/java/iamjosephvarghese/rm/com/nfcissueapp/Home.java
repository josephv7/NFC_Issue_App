package iamjosephvarghese.rm.com.nfcissueapp;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    Button getId,getData,readNfc;
    EditText firstName, lastName;
    TextView patientId;
    int min, max, range;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getId = findViewById(R.id.getId);
        getData = findViewById(R.id.getData);
        readNfc = findViewById(R.id.readNfc);
        patientId = findViewById(R.id.patientId);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);


        final String[] randomId = {"bdf6eud","kkj98i3nn","3rbjdbkknds","hqnn08bn","4rgshajbv","xvrgvtzh3","kqau4ebcf","qobze1amv","qapcndsak","lakd9cnsg"};

        min = 0;
        max = randomId.length - 1;
        range = max - min +1;


        getId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstName.getText().toString().equals("") || lastName.getText().toString().equals("")){
                    Snackbar.make(findViewById(R.id.rootView),"Enter Required Fields", Snackbar.LENGTH_SHORT).show();
                }else{

                    patientId.setText(randomId[(int) (Math.random() * range) + min]);

                }
            }
        });


        getData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstName.getText().toString().equals("") || lastName.getText().toString().equals("")){
                    Snackbar.make(findViewById(R.id.rootView),"Enter Required Fields", Snackbar.LENGTH_SHORT).show();
                }else {
                    Snackbar.make(findViewById(R.id.rootView),"Getting User Data", Snackbar.LENGTH_SHORT).show();
                }
            }
        });


        readNfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(findViewById(R.id.rootView),"Turn On NFC", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
