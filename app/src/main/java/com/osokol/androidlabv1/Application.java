package com.osokol.androidlabv1;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import timber.log.Timber;

/**
 * Created by osokol on 20.05.2016.
 */
@Module
public class Application extends android.app.Application {

    private static Context sAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
        sAppContext = getApplicationContext();
    }

    @Provides
    public static Context getAppContext() {
        return sAppContext;
    }

}
