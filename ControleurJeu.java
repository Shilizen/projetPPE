package motus.vue;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import motus.modele.*;

public class ControleurJeu {
	@FXML
	private GridPane grid = new GridPane();
	@FXML
	private Label label1;
	
	private Mot unMot = new Mot("Tambour");
	
	@FXML
	private void initialize() {
		remplirGrille();
	}
	
	public void remplirGrille() {
		int columns = 6;
		int colonne;
		int ligne;
		int rows = 5;
		int index = 0;
		String PremiereLettre = "";
		
		char[] desLettres = unMot.ajouterLettresT();
		PremiereLettre = PremiereLettre.valueOf(desLettres[0]);
		
		for(colonne = 0; colonne <= columns; colonne++) {
				//grid.add(label1 = new Label(), colonne, 0);
			for(ligne = 0; ligne <= rows; ligne++) {
				grid.add(label1 = new Label(), colonne, ligne);
				//label1.setText(".."); 
				if (colonne == 0) {
					label1.setText(PremiereLettre);
				} else {
					label1.setText("...");
				}
			}
		}
	}
}

