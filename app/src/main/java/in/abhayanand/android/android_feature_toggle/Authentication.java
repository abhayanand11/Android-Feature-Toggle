package in.abhayanand.android.android_feature_toggle;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

public class Authentication {

    private final static String TAG = "EXAMPLE: <" + Authentication.class.getSimpleName() + ">";

    public static boolean validateUser(final Activity activity) {

        if (BuildConfig.FEATURE_EMIRATES_ID_LOGIN) {
            Log.v(TAG, "validating Emirates ID");
            return validateUserThroughEmeritesID(activity);
        }
        else if (BuildConfig.FEATURE_BIOMETRIC_LOGIN){
            Log.v(TAG, "validating userid/password");
            return validateUserThroughUserBiometricLogin(activity);
        }
        else
        {
            Log.v(TAG, "not validated, because this is Blah!!");
            return validateUserThroughUserIDPassword(activity);
        }
    }

    private static boolean validateUserThroughEmeritesID(Context context) {
        return true;
    }

    private static boolean validateUserThroughUserBiometricLogin(Context context) {
        return true;
    }

    private static boolean validateUserThroughUserIDPassword(Context context) {
        return true;
    }
}
