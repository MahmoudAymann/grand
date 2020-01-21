package grand.grandlib;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import net.grand.R;
import net.grand.databinding.FragmentGrandDialogBinding;

import org.jetbrains.annotations.NotNull;

/**
 * A simple {@link Fragment} subclass.
 */
public class GrandDialogFragment extends BaseFragment {
    private FragmentGrandDialogBinding binding;
    public GrandDialogFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_grand_dialog, container, false);
        binding.setClickHandler(new DialogClickHandler(requireActivity()));
        return binding.getRoot();
    }
}
