package rhynix.eliud.androidanimation;

import android.content.Intent;

/**
 * Created by eliud on 10/18/16.
 */

public class RocketAnimationItem {

    private final String mTitle;
    private final Intent mIntent;

    public RocketAnimationItem(String title, android.content.Intent intent) {
        mTitle = title;
        mIntent = intent;
    }

    public android.content.Intent getIntent() {
        return mIntent;
    }

    public String getTitle() {
        return mTitle;
    }
}
