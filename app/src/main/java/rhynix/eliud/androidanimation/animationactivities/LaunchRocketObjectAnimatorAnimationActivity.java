package rhynix.eliud.androidanimation.animationactivities;

import android.animation.ObjectAnimator;

/**
 * Created by eliud on 10/18/16.
 */

public class LaunchRocketObjectAnimatorAnimationActivity extends BaseAnimationActivity {
    @Override
    protected void onStartAnimation() {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(mRocket,"translationY",0,-mScreenHeight);
        objectAnimator.setDuration(DEFAULT_ANIMATION_DURATION);
        objectAnimator.start();
    }
}
