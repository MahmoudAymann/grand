package grand.grandlib;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import net.grand.R;

import org.jetbrains.annotations.NotNull;

/**
 * A simple {@link Fragment} subclass.
 */
public class GrandDialogFragment extends BaseFragment implements View.OnClickListener {
    private TextView textViewWhatsapp, textViewCall;
    public GrandDialogFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_grand_dialog, container, false);
        textViewWhatsapp = view.findViewById(R.id.tv_whatsapp);
        textViewWhatsapp.setOnClickListener(this);

        textViewCall = view.findViewById(R.id.tv_call);
        textViewCall.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.tv_whatsapp) {
            SettingsManager.whatsAppMsg(requireActivity(), getString(R.string.grand_phone));
        }else if (id == R.id.tv_call){
            SettingsManager.makeCall(requireActivity(), getString(R.string.grand_phone));
        }else if (id == R.id.view1 || id == R.id.view2){
            requireActivity().onBackPressed();
        }
    }
}
