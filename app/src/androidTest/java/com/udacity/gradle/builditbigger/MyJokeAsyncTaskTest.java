package com.udacity.gradle.builditbigger;


import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import android.util.Pair;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class MyJokeAsyncTaskTest  {

    CountDownLatch signal = new CountDownLatch(1);

    @Test
    public void myJokeTaskTest() throws InterruptedException {
        final MyJokeAsyncTask task = new MyJokeAsyncTask(){

            @Override
            protected String doInBackground(Pair<Context, String>... params) {
                return super.doInBackground(params);
            }

            @Override
            protected void onPostExecute(String result) {
                assertNotNull(result);
                assertFalse(signal.equals(""));
            }
        };

        Runnable runnable =  new Runnable() {
            @Override
            public void run() {
                task.execute();
            }
        };

        runnable.run();

        signal.await(10, TimeUnit.SECONDS);
    }
}
