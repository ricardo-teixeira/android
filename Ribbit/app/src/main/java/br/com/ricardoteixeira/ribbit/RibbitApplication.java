package br.com.ricardoteixeira.ribbit;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Ricardo on 15/11/2016.
 */

public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
