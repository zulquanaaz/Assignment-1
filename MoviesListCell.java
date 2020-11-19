package com.example.movies;


import android.graphics.Insets;
import android.graphics.fonts.Font;
import android.widget.ImageView;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.w3c.dom.UserDataHandler;

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
        name = new Text() {
            @Override
            public String getNodeName() {
                return null;
            }

            @Override
            public String getNodeValue() throws DOMException {
                return null;
            }

            @Override
            public void setNodeValue(String nodeValue) throws DOMException {

            }

            @Override
            public short getNodeType() {
                return 0;
            }

            @Override
            public Node getParentNode() {
                return null;
            }

            @Override
            public NodeList getChildNodes() {
                return null;
            }

            @Override
            public Node getFirstChild() {
                return null;
            }

            @Override
            public Node getLastChild() {
                return null;
            }

            @Override
            public Node getPreviousSibling() {
                return null;
            }

            @Override
            public Node getNextSibling() {
                return null;
            }

            @Override
            public NamedNodeMap getAttributes() {
                return null;
            }

            @Override
            public Document getOwnerDocument() {
                return null;
            }

            @Override
            public Node insertBefore(Node newChild, Node refChild) throws DOMException {
                return null;
            }

            @Override
            public Node replaceChild(Node newChild, Node oldChild) throws DOMException {
                return null;
            }

            @Override
            public Node removeChild(Node oldChild) throws DOMException {
                return null;
            }

            @Override
            public Node appendChild(Node newChild) throws DOMException {
                return null;
            }

            @Override
            public boolean hasChildNodes() {
                return false;
            }

            @Override
            public Node cloneNode(boolean deep) {
                return null;
            }

            @Override
            public void normalize() {

            }

            @Override
            public boolean isSupported(String feature, String version) {
                return false;
            }

            @Override
            public String getNamespaceURI() {
                return null;
            }

            @Override
            public String getPrefix() {
                return null;
            }

            @Override
            public void setPrefix(String prefix) throws DOMException {

            }

            @Override
            public String getLocalName() {
                return null;
            }

            @Override
            public boolean hasAttributes() {
                return false;
            }

            @Override
            public String getBaseURI() {
                return null;
            }

            @Override
            public short compareDocumentPosition(Node other) throws DOMException {
                return 0;
            }

            @Override
            public String getTextContent() throws DOMException {
                return null;
            }

            @Override
            public void setTextContent(String textContent) throws DOMException {

            }

            @Override
            public boolean isSameNode(Node other) {
                return false;
            }

            @Override
            public String lookupPrefix(String namespaceURI) {
                return null;
            }

            @Override
            public boolean isDefaultNamespace(String namespaceURI) {
                return false;
            }

            @Override
            public String lookupNamespaceURI(String prefix) {
                return null;
            }

            @Override
            public boolean isEqualNode(Node arg) {
                return false;
            }

            @Override
            public Object getFeature(String feature, String version) {
                return null;
            }

            @Override
            public Object setUserData(String key, Object data, UserDataHandler handler) {
                return null;
            }

            @Override
            public Object getUserData(String key) {
                return null;
            }

            @Override
            public String getData() throws DOMException {
                return null;
            }

            @Override
            public void setData(String data) throws DOMException {

            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public String substringData(int offset, int count) throws DOMException {
                return null;
            }

            @Override
            public void appendData(String arg) throws DOMException {

            }

            @Override
            public void insertData(int offset, String arg) throws DOMException {

            }

            @Override
            public void deleteData(int offset, int count) throws DOMException {

            }

            @Override
            public void replaceData(int offset, int count, String arg) throws DOMException {

            }

            @Override
            public Text splitText(int offset) throws DOMException {
                return null;
            }

            @Override
            public boolean isElementContentWhitespace() {
                return false;
            }

            @Override
            public String getWholeText() {
                return null;
            }

            @Override
            public Text replaceWholeText(String content) throws DOMException {
                return null;
            }
        };
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
