package io.github.alexmofer.android.support.app;

import android.content.Context;
import android.widget.Toast;

/**
 * 测试数据
 * Created by Alex on 2024/2/28.
 */
public class TestApplicationData extends ApplicationData {

    private final String mTest = "测试文案";

    private TestApplicationData() {
        //no instance
    }

    public static TestApplicationData getInstance() {
        return ApplicationHolder.getApplicationData(
                TestApplicationData.class, TestApplicationData::new);
    }

    public void toast(Context context) {
        Toast.makeText(context, mTest, Toast.LENGTH_SHORT).show();
    }
}
