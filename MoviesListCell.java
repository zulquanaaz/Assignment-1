package com.example.movies;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class MoviesListCell extends ListCell<Movies> {
    // GUI attributes for movie name, rating, description and image

    private Text name;
    private Text rating;
    private Text description;
    ImageView imageView;
    // horizontal box to align items
    private HBox content;

    public MoviesListCell() {
        super();
        name = new Text();
        name.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        rating = new Text();
        description = new Text();
        // align name, rating and description in a vertical box
        VBox vBox = new VBox(name, rating, description);
        imageView = new ImageView();
        // align vertical box left and image at right in a horizontal box
        content = new HBox(vBox, imageView);
        // set spacing and padding in horizontal box
        content.setSpacing(10);
        content.setPadding(new Insets(0, 0, 10, 20));
    }

    @Override
    protected void updateItem(Movies movie, boolean empty) {
        super.updateItem(movie, empty);
        if (movie != null && !empty) { // <== test for null item and empty parameter
            name.setText(movie.getMovieName());// <== set value to name using Movies object movie and getter
            rating.setText(String.valueOf(movie.getRating()));// <== set value to rating using Movies object movie and
            // getter
            description.setText(movie.getDescription());// <== set value to description using Movies object movie and
            // getter
            imageView.setImage(movie.getImage());// <== set value to image using Movies object movie and getter
            setGraphic(imageView);
            setGraphic(content);
        } else {
            setGraphic(null);
        }
    }

}
