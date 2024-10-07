package creational_patterns.state.video;

public class PausedState implements State {

    @Override
    public void play(VideoPlayer videoPlayer) {
        System.out.println("Resuming the video.");
        videoPlayer.setState(new PlayingState());
    }

    @Override
    public void stop(VideoPlayer videoPlayer) {
        System.out.println("Stopping the video.");
        videoPlayer.setState(new StoppedState());
    }
}
