package creational_patterns.state.video;

public interface State {

    void play(VideoPlayer videoPlayer);

    void stop(VideoPlayer videoPlayer);

}
