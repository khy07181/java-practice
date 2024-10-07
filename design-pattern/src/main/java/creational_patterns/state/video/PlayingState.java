package creational_patterns.state.video;

public class PlayingState implements State {
    @Override
    public void play(VideoPlayer videoPlayer) {
        System.out.println("Video is already playing.");
    }

    @Override
    public void stop(VideoPlayer videoPlayer) {
        System.out.println("Pausing the video.");
        videoPlayer.setState(new PausedState());
    }
}
