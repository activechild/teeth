package com.androiddeveloperscode.teeth;

import android.app.Application;

import com.rev.system.render.Rev;
import com.rev.system.render.RevManager;

/**
 * Created by Braxton on 6/12/2015.
 */
public class Teeth extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RevManager.setSwitches(this, 1, 0, 0, 0, false);
        Rev.initialize("com.rev.system.Rev.INHERIT_CONFIG", this);
    }
}
