package com.osokol.androidlabv1;

import android.content.Context;

import javax.inject.Inject;

import dagger.Component;

/**
 * Created by osokol on 20.05.2016.
 */
public class MyObj {

    @Inject
    protected Context cont;


    @Component(modules = Application.class)
    interface iObject{

    }

}
