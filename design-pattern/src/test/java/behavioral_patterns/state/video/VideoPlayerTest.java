package behavioral_patterns.state.video;

import org.junit.jupiter.api.Test;

class VideoPlayerTest {

    @Test
    void state() {
        VideoPlayer videoPlayer = new VideoPlayer();

        videoPlayer.play(); // "Starting the video."
        videoPlayer.play(); // "Video is already playing."
        videoPlayer.stop(); // "Pausing the video."
        videoPlayer.play(); // "Resuming the video."
        videoPlayer.stop(); // "Pausing the video."
        videoPlayer.stop(); // "Stopping the video."
        videoPlayer.stop(); // "Video is already stopped."
    }

}
