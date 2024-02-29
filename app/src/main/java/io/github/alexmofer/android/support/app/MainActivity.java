package io.github.alexmofer.android.support.app;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import io.github.alexmofer.android.support.app.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ActivityMainBinding.inflate(getLayoutInflater()).getRoot());
        TestApplicationData.getInstance().toast(this);
        InnerApplicationData.getInstance().toast(this);
    }

    private static class InnerApplicationData extends ApplicationData {

        private final String mTest = "内部类";

        private InnerApplicationData() {
            //no instance
        }

        public static InnerApplicationData getInstance() {
            return ApplicationHolder.getApplicationData(
                    InnerApplicationData.class, InnerApplicationData::new);
        }

        public void toast(Context context) {
            Toast.makeText(context, mTest, Toast.LENGTH_SHORT).show();
        }
    }
}