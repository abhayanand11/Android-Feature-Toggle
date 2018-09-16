Android-Feature-Toggle

Projects demonstrates how to toggle features for apps (two or more) having common functionality.

**Run instructions:**

1. clone the project
2. goto gradle file and 'Enable/Disable' the features
3. run command './gradlew assemble' to create build  variants (biuildtype-buildflavor combinations)
4. Find the generated apks unde folder ~/app/build/outputs/apk



1. In case specific features are disabled in a specific build variant
   1. Update the gradle file 
   2. Run specific assemble command like './gradlew assembleRelease'



**The project has following configurations and definitions:**

BuildTypes: 'debug', 'QA', 'release'

ProductFlavors: 'app' and 'branch'

    productFlavors {
        app {
            targetSdkVersion 25
            minSdkVersion 15
            applicationId 'in.abhayanand.android.android_feature_toggle.app'
            testInstrumentationRunner 'android.support.test.runner.AndroidJUnitRunner'
            versionCode 1
            versionName '1.0'
            buildConfigField("Boolean", "FEATURE_BIOMETRIC_LOGIN", "true")
        }
        branch {
            targetSdkVersion 25
            minSdkVersion 15
            applicationId 'in.abhayanand.android.android_feature_toggle.branch'
            testInstrumentationRunner 'android.support.test.runner.AndroidJUnitRunner'
            versionCode 1
            versionName '1.0'
            buildConfigField("Boolean", "FEATURE_EMIRATES_ID_LOGIN", "true")
        }

BuildVariants: 'appDebug', 'appQA', 'appRelease', 'branchDebug', 'branchQA', 'branchRelese'

BuildConfigField definitions in Gradle file:

    buildConfigField("Boolean", "FEATURE_BIOMETRIC_LOGIN", "true")


**Execution of the code based on enabled features:**

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

		

Source:

 https://developer.android.com/studio/build/build-variants#sourceset-build

https://developer.android.com/studio/build/gradle-tips#share-custom-fields-and-resource-values-with-your-app-code


