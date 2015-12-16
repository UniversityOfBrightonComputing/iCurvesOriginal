package icircles.guifx;

import icircles.abstractdescription.AbstractDescription;
import icircles.concrete.CircleContour;
import icircles.concrete.ConcreteDiagram;
import icircles.concrete.ConcreteZone;
import icircles.decomposition.DecompositionType;
import icircles.recomposition.RecompositionType;
import icircles.util.CannotDrawException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

import java.awt.geom.Ellipse2D;
import java.util.List;

/**
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 */
public class CirclesApp extends Application {

    private GraphicsContext g;
    private Pane root;
    private Pane shadedZonesRoot;

    private Parent createContent() {
        BorderPane pane = new BorderPane();
        pane.setPrefSize(800, 600);

        root = new Pane();
        root.setPrefSize(800, 500);

        shadedZonesRoot = new Pane();
        shadedZonesRoot.setPrefSize(800, 500);

        Canvas canvas = new Canvas(800, 600);
        canvas.widthProperty().bind(root.widthProperty());
        canvas.heightProperty().bind(root.heightProperty());
        g = canvas.getGraphicsContext2D();
        root.getChildren().addAll(shadedZonesRoot, canvas);
        pane.setCenter(root);

        pane.setLeft(createContentLeft());

        return pane;
    }

    private Parent createContentLeft() {
        TextField input = new TextField();
        input.setOnAction(e -> draw(input.getText()));

        ChoiceBox<DecompositionType> decompBox = new ChoiceBox<>(FXCollections.observableArrayList(DecompositionType.values()));
        ChoiceBox<RecompositionType> recompBox = new ChoiceBox<>(FXCollections.observableArrayList(RecompositionType.values()));

        decompBox.getSelectionModel().selectLast();
        recompBox.getSelectionModel().selectLast();

        Button btnDrawVenn = new Button("VENN3");
        btnDrawVenn.setOnAction(e -> drawVenn3());

        VBox vbox = new VBox(50, input, decompBox, recompBox, btnDrawVenn);
        vbox.setAlignment(Pos.CENTER);

        return vbox;
    }

    private void draw(String description) {
        try {
            System.out.println(AbstractDescription.makeForTesting(description).toString());

            ConcreteDiagram diagram = ConcreteDiagram.makeConcreteDiagram(DecompositionType.PIERCED_FIRST,
                    RecompositionType.DOUBLY_PIERCED, AbstractDescription.makeForTesting(description),
                    Math.min((int)root.getWidth(), (int)root.getHeight()));

            System.out.println(diagram);

            draw(diagram);
        } catch (CannotDrawException e) {
            e.printStackTrace();
        }
    }

    private void draw(ConcreteDiagram diagram) {
        System.out.println(root.getWidth() + " " + root.getHeight());

        g.clearRect(0, 0, root.getWidth(), root.getHeight());

        // draw shaded zones
        g.setFill(Color.LIGHTGREY);
        shadedZonesRoot.getChildren().clear();
        List<ConcreteZone> zones = diagram.getShadedZones();
        for (ConcreteZone zone : zones) {
            Shape area = zone.getShapeFX(diagram.getBox());
            area.setFill(Color.LIGHTGREY);

            shadedZonesRoot.getChildren().addAll(area);
        }

        List<CircleContour> circles = diagram.getCircles();

        // draw curve contours
        g.setFill(Color.BLACK);
        g.setStroke(Color.BLUE);

        for (CircleContour cc : circles) {
            Ellipse2D.Double circle = cc.getCircle();

            g.strokeOval(circle.getX(), circle.getY(), circle.getWidth(), circle.getHeight());
        }

        // draw labels
        for (CircleContour cc : circles) {
            if (cc.ac.getLabel() == null)
                continue;

            g.fillText(cc.ac.getLabel().getLabel(), cc.getLabelXPosition(), cc.getLabelYPosition());
        }
    }

    private void drawVenn3() {
        draw("a b c abc ab ac bc");
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(createContent()));
        stage.setTitle("iCircles FX");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
