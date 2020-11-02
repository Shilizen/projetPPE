package motus.vue;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.application.Platform;
import motus.Main;

public class ControleurBase {
	@FXML
	private ImageView image;
	
	private Main mainVue;
	
	
	public Main getMainVue() {
		return mainVue;
	}

	public void setMainVue(Main mainVue) {
		this.mainVue = mainVue;
	}

	@FXML
	private void initialize() {
	}
	
	@FXML
	private void handleQuitter() {
		Platform.exit();
	}
	
	@FXML
	private void handleJouer() {
		mainVue.afficheVue();
	}
}
