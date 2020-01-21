package grand.grandlib;

import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import net.grand.R;
import net.grand.databinding.ActivityDialogBinding;

import grand.grandlib.constantsutils.Params;

public class DialogActivity extends ParentActivity {
    ActivityDialogBinding binding;
    private RevealAnimation mRevealAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dialog);
        mRevealAnimation = new RevealAnimation(binding.getRoot(), getIntent().getBundleExtra(Params.BUNDLE_PAGE), this);

        addFragment();
    }

    private void addFragment() {
        Fragment fragment = new GrandDialogFragment();
        MovementManager.replaceFragment(this, fragment, "");
    }

    @Override
    public void onBackPressed() {
        mRevealAnimation.unRevealActivity();
    }

}
