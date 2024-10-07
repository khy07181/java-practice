package creational_patterns.state.video;

public class StoppedState implements State {

    @Override
    public void play(VideoPlayer videoPlayer) {
        System.out.println("Playing the video.");
        videoPlayer.setState(new PlayingState());
    }

    @Override
    public void stop(VideoPlayer videoPlayer) {
        System.out.println("Video is already stopped.");
    }
}
