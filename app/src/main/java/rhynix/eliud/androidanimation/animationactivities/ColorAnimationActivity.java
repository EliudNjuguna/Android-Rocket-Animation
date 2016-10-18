package rhynix.eliud.androidanimation.animationactivities;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.content.ContextCompat;

import rhynix.eliud.androidanimation.R;

/**
 * Created by eliud on 10/18/16.
 */

public class ColorAnimationActivity extends BaseAnimationActivity {
    @Override
    protected void onStartAnimation() {
        ObjectAnimator objectAnimator = ObjectAnimator.ofObject(mFrameLayout, "backgroundColor",
                new ArgbEvaluator(),
                ContextCompat.getColor(this, R.color.background_from),
                ContextCompat.getColor(this, R.color.background_to));


        objectAnimator.setRepeatCount(1);
        objectAnimator.setRepeatMode(ValueAnimator.REVERSE);


        objectAnimator.setDuration(DEFAULT_ANIMATION_DURATION);
        objectAnimator.start();

    }
}
