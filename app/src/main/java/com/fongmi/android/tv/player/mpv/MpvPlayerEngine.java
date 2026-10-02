package com.fongmi.android.tv.player.mpv;

import androidx.media3.common.Player;

import com.fongmi.android.tv.player.exo.ExoPlayerEngine;

/**
 * Compatibility fallback for public-source builds.
 *
 * <p>The current upstream FongMi source references a private/out-of-tree
 * androidx.media3.mpvplayer implementation which is not shipped in the
 * public repository. Until that exact MPV Java layer is available, keep the
 * application fully usable by routing any direct MPV engine construction to
 * the public ExoPlayer engine. PlayerEngineFactory will normally never create
 * this class because {@link #isAvailable()} returns false.</p>
 */
public class MpvPlayerEngine extends ExoPlayerEngine {

    public MpvPlayerEngine(int decode, Player.Listener listener) {
        super(decode, listener);
    }

    public static boolean isAvailable() {
        return false;
    }

    @Override
    public Type getType() {
        return Type.EXO;
    }
}
