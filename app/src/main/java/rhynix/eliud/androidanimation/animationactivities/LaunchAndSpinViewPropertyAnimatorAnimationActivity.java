package rhynix.eliud.androidanimation.animationactivities;

/**
 * Created by eliud on 10/18/16.
 */

public class LaunchAndSpinViewPropertyAnimatorAnimationActivity extends BaseAnimationActivity {
    @Override
    protected void onStartAnimation() {
        mRocket.animate().translationY(-mScreenHeight)
                .rotationBy(360f)
                .setDuration(DEFAULT_ANIMATION_DURATION)
                .start();
    }
}
