package net.grand;

import android.os.Bundle;
import android.view.View;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import net.grand.constantsutils.Codes;
import net.grand.constantsutils.Params;
import net.grand.databinding.ActivityDialogBinding;

import java.util.Objects;

import timber.log.Timber;

public class DialogActivity extends ParentActivity {
    ActivityDialogBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_dialog);

        addFragment();
    }

    private void addFragment() {
        Fragment fragment = new GrandDialogFragment();
        MovementManager.replaceFragment(this, fragment, "");
    }
}
