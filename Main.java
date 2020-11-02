@Override
	public void start(Stage primaryStage) {
		try {
			
			
			FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(Main.class.getResource("vue/ecranBase.fxml"));
	        
	        rootLayout = (AnchorPane) loader.load();
	         
	        Scene scene = new Scene(rootLayout); 
	        
	        String musicFile = "resources/Motus.mp3";   
	        Media sound = new Media(new File(musicFile).toURI().toString());
	        MediaPlayer mediaPlayer = new MediaPlayer(sound);
	        mediaPlayer.play();
	        
	        //ControleurBase controleur = loader.getController();
	        //controleur.setMainVue(this);
	        
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Motus - Accueil");
			
			ControleurBase leControleur = loader.getController();
			leControleur.setMainVue(this);
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
