package com.example.movies;


import android.app.Application;
import android.media.Image;
import android.media.audiofx.DynamicsProcessing;
import android.transition.Scene;

public class MoviesList extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(DynamicsProcessing.Stage primaryStage) {
        // Create a list of data
        ObservableList<Movies> data = FXCollections.observableArrayList();
        // add elements to the list
        data.addAll(
                new Movies(" LONDON 1920", 4.5, "Thriller Movie",
                        new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNf7oRO1vrnAR9MzU_fW2ky8M8oGydwprlfw&usqp=CAU")),
                new Movies("CID", 4.5, "Crime Series", new Image(
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSCsluBbcYI0oHMPGiTlZoR7RsUN-GoPJC4-w&usqp=CAU")),
                new Movies("MR AND MRS 420", 4.0, "Family Movie", new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQlxw7poaHf43Ai0t0ShWt0DX-uWpPGlu7GUg&usqp=CAU")),
                new Movies("KABIR SINGH", 4.0, "Love Story", new Image(
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZgLLRp3XJswqpj2wxnsSkB22CCWA875ScmQ&usqp=CAU")),
                new Movies("BHOOT RETURN", 3.8, "Horror Movie", new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWh7EeoyAqyYZgwOaltzmF0xVVURgLryxheA&usqp=CAU")));

        final ListView<Movies> listView = new ListView<Movies>(data);
        listView.setCellFactory(new Callback<ListView<Movies>, ListCell<Movies>>() {
            @Override
            public ListCell<Movies> call(ListView<Movies> listView) {
                return new MoviesListCell();
            }
        });
// create root pane and insert list
        StackPane root = new StackPane();
        root.getChildren().add(listView);
        primaryStage.setScene(new Scene(root, 250, 250));
        primaryStage.show();
    }

}
