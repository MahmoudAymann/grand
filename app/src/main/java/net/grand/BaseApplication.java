package net.grand;

import android.app.Application;
import android.content.Context;
import androidx.databinding.DataBindingUtil;

import net.grand.databinding.AppDataBindingComponent;

import org.jetbrains.annotations.NotNull;
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
