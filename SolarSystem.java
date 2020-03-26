package solarsystem;

import javafx.util.Duration;
import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

/**
 *
 * @author Isaac
 */
public class SolarSystem extends Application {

    public Sphere star;
    @Override
    public void start(Stage primaryStage) {
        //setting up sizes for all planets and star
        star = new Sphere(200);
        Sphere mercury = new Sphere(4);
        Sphere venus = new Sphere(7);
        Sphere earth = new Sphere(7);
        Sphere moon = new Sphere(1);
        Sphere mars = new Sphere(4);
        Sphere jupiter = new Sphere(20);
        Sphere saturn = new Sphere (17);
        Sphere uranus = new Sphere (13);
        Sphere neptune = new Sphere (13);
        Sphere pluto = new Sphere(3);
        //giving them all textures within the source files
        setTexture("sun",star);
        setTexture("mercury",mercury);
        setTexture("venus",venus);
        setTexture("earth", earth);
        setTexture("mars",mars);
        setTexture("jupiter",jupiter);
        setTexture("saturn",saturn);
        setTexture("uranus",uranus);
        setTexture("neptune",neptune);
        setTexture("pluto",pluto);
        //giving them all individual ellipses around the sun 
        //which is proportional to what their elliptical speed actually is
        Ellipse ellipseMercury = new Ellipse();
        setEllipse(20,mercury,2.41,ellipseMercury);
        Ellipse ellipseVenus = new Ellipse();
        setEllipse(40,venus,6.986,ellipseVenus);
        Ellipse ellipseEarth = new Ellipse();
        setEllipse(100,earth,10.000017421,ellipseEarth);
        Ellipse ellipseMoon = new Ellipse();
        ellipseMoon.setRadiusX(pluto.getBoundsInLocal().getWidth() / 2.0 + 1.01671388 * 20);
        ellipseMoon.setRadiusY(pluto.getBoundsInLocal().getHeight() / 2.0 + 0.98329134 * 20);
        PathTransition transitionMoon = new PathTransition();
        transitionMoon.setPath(ellipseMoon);
        transitionMoon.setNode(moon);
        transitionMoon.setInterpolator(Interpolator.LINEAR);
        transitionMoon.setDuration(Duration.seconds(0.76923076923));
        transitionMoon.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transitionMoon.setCycleCount(Timeline.INDEFINITE);
        transitionMoon.play();
        Ellipse ellipseMars = new Ellipse();
        setEllipse(140,mars,18.82,ellipseMars);
        Ellipse ellipseJupiter = new Ellipse();
        setEllipse(180,jupiter,120,ellipseJupiter);
        Ellipse ellipseSaturn = new Ellipse();
        setEllipse(240,saturn,295,ellipseSaturn);
        Ellipse ellipseUranus = new Ellipse();
        setEllipse(280,uranus,840,ellipseUranus);
        Ellipse ellipseNeptune = new Ellipse();
        setEllipse(320,neptune,1650,ellipseNeptune);
        Ellipse ellipsePluto = new Ellipse();
        setEllipse(400,pluto,2480.000017421,ellipsePluto);
        /*
         * Hide all the ellipse shadows
         */
        ellipseMoon.setVisible(false);
        ellipseEarth.setVisible(false);
        ellipseMercury.setVisible(false);
        ellipseVenus.setVisible(false);
        ellipseMars.setVisible(false);
        ellipseJupiter.setVisible(false);
        ellipseSaturn.setVisible(false);
        ellipseUranus.setVisible(false);
        ellipseNeptune.setVisible(false);
        ellipsePluto.setVisible(false);
        /* here we create a new pane which we bind to earths location, add moon 
         * into it and then add the pane to the root pane
         */
        StackPane root = new StackPane();
        StackPane moonPane = new StackPane();
        moonPane.translateXProperty().bind(earth.translateXProperty());
        moonPane.translateYProperty().bind(earth.translateYProperty());
        moonPane.setMaxSize(100, 100);
        moonPane.getChildren().add(moon);
        root.getChildren().addAll(star, moonPane, mercury, venus, earth, mars, jupiter, saturn, uranus, neptune, pluto, 
                ellipseMercury, ellipseVenus, ellipseEarth, ellipseMars , ellipseJupiter , ellipseSaturn, ellipseUranus , ellipseNeptune, ellipsePluto);
        //setting the speed and rotation of each planet which is proportional to what they actually are
        setRotation(67500,star);
        setRotation(146614.997625,mercury);
        setRotation(291874.996625,venus);
        setRotation(2500,earth);
        setRotation(2564.2361425,mars);
        setRotation(1033.95000875,jupiter);
        setRotation(1114.50003375,saturn);
        setRotation(16000,neptune);
        setRotation(1677.5000325, pluto);
        root.setStyle("-fx-background-color: rgba(0, 0, 0, 1);");
 
        Scene scene = new Scene(root, 1500, 1000);
        
//        
//        
//        PerspectiveCamera camera = new PerspectiveCamera(true);
//        
//        //Backs the camera away from the scene by 1000 units
//        camera.setTranslateZ(-1000);
//        
//        //This is the range of which the camera will render objects
//        camera.setNearClip(0.1);
//        camera.setFarClip(1000.0);
//        
//        //The default field of view for the scene is 30 but change to suit
//        camera.setFieldOfView(90);
//        camera.setRotate(360);
//        scene.setCamera(camera);
        
        
        
 
        primaryStage.setTitle("Our Solar System!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void setTexture(String name, Sphere planet){
        Image PlanetImage = new Image("file:" + name + ".jpg");
        PhongMaterial planetPhong = new PhongMaterial();
        planetPhong.setDiffuseMap(PlanetImage);
        planet.setMaterial(planetPhong);
    }
    public void setRotation(double duration, Sphere planet){
        RotateTransition rotatePlanet = new RotateTransition();
        rotatePlanet.setNode(planet);
        rotatePlanet.setDuration(Duration.millis(duration));
        rotatePlanet.setAxis(Rotate.Y_AXIS);
        rotatePlanet.setByAngle(-360);
        rotatePlanet.setCycleCount(Animation.INDEFINITE);
        rotatePlanet.setInterpolator(Interpolator.LINEAR);
        rotatePlanet.play();
    }
    public void setEllipse(int distance, Sphere planet,double duration, Ellipse ellipse){
        ellipse.setRadiusX(star.getBoundsInLocal().getWidth() / 2.0 + 1.01671388 * distance);
        ellipse.setRadiusY(star.getBoundsInLocal().getHeight() / 2.0 + 0.98329134 * distance);
        
        PathTransition transitionPlanet = new PathTransition();
        transitionPlanet.setPath(ellipse);
        transitionPlanet.setNode(planet);
        transitionPlanet.setInterpolator(Interpolator.LINEAR);
        transitionPlanet.setDuration(Duration.seconds(duration));
        transitionPlanet.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transitionPlanet.setCycleCount(Timeline.INDEFINITE);
        transitionPlanet.play();
    }
    public static void main(String[] args) {
        launch(args);
    }
 
}
