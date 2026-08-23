package com.fongmi.android.tv;

import androidx.fragment.app.FragmentActivity;

/**
 * Self-update is intentionally disabled in the Taliabu TV3 build.
 *
 * <p>This compatibility shell keeps legacy call sites harmless while removing
 * all version checks, release-network requests, update dialogs, APK downloads,
 * and installer actions.</p>
 */
public final class Updater {

    private Updater() {
    }

    public static Updater create() {
        return new Updater();
    }

    public Updater force() {
        return this;
    }

    public void start(FragmentActivity activity) {
        // Intentionally disabled.
    }
}
