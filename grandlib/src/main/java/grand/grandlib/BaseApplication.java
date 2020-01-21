package grand.grandlib;

import android.app.Application;

import androidx.databinding.DataBindingUtil;


import org.jetbrains.annotations.NotNull;

import grand.grandlib.databinding.AppDataBindingComponent;
import timber.log.Timber;

public class BaseApplication extends Application {

    private static BaseApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        initTimber();
        DataBindingUtil.setDefaultComponent(new AppDataBindingComponent());
//        ApplicationUtil.requestNewToken();
    }

    public static synchronized BaseApplication getInstance() {
        return mInstance;
    }

    private void initTimber() {
        Timber.plant(new Timber.DebugTree() {
            @Override
            protected String createStackElementTag(@NotNull StackTraceElement element) {
                return super.createStackElementTag(element) + " line: " + element.getLineNumber();
            }
        });
    }

}