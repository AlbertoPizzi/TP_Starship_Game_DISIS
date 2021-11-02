import edu.austral.dissis.starships.game.GameApplication;
import edu.austral.dissis.starships.game.GameContext;
import edu.austral.dissis.starships.game.WindowSettings;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import org.jetbrains.annotations.NotNull;

public class GameImpl extends GameApplication {
    @Override
    public @NotNull WindowSettings setupWindow() {
        return WindowSettings.fromTitle("App!!");
    }

    @Override
    public Parent initRoot(@NotNull GameContext gameContext) {
        return new Pane();
    }
}