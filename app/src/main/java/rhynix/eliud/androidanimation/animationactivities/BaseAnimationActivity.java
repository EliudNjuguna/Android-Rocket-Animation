package rhynix.eliud.androidanimation.animationactivities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;

import rhynix.eliud.androidanimation.R;

/**
 * Created by eliud on 10/18/16.
 */

public  abstract class BaseAnimationActivity extends AppCompatActivity{

    public static final long DEFAULT_ANIMATION_DURATION = 2500L;
    protected View mRocket;
    protected View mDoge;
    protected View mFrameLayout;
    protected float mScreenHeight;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_animation);

        mRocket = findViewById(R.id.rocket);
        mDoge = findViewById(R.id.doge);

        mFrameLayout = findViewById(R.id.container);
        mFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onStartAnimation();
            }
        });
    }

    protected abstract void onStartAnimation();

    @Override
    protected void onResume() {
        super.onResume();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        mScreenHeight = displaymetrics.heightPixels;

    }
}
