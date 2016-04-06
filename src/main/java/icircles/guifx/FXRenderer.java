package icircles.guifx;

import icircles.abstractdescription.AbstractCurve;
import icircles.concrete.*;
import icircles.graph.EulerDualGraph;
import icircles.gui.Renderer;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 */
public class FXRenderer extends Pane implements Renderer {

    private Pane rootShadedZones = new Pane();
    private Canvas canvas = new Canvas();

    private Pane rootSceneGraph = new Pane();

    private GraphicsContext g;

    public FXRenderer() {
        canvas.setMouseTransparent(true);
        g = canvas.getGraphicsContext2D();

        rootSceneGraph.setMouseTransparent(true);

        getChildren().addAll(rootShadedZones, rootSceneGraph, canvas);
    }

    private void setCanvasSize(double w, double h) {
        canvas.setWidth(w);
        canvas.setHeight(h);
    }

    public void draw(ConcreteDiagram diagram, boolean showDual) {
        draw(diagram);

        if (!showDual) {
            return;
        }

        EulerDualGraph dual = new EulerDualGraph(diagram);
        drawPoints(dual.getNodes().stream().map(n -> n.getZone().getCenter()).collect(Collectors.toList()));
        dual.getEdges().forEach(e -> {
            e.getCurve().setStroke(Color.RED);
            rootSceneGraph.getChildren().addAll(e.getCurve());
        });
    }

    @Override
    public void draw(ConcreteDiagram diagram) {
        Rectangle bbox = toFXRectangle(diagram.getBoundingBox());
        setCanvasSize(bbox.getWidth(), bbox.getHeight());

        clearRenderer();

        for (ConcreteZone zone : diagram.getShadedZones())
            drawShadedZone(zone, bbox);

        List<ConcreteZone> normalZones = new ArrayList<>(diagram.getAllZones());
        normalZones.removeAll(diagram.getShadedZones());
        //normalZones.removeIf(z -> z.getContainingContours().isEmpty());

        for (ConcreteZone zone : normalZones)
            drawNormalZone(zone, bbox);

        for (CircleContour contour : diagram.getCircles())
            drawCircleContour(contour);

        rootSceneGraph.getChildren().clear();

        for (PathContour contour : diagram.getContours()) {
            rootSceneGraph.getChildren().addAll(contour.getShape());
        }
    }

    private Set<AbstractCurve> makeCurves(String... curveLabels) {
        return Arrays.asList(curveLabels)
                .stream()
                .map(AbstractCurve::new)
                .collect(Collectors.toSet());
    }

    private class MovablePoint extends StackPane {
        private double mouseX, mouseY;
        private double oldX, oldY;

        //        dual.getEdges().forEach(q -> {
//            Point2D center1 = q.getV1().getZone().getCenter();
//            Point2D center2 = q.getV2().getZone().getCenter();
//
//            MovablePoint p1 = new MovablePoint(center1.getX(), center1.getY());
//            MovablePoint p2 = new MovablePoint(center2.getX(), center2.getY());
//
//            q.getCurve().startXProperty().bind(p1.layoutXProperty());
//            q.getCurve().startYProperty().bind(p1.layoutYProperty());
//            q.getCurve().endXProperty().bind(p2.layoutXProperty());
//            q.getCurve().endYProperty().bind(p2.layoutYProperty());
//
//            rootSceneGraph.getChildren().addAll(q.getCurve(), p1, p2);
//        });

        public MovablePoint(double x, double y) {
            relocate(x, y);

            oldX = x;
            oldY = y;

            Circle c = new Circle(5, Color.RED);
            c.setCenterX(5);
            c.setCenterY(5);

            getChildren().addAll(c);

            setOnMousePressed(e -> {
                mouseX = e.getSceneX();
                mouseY = e.getSceneY();
            });

            setOnMouseDragged(e -> {
                relocate(e.getSceneX() - mouseX + oldX, e.getSceneY() - mouseY + oldY);
            });

            setOnMouseReleased(e -> {
                oldX = getLayoutX();
                oldY = getLayoutY();
            });
        }
    }

    private void drawShadedZone(ConcreteZone zone, Rectangle bbox) {
        Shape shape = bbox;

        for (Contour contour : zone.getContainingContours()) {
            shape = Shape.intersect(shape, contour.getShape());
        }

        for (Contour contour : zone.getExcludingContours()) {
            shape = Shape.subtract(shape, contour.getShape());
        }

        Tooltip.install(shape, new Tooltip(zone.toDebugString()));
        shape.setUserData(zone);
        shape.setFill(Color.LIGHTGREY);
        rootShadedZones.getChildren().add(shape);
    }

    private void drawNormalZone(ConcreteZone zone, Rectangle bbox) {
        Shape shape = bbox;

        for (Contour contour : zone.getContainingContours()) {
            shape = Shape.intersect(shape, contour.getShape());
        }

        for (Contour contour : zone.getExcludingContours()) {
            shape = Shape.subtract(shape, contour.getShape());
        }

        Tooltip.install(shape, new Tooltip(zone.toDebugString()));
        shape.setUserData(zone);
        shape.setFill(Color.TRANSPARENT);
        rootShadedZones.getChildren().add(shape);
    }

    private void drawCircleContour(CircleContour contour) {
        g.setFill(Color.BLACK);
        g.setStroke(Color.BLUE);

        double radius = contour.getRadius();
        double x = contour.getCenterX() - radius;
        double y = contour.getCenterY() - radius;
        double w = 2 * radius;
        double h = 2 * radius;

        g.strokeOval(x, y, w, h);
        g.fillText(contour.getCurve().getLabel(), contour.getLabelXPosition(), contour.getLabelYPosition());
    }

    private void drawPoints(List<Point2D> points) {
        double r = 5;

        points.forEach(p -> {
            g.fillOval(p.getX() - r / 2, p.getY() - r / 2, r, r);
        });
    }

    private void clearRenderer() {
        rootShadedZones.getChildren().clear();
        g.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

    private Rectangle toFXRectangle(icircles.geometry.Rectangle rectangle) {
        return new Rectangle(rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
    }

    public List<Node> getShadedZones() {
        return rootShadedZones.getChildrenUnmodifiable();
    }
}
