package io.github.alexmofer.android.support.app;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

import androidx.annotation.NonNull;

/**
 * 应用数据
 * Created by Alex on 2023/12/15.
 */
public abstract class ApplicationData {


    /**
     * 配置变化
     *
     * @param newConfig 新的配置
     */
    protected void onConfigurationChanged(@NonNull Configuration newConfig) {
    }


    /**
     * 获取自动销毁等级
     *
     * @return 自动销毁等级
     */
    protected int getAutoDestroyLevel() {
        return ComponentCallbacks2.TRIM_MEMORY_COMPLETE;
    }

    /**
     * 减少内存占用
     *
     * @param level 等级
     */
    protected void onTrimMemory(int level) {
    }

    /**
     * 执行销毁
     */
    protected void onDestroy() {
    }

    /**
     * 销毁
     */
    public final void destroy() {
        ApplicationHolder.removeApplicationData(this);
    }
}
