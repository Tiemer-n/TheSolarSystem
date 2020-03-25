/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solarsystem;

import javafx.util.Duration;
import java.util.concurrent.TimeUnit;
import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
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
    public Sphere earth;
    public Sphere moon;
    public Sphere pluto;
    public Sphere mercury;
    public Sphere venus;
    public Sphere mars;
    public Sphere jupiter;
    public Sphere saturn;
    public Sphere uranus;
    public Sphere neptune;
    @Override
    public void start(Stage primaryStage) {
        
        Sphere star = new Sphere(100);
        mercury = new Sphere(4);
        venus = new Sphere(7);
        earth = new Sphere(7);
        moon = new Sphere(1);
        mars = new Sphere(4);
        jupiter = new Sphere(20);
        saturn = new Sphere (17);
        uranus = new Sphere (13);
        neptune = new Sphere (13);
        pluto = new Sphere(3);
        
        Image sunImage = new Image("file:sun.jpg");
        PhongMaterial sunPhong = new PhongMaterial();
        sunPhong.setDiffuseMap(sunImage);
        star.setMaterial(sunPhong);
        
        Image mercuryImage = new Image("file:mercury.jpg");
        PhongMaterial mercuryPhong = new PhongMaterial();
        mercuryPhong.setDiffuseMap(mercuryImage);
        mercury.setMaterial(mercuryPhong);
        
        Image venusImage = new Image("file:venus.jpg");
        PhongMaterial venusPhong = new PhongMaterial();
        venusPhong.setDiffuseMap(venusImage);
        venus.setMaterial(venusPhong);
        
        Image earthImage = new Image("file:earth.jpg");
        PhongMaterial earthPhong = new PhongMaterial();
        earthPhong.setDiffuseMap(earthImage);
        earth.setMaterial(earthPhong);
        
        Image marsImage = new Image("file:mars.jpg");
        PhongMaterial marsPhong = new PhongMaterial();
        marsPhong.setDiffuseMap(marsImage);
        mars.setMaterial(marsPhong);
        
        Image jupiterImage = new Image("file:jupiter.jpg");
        PhongMaterial jupiterPhong = new PhongMaterial();
        jupiterPhong.setDiffuseMap(jupiterImage);
        jupiter.setMaterial(jupiterPhong);
        
        Image saturnImage = new Image("file:saturn.jpg");
        PhongMaterial saturnPhong = new PhongMaterial();
        saturnPhong.setDiffuseMap(saturnImage);
        saturn.setMaterial(saturnPhong);
        
        Image uranusImage = new Image("file:uranus.jpg");
        PhongMaterial uranuaPhong = new PhongMaterial();
        uranuaPhong.setDiffuseMap(uranusImage);
        uranus.setMaterial(uranuaPhong);
        
        Image neptuneImage = new Image("file:neptune.jpg");
        PhongMaterial neptunePhong = new PhongMaterial();
        neptunePhong.setDiffuseMap(neptuneImage);
        neptune.setMaterial(neptunePhong);
        
        Image plutoImage = new Image("file:pluto.jpg");
        PhongMaterial plutoPhong = new PhongMaterial();
        plutoPhong.setDiffuseMap(plutoImage);
        pluto.setMaterial(plutoPhong);
 
        Ellipse ellipseMercury = new Ellipse();
        
        ellipseMercury.setRadiusX(star.getBoundsInLocal().getWidth() / 2.0 + 1.01671388 * 20);
        ellipseMercury.setRadiusY(star.getBoundsInLocal().getHeight() / 2.0 + 0.98329134 * 20);
        
        PathTransition transitionMercury = new PathTransition();
        transitionMercury.setPath(ellipseMercury);
        transitionMercury.setNode(mercury);
        transitionMercury.setInterpolator(Interpolator.LINEAR);
        transitionMercury.setDuration(Duration.seconds(2.41));
        transitionMercury.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transitionMercury.setCycleCount(Timeline.INDEFINITE);
        transitionMercury.play();
        
        Ellipse ellipseVenus = new Ellipse();
        
        ellipseVenus.setRadiusX(star.getBoundsInLocal().getWidth() / 2.0 + 1.01671388 * 40);
        ellipseVenus.setRadiusY(star.getBoundsInLocal().getHeight() / 2.0 + 0.98329134 * 40);
 
        PathTransition transitionVenus = new PathTransition();
        transitionVenus.setPath(ellipseVenus);
        transitionVenus.setNode(venus);
        transitionVenus.setInterpolator(Interpolator.LINEAR);
        transitionVenus.setDuration(Duration.seconds(6.986));
        transitionVenus.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transitionVenus.setCycleCount(Timeline.INDEFINITE);
        transitionVenus.play();
        
        Ellipse ellipseEarth = new Ellipse();
        
        ellipseEarth.setRadiusX(star.getBoundsInLocal().getWidth() / 2.0 + 1.01671388 * 100);
        ellipseEarth.setRadiusY(star.getBoundsInLocal().getHeight() / 2.0 + 0.98329134 * 100);
 
        PathTransition transitionEarth = new PathTransition();
        transitionEarth.setPath(ellipseEarth);
        transitionEarth.setNode(earth);
        transitionEarth.setInterpolator(Interpolator.LINEAR);
        transitionEarth.setDuration(Duration.seconds(10.000017421));
        transitionEarth.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transitionEarth.setCycleCount(Timeline.INDEFINITE);
        transitionEarth.play();
        
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
        
        ellipseMars.setRadiusX(star.getBoundsInLocal().getWidth() / 2.0 + 1.01671388 * 140);
        ellipseMars.setRadiusY(star.getBoundsInLocal().getHeight() / 2.0 + 0.98329134 * 140);
        
        PathTransition transitionMars = new PathTransition();
        transitionMars.setPath(ellipseMars);
        transitionMars.setNode(mars);
        transitionMars.setInterpolator(Interpolator.LINEAR);
        transitionMars.setDuration(Duration.seconds(18.82));
        transitionMars.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transitionMars.setCycleCount(Timeline.INDEFINITE);
        transitionMars.play();
        
        Ellipse ellipseJupiter = new Ellipse();
        
        ellipseJupiter.setRadiusX(star.getBoundsInLocal().getWidth() / 2.0 + 1.01671388 * 180);
        ellipseJupiter.setRadiusY(star.getBoundsInLocal().getHeight() / 2.0 + 0.98329134 * 180);
        
        PathTransition transitionJupiter = new PathTransition();
        transitionJupiter.setPath(ellipseJupiter);
        transitionJupiter.setNode(jupiter);
        transitionJupiter.setInterpolator(Interpolator.LINEAR);
        transitionJupiter.setDuration(Duration.seconds(120));
        transitionJupiter.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transitionJupiter.setCycleCount(Timeline.INDEFINITE);
        transitionJupiter.play();
        
        Ellipse ellipseSaturn = new Ellipse();
        
        ellipseSaturn.setRadiusX(star.getBoundsInLocal().getWidth() / 2.0 + 1.01671388 * 240);
        ellipseSaturn.setRadiusY(star.getBoundsInLocal().getHeight() / 2.0 + 0.98329134 * 240);
        
        PathTransition transitionSaturn = new PathTransition();
        transitionSaturn.setPath(ellipseSaturn);
        transitionSaturn.setNode(saturn);
        transitionSaturn.setInterpolator(Interpolator.LINEAR);
        transitionSaturn.setDuration(Duration.seconds(295));
        transitionSaturn.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transitionSaturn.setCycleCount(Timeline.INDEFINITE);
        transitionSaturn.play();
        
        Ellipse ellipseUranus = new Ellipse();
        
        ellipseUranus.setRadiusX(star.getBoundsInLocal().getWidth() / 2.0 + 1.01671388 * 280);
        ellipseUranus.setRadiusY(star.getBoundsInLocal().getHeight() / 2.0 + 0.98329134 * 280);
        
        PathTransition transitionUranus = new PathTransition();
        transitionUranus.setPath(ellipseUranus);
        transitionUranus.setNode(uranus);
        transitionUranus.setInterpolator(Interpolator.LINEAR);
        transitionUranus.setDuration(Duration.seconds(840));
        transitionUranus.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transitionUranus.setCycleCount(Timeline.INDEFINITE);
        transitionUranus.play();
        
        Ellipse ellipseNeptune = new Ellipse();
        
        ellipseNeptune.setRadiusX(star.getBoundsInLocal().getWidth() / 2.0 + 1.01671388 * 320);
        ellipseNeptune.setRadiusY(star.getBoundsInLocal().getHeight() / 2.0 + 0.98329134 * 320);
        
        PathTransition transitionNeptune = new PathTransition();
        transitionNeptune.setPath(ellipseNeptune);
        transitionNeptune.setNode(neptune);
        transitionNeptune.setInterpolator(Interpolator.LINEAR);
        transitionNeptune.setDuration(Duration.seconds(1650));
        transitionNeptune.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transitionNeptune.setCycleCount(Timeline.INDEFINITE);
        transitionNeptune.play();
        
        Ellipse ellipsePluto = new Ellipse();
        
        ellipsePluto.setRadiusX(star.getBoundsInLocal().getWidth() / 2.0 + 1.01671388 * 400);
        ellipsePluto.setRadiusY(star.getBoundsInLocal().getHeight() / 2.0 + 0.98329134 * 400);
        
        PathTransition transitionPluto = new PathTransition();
        transitionPluto.setPath(ellipsePluto);
        transitionPluto.setNode(pluto);
        transitionPluto.setInterpolator(Interpolator.LINEAR);
        transitionPluto.setDuration(Duration.seconds(2480.000017421));
        transitionPluto.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transitionPluto.setCycleCount(Timeline.INDEFINITE);
        transitionPluto.play();
 
        
 
         
        /*
         * Hide the ellipse shadows
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
//        color for the new pane to see it
//        moonPane.setStyle("-fx-background-color: #EAEAAE;"); 
        

        moonPane.getChildren().add(moon);
        root.getChildren().addAll(star, moonPane, mercury, venus, earth, mars, jupiter, saturn, uranus, neptune, pluto, 
                ellipseMercury, ellipseVenus, ellipseEarth, ellipseMars , ellipseJupiter , ellipseSaturn, ellipseUranus , ellipseNeptune, ellipsePluto);
        
        RotateTransition rotateSun = new RotateTransition();
        rotateSun.setNode(star);
        rotateSun.setDuration(Duration.millis(67500));
        rotateSun.setAxis(Rotate.Y_AXIS);
        rotateSun.setByAngle(-360);
        rotateSun.setCycleCount(Animation.INDEFINITE);
        rotateSun.setInterpolator(Interpolator.LINEAR);
        rotateSun.play();
        
        RotateTransition rotateMercury = new RotateTransition();
        rotateMercury.setNode(mercury);
        rotateMercury.setDuration(Duration.millis(146614.997625));
        rotateMercury.setAxis(Rotate.Y_AXIS);
        rotateMercury.setByAngle(-360);
        rotateMercury.setCycleCount(Animation.INDEFINITE);
        rotateMercury.setInterpolator(Interpolator.LINEAR);
        rotateMercury.play();
        
        RotateTransition rotateVenus = new RotateTransition();
        rotateVenus.setNode(venus);
        rotateVenus.setDuration(Duration.millis(291874.996625));
        rotateVenus.setAxis(Rotate.Y_AXIS);
        rotateVenus.setByAngle(-360);
        rotateVenus.setCycleCount(Animation.INDEFINITE);
        rotateVenus.setInterpolator(Interpolator.LINEAR);
        rotateVenus.play();
        
        RotateTransition rotateEarth = new RotateTransition();
        rotateEarth.setNode(earth);
        rotateEarth.setDuration(Duration.millis(2500));
        rotateEarth.setAxis(Rotate.Y_AXIS);
        rotateEarth.setByAngle(-360);
        rotateEarth.setCycleCount(Animation.INDEFINITE);
        rotateEarth.setInterpolator(Interpolator.LINEAR);
        rotateEarth.play();
        
        RotateTransition rotateMars = new RotateTransition();
        rotateMars.setNode(mars);
        rotateMars.setDuration(Duration.millis(2564.2361425));
        rotateMars.setAxis(Rotate.Y_AXIS);
        rotateMars.setByAngle(-360);
        rotateMars.setCycleCount(Animation.INDEFINITE);
        rotateMars.setInterpolator(Interpolator.LINEAR);
        rotateMars.play();
        
        RotateTransition rotateJupiter = new RotateTransition();
        rotateJupiter.setNode(jupiter);
        rotateJupiter.setDuration(Duration.millis(1033.95000875));
        rotateJupiter.setAxis(Rotate.Y_AXIS);
        rotateJupiter.setByAngle(-360);
        rotateJupiter.setCycleCount(Animation.INDEFINITE);
        rotateJupiter.setInterpolator(Interpolator.LINEAR);
        rotateJupiter.play();
        
        RotateTransition rotateSaturn = new RotateTransition();
        rotateSaturn.setNode(saturn);
        rotateSaturn.setDuration(Duration.millis(1114.50003375));
        rotateSaturn.setAxis(Rotate.Y_AXIS);
        rotateSaturn.setByAngle(-360);
        rotateSaturn.setCycleCount(Animation.INDEFINITE);
        rotateSaturn.setInterpolator(Interpolator.LINEAR);
        rotateSaturn.play();
        
        RotateTransition rotateNeptune = new RotateTransition();
        rotateNeptune.setNode(neptune);
        rotateNeptune.setDuration(Duration.millis(16000));
        rotateNeptune.setAxis(Rotate.Y_AXIS);
        rotateNeptune.setByAngle(-360);
        rotateNeptune.setCycleCount(Animation.INDEFINITE);
        rotateNeptune.setInterpolator(Interpolator.LINEAR);
        rotateNeptune.play();
        
        RotateTransition rotatePluto = new RotateTransition();
        rotatePluto.setNode(pluto);
        rotatePluto.setDuration(Duration.millis(1677.5000325));
        rotatePluto.setAxis(Rotate.Y_AXIS);
        rotatePluto.setByAngle(-360);
        rotatePluto.setCycleCount(Animation.INDEFINITE);
        rotatePluto.setInterpolator(Interpolator.LINEAR);
        rotatePluto.play();
        
        
        root.setStyle("-fx-background-color: rgba(0, 0, 0, 1);");
 
        Scene scene = new Scene(root, 1500, 1000);
 
        primaryStage.setTitle("Our Solar System!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
 
}
