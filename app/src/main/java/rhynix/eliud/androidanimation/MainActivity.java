package rhynix.eliud.androidanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import rhynix.eliud.androidanimation.animationactivities.AccelerateRocketAnimationActivity;
import rhynix.eliud.androidanimation.animationactivities.ColorAnimationActivity;
import rhynix.eliud.androidanimation.animationactivities.FlyThereAndBackAnimationActivity;
import rhynix.eliud.androidanimation.animationactivities.FlyWithDogeAnimationActivity;
import rhynix.eliud.androidanimation.animationactivities.LaunchAndSpinAnimatorSetAnimatorActivity;
import rhynix.eliud.androidanimation.animationactivities.LaunchAndSpinViewPropertyAnimatorAnimationActivity;
import rhynix.eliud.androidanimation.animationactivities.LaunchRocketObjectAnimatorAnimationActivity;
import rhynix.eliud.androidanimation.animationactivities.LaunchRocketValueAnimatorAnimationActivity;
import rhynix.eliud.androidanimation.animationactivities.NoAnimationActivity;
import rhynix.eliud.androidanimation.animationactivities.RotateRocketAnimationActivity;
import rhynix.eliud.androidanimation.animationactivities.WithListenerAnimationActivity;
import rhynix.eliud.androidanimation.animationactivities.XmlAnimationActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        recyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));

        List<RocketAnimationItem> items = new ArrayList<>();

        items.add(new RocketAnimationItem(getString(R.string.title_no_animation),
                new Intent(this, NoAnimationActivity.class)));

        items.add(new RocketAnimationItem(getString(R.string.title_launch_rocket),
                new Intent(this, LaunchRocketValueAnimatorAnimationActivity.class)));

        items.add(new RocketAnimationItem(getString(R.string.title_spin_rocket),
                new Intent(this, RotateRocketAnimationActivity.class)));

        items.add(new RocketAnimationItem(getString(R.string.title_accelerate_rocket),
                new Intent(this, AccelerateRocketAnimationActivity.class)));

        items.add(new RocketAnimationItem(getString(R.string.title_launch_rocket_objectanimator),
                new Intent(this, LaunchRocketObjectAnimatorAnimationActivity.class)));

        items.add(new RocketAnimationItem(getString(R.string.title_color_animation),
                new Intent(this, ColorAnimationActivity.class)));

        items.add(new RocketAnimationItem(getString(R.string.launch_spin),
                new Intent(this, LaunchAndSpinAnimatorSetAnimatorActivity.class)));

        items.add(new RocketAnimationItem(getString(R.string.launch_spin_viewpropertyanimator),
                new Intent(this, LaunchAndSpinViewPropertyAnimatorAnimationActivity.class)));

        items.add(new RocketAnimationItem(getString(R.string.title_with_doge),
                new Intent(this, FlyWithDogeAnimationActivity.class)));

        items.add(new RocketAnimationItem(getString(R.string.title_animation_events),
                new Intent(this, WithListenerAnimationActivity.class)));

        items.add(new RocketAnimationItem(getString(R.string.title_there_and_back),
                new Intent(this, FlyThereAndBackAnimationActivity.class)));

        items.add(new RocketAnimationItem(getString(R.string.title_jump_and_blink),
                new Intent(this, XmlAnimationActivity.class)));

        recyclerView.setAdapter(new RocketAdapter(this, items));

    }

}
