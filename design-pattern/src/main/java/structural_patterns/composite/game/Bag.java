package structural_patterns.composite.game;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class Bag implements Component {

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
