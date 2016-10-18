package rhynix.eliud.androidanimation.animationactivities;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;

/**
 * Created by eliud on 10/18/16.
 */

public class AccelerateRocketAnimationActivity extends BaseAnimationActivity {

    @Override
    protected void onStartAnimation() {
        ValueAnimator valueAnimator = ValueAnimator.ofFloat(0,-mScreenHeight);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float value = (float) animation.getAnimatedValue();
                mRocket.setTranslationY(value);
            }
        });
        valueAnimator.setInterpolator(new AccelerateInterpolator(1.5F));
        valueAnimator.setDuration(DEFAULT_ANIMATION_DURATION);
        valueAnimator.start();

    }
}
