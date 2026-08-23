package com.fongmi.android.tv.ui.custom;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Taliabu TV3 uses a fixed pure-black application background.
 * Wallpaper images, GIFs and videos are intentionally not rendered here.
 */
public class CustomWallView extends FrameLayout {

    public CustomWallView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(Color.BLACK);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBackgroundColor(Color.BLACK);
    }
}
