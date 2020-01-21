package net.grand;

import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import net.grand.databinding.ActivityHomeBinding;

public class HomeActivity extends ParentActivity {
    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);

        addFragment();
    }

    private void addFragment() {
        Fragment fragment = new GrandDialogFragment();
        MovementManager.replaceFragment(this, fragment, "");
    }
}
