package rhynix.eliud.androidanimation.animationactivities;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;

/**
 * Created by eliud on 10/18/16.
 */

public class LaunchRocketValueAnimatorAnimationActivity extends BaseAnimationActivity {
    @Override
    protected void onStartAnimation() {

        ValueAnimator valueAnimator = ValueAnimator.ofFloat(0,-mScreenHeight);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float value = (float)animation.getAnimatedValue();
                mRocket.setTranslationY(value);
            }
        });
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setDuration(DEFAULT_ANIMATION_DURATION);
        valueAnimator.start();
    }
}
