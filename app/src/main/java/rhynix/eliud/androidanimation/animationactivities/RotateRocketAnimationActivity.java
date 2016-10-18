package rhynix.eliud.androidanimation.animationactivities;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;

/**
 * Created by eliud on 10/18/16.
 */

public class RotateRocketAnimationActivity extends BaseAnimationActivity {
    @Override
    protected void onStartAnimation() {
        ValueAnimator animator = ValueAnimator.ofFloat(0,360);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float value = (float)animation.getAnimatedValue();
                mRocket.setRotation(value);
            }
        });

        animator.setInterpolator(new LinearInterpolator());
        animator.setDuration(DEFAULT_ANIMATION_DURATION);
        animator.start();
    }
}
