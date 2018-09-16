package in.abhayanand.android.android_feature_toggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        enableDisableControls();
    }

    private void enableDisableControls() {
        Button btnEmiratesID = (Button) findViewById(R.id.btnEmiratesID);
        btnEmiratesID.setVisibility(View.INVISIBLE);

        Button btnUserIdPassword = (Button) findViewById(R.id.btnUserIdPassword);
        btnEmiratesID.setVisibility(View.INVISIBLE);

        Button btnFingurePrint = (Button) findViewById(R.id.btnFingurePrint);
        btnEmiratesID.setVisibility(View.INVISIBLE);
    }
}
