package choongyul.android.com.musicplayerService;

import android.media.MediaPlayer;

/**
 * Created by myPC on 2017-02-24.
 */

public class App {

    public static MediaPlayer player = null;

    public static final int PLAY = 0;
    public static final int PAUSE = 1;
    public static final int STOP = 2;
    public static int playStatus = STOP;
    public static int position = 0; // 현재 음악 위치


}
