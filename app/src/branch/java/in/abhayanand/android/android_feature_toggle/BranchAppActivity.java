package in.abhayanand.android.android_feature_toggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BranchAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch_app);

        boolean isAuthenticated = Authentication.validateUser(this);
    }
}