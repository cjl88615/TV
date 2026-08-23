package com.fongmi.android.tv.player.mpv;

/**
 * Public-build MPV capability probe.
 *
 * <p>FongMi 5.6.0 currently references an out-of-tree MPV Java layer which is
 * not present in the public upstream repository. Keep MPV disabled so the
 * engine factory safely selects ExoPlayer instead.</p>
 */
public final class MpvUtil {

    private MpvUtil() {
    }

    public static boolean isAvailable() {
        return false;
    }
}
