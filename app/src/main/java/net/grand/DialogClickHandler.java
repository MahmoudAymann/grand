package net.grand;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;

public class DialogClickHandler {
    private HomeActivity homeActivity;
    public DialogClickHandler(FragmentActivity activity) {
        this.homeActivity = (HomeActivity) activity;
    }

    public void onOuterViewClick(){
           homeActivity.finish();
    }

    public void onCallClcik(){
        makeCall(homeActivity, homeActivity.getString(R.string.grand_phone));
    }

    public void onWhatsAppClick(){
    }

    public static void makeCall(Activity context, String phone) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phone));
        context.startActivity(intent);
    }

    public void whatsAppMsg(Activity context, String phone){
        //NOTE : please use with country code first 2digits without plus signed
        if (phone.contains("+"))
            phone.replace("+","");
        try {
            String msg = "Hello, Grand";
            context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=" + phone + "&text=" + msg)));
        }catch (Exception e){
            //whatsapp app not install
            Toast.makeText(context, "whtasapp not installed", Toast.LENGTH_LONG).show();
        }
    }

}
