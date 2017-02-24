package choongyul.android.com.musicplayerService;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import static choongyul.android.com.musicplayerService.App.PAUSE;
import static choongyul.android.com.musicplayerService.App.playStatus;
import static choongyul.android.com.musicplayerService.App.player;
import static choongyul.android.com.musicplayerService.App.PLAY;

public class PlayerService extends Service {


    public PlayerService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    private void playStop() {
        player.start();
        playStatus = PLAY;
    }
    private void playPlay() {
        player.pause();
        playStatus = PAUSE;
    }
    private void playPause() {
        player.seekTo(player.getCurrentPosition());
        player.start();
        playStatus = PLAY;
    }

}
