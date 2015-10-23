package nelson_7_methodmadness;

import java.util.Random;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Nelson_7_MethodMadness extends Application {
    static Random random = new Random();
    public static int n = random.nextInt(18);
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws InterruptedException {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(1020, 1020);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        draw0(gc);
        draw1(gc);
        draw2(gc);
        draw3(gc);
        draw4(gc);
        draw5(gc);
        draw6(gc);
        draw7(gc);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    private void draw0(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (true) {
                gc.setFill(Color.rgb(i/4, i/4, i/4));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw1(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (n == 1) {
                gc.setFill(Color.rgb(0, i/4, i/4));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw2(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (n == 2) {
                gc.setFill(Color.rgb(255, i/4, i/4));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw3(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (n == 3) {
                gc.setFill(Color.rgb(i/4, 0, i/4));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw4(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (n == 4) {
                gc.setFill(Color.rgb(i/4, 255, i/4));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw5(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (n == 5) {
                gc.setFill(Color.rgb(i/4, i/4, 0));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw6(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (n == 6) {
                gc.setFill(Color.rgb(i/4, i/4, 255));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw7(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (n == 7) {
                gc.setFill(Color.rgb(0, 0, i/4));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw8(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (n == 8) {
                gc.setFill(Color.rgb(0, 255, i/4));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw9(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (n == 9) {
                gc.setFill(Color.rgb(255, 0, i/4));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw10(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (n == 10) {
                gc.setFill(Color.rgb(255, 255, i/4));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw11(GraphicsContext gc) {
        for (int i = 11; i < 1020; i+= 1){
            if (n == 0) {
                gc.setFill(Color.rgb(0, i/4, 0));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw12(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (n == 12) {
                gc.setFill(Color.rgb(0, i/4, 255));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw13(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (n == 13) {
                gc.setFill(Color.rgb(255, i/4, 0));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw14(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (n == 14) {
                gc.setFill(Color.rgb(255, i/4, 255));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw15(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (n == 15) {
                gc.setFill(Color.rgb(i/4, 0, 0));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw16(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (n == 16) {
                gc.setFill(Color.rgb(i/4, 0, 255));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw17(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (n == 17) {
                gc.setFill(Color.rgb(i/4, 255, 0));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
    private void draw18(GraphicsContext gc) {
        for (int i = 0; i < 1020; i+= 1){
            if (n == 18) {
                gc.setFill(Color.rgb(i/4, 255, 255));
                gc.fillOval(i/2, i/2, 1020 - i, 1020 - i);
            }
        }
    }
}
