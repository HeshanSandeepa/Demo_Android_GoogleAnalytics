package appmonkeyz.demo_googleanalytics;

import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

/**
 * Created by Heshan on 2/19/2016.
 */
public class AnalyticsApplication extends Application {

    private Tracker mTracker;

    synchronized public Tracker getDefaultTracker() {
        if (mTracker == null) {
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
            // To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG
            //will be auto generated after adding dependancies
            mTracker = analytics.newTracker(R.xml.global_tracker);
        }
        return mTracker;
    }

}
