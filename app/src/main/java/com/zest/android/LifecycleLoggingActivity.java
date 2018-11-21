package com.zest.android;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * This abstract class extends AppCompatActivity class and overrides
 * lifecycle callbacks for logging various lifecycle events.
 *
 * Created by ZARA on 8/10/2018.
 */
public abstract class LifecycleLoggingActivity extends AppCompatActivity {

    /**
     * Debugging tag used by the Android Logger
     */
    private static final String TAG = LifecycleLoggingActivity.class.getSimpleName();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //Always call super class for necessary
        //initialization/implementation
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            //The activity is being re-created.
            //savedInstanceState bundle for initializations either
            //during onCreate or onRestoreInstanceState().
            Log.d(TAG, "onCreate() - activity recreated");
        } else {
            //The activity is being created anew.No prior saved
            //instance state information available in Bundle object.
            Log.d(TAG, "onCreate() - activity created a new");
        }
    }

    /**
     * Hook method called after onCreate() or after onRestart()
     * (when the activity is being restarted from stopped state).
     * Should re-acquire resources relinquished when activity was stopped(onStop())
     * or acquire those resources for the first time after onCreate().
     */
    @Override
    protected void onStart() {
        //Always call super class for necessary
        //initialization/implementation
        super.onStart();
        Log.d(TAG, "onStart() - the activity is about to become visible");
    }


    /**
     * Hook method called after onRestoreStateInstance(Bundle) only if
     * there is a prior saved instance state in Bundle
     * object.onResume() is called immediately after onStart().
     * onResume() is called when user resumes activity from paused state(onPause())
     * User can begin interacting with activity.
     * Place to startWithFavorite animations,acquire exclusive resources, such as the camera.
     */
    @Override
    protected void onResume() {
        //Always call super class for necessary
        //initialization/implementation
        //hook method is being called
        super.onResume();
        Log.d(TAG, "onResume() - the activity has become visible (it is now " + "\"resumed\")");
    }


    /**
     * Hook method called when an Activity loses focus but is still visible in background.
     * May be followed by onStop() or onResume().Delegate more CPU intensive operation to
     * onStop for seamless transition to next activity.
     * Save persistent sate (onSaveInstanceState) in case app is killed.
     * Often used to release exclusive resources.
     */
    @Override
    protected void onPause() {
        //Always call super class for necessary
        //initialization/implementation
        //hook method is being called
        super.onPause();
        Log.d(TAG, "onPause() - another activity is taking focus (the activity" +
                "is about to be \"paused\")");
    }


    /**
     * Called when activity is no longer visible.Release resources
     * that may cause memory leak.Save instance state (onSaveInstanceState())
     * in case activity is killed.
     */
    @Override
    protected void onStop() {
        //Always call super class for necessary
        //initialization/implementation
        //hook method is being called
        super.onStop();
        Log.d(TAG, "onStop() - the activity is no longer visible (it is now " + "\"stopped\")");
    }

    /**
     * Hook method called when user restarts a stopped activity.Is
     * followed by call to onStart() and onResume().
     */
    @Override
    protected void onRestart() {
        //Always call super class for necessary
        //initialization/implementation
        //hook method is being called
        super.onRestart();
        Log.d(TAG, "onRestart() - the activity is about to be restarted");
    }

    /**
     * Hook method that gives a final chance to release resources and
     * stop spawned threads.onDestroy() may not always be called-when
     * system kills hosting process.
     */
    @Override
    protected void onDestroy() {
        //Always call super class for necessary
        //initialization/implementation
        //hook method is being called
        super.onDestroy();
        Log.d(TAG, "onDestroy() - the activity is about to be destroyed");
    }
}
