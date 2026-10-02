package androidx.media3.mpvplayer.audio;

/**
 * Small public-build compatibility helper used by FongMi's shared
 * AudioEffectProcessor.
 *
 * <p>The upstream project normally gets these helpers from its out-of-tree
 * MPV Java layer. Only the three down-mix operations used by the ExoPlayer
 * audio processor are implemented here, so ExoPlayer audio effects remain
 * functional even when MPV itself is disabled.</p>
 */
public final class AudioChannelMix {

    private static final float CENTER = 0.70710677f;
    private static final float SURROUND = 0.70710677f;
    private static final float LFE = 0.35f;

    private AudioChannelMix() {
    }

    public static float mixStereoLeft(float[] samples) {
        if (samples == null || samples.length == 0) return 0.0f;
        if (samples.length == 1) return samples[0];
        float value = samples[0];
        if (samples.length > 2) value += samples[2] * CENTER;
        if (samples.length > 3) value += samples[3] * LFE;
        if (samples.length > 4) value += samples[4] * SURROUND;
        if (samples.length > 6) value += samples[6] * SURROUND;
        return value;
    }

    public static float mixStereoRight(float[] samples) {
        if (samples == null || samples.length == 0) return 0.0f;
        if (samples.length == 1) return samples[0];
        float value = samples[1];
        if (samples.length > 2) value += samples[2] * CENTER;
        if (samples.length > 3) value += samples[3] * LFE;
        if (samples.length > 5) value += samples[5] * SURROUND;
        if (samples.length > 7) value += samples[7] * SURROUND;
        return value;
    }

    public static float mixMono(float[] samples) {
        if (samples == null || samples.length == 0) return 0.0f;
        if (samples.length == 1) return samples[0];
        return (mixStereoLeft(samples) + mixStereoRight(samples)) * 0.5f;
    }
}
