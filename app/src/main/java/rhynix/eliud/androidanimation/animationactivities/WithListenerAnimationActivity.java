package rhynix.eliud.androidanimation.animationactivities;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.widget.Toast;

/**
 * Created by eliud on 10/18/16.
 */

public class WithListenerAnimationActivity extends BaseAnimationActivity {
    @Override
    protected void onStartAnimation() {
        ValueAnimator animator = ValueAnimator.ofFloat(0, -mScreenHeight);

        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                float value = (float) animation.getAnimatedValue();
                mRocket.setTranslationY(value);
                mDoge.setTranslationY(value);
            }
        });


        animator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

                Toast.makeText(WithListenerAnimationActivity.this, "Doge took off", Toast.LENGTH_SHORT)
                        .show();
            }

            @Override
            public void onAnimationEnd(Animator animation) {

                Toast.makeText(WithListenerAnimationActivity.this, "Doge is on the moon", Toast.LENGTH_SHORT)
                        .show();
                finish();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });


        animator.setDuration(5000L);
        animator.start();

    }
}
