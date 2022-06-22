package tubes_kelompok.pkg3_apk_go.learnlish;


import java.io.File;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;




/**
 *
 * @author ACER
 */
public class Video extends Application{
    
    File file;
    final Label lblFile = new Label();
    Button pilih = new Button();
    Button play = new Button();
    Button pause = new Button();
    Button stop = new Button();

    final VBox vb = new VBox();
    final Slider s = new Slider();
    
    HBox hb = new HBox();

    MediaPlayer mp;
    MediaView mv;
   
    @Override
    public void start(final Stage primaryStage) throws Exception {
        final StackPane root = new StackPane();
        primaryStage.setTitle("VideoPlayerEX");
        
        pilih.setText("Pilih File");
        play.setText("Play");
        pause.setText("Pause");
        stop.setText("Stop");
             

        Media m = new Media(fileChooser());
        mp = new MediaPlayer(m);
        mv = new MediaView(mp);
        mp.play();
        
        pilih.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {

                mp.dispose();
                mp = new MediaPlayer(new Media(fileChooser()));
                mv.setMediaPlayer(mp);
                mp.play();
                
                mp.setOnReady(new Runnable() {

                    @Override
                    public void run() {
                        onReady(primaryStage);
                    }
                });
        
                mp.currentTimeProperty().addListener(new ChangeListener<Duration>() {

                    @Override
                    public void changed(ObservableValue<? extends Duration> ov, Duration t, Duration t1) {
                        s.setValue(t1.toSeconds());
                    }
                });
                

            }
        });
      
        mp.setOnReady(new Runnable() {

            @Override
            public void run() {
                onReady(primaryStage);
            }
        });
        
        mp.currentTimeProperty().addListener(new ChangeListener<Duration>() {

            @Override
            public void changed(ObservableValue<? extends Duration> ov, Duration t, Duration t1) {
                s.setValue(t1.toSeconds());
            }
        });
        
        play.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                mp.play();
            }
        });
        
        
        pause.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                mp.pause();
            }
        });
      
        
        stop.setOnAction(new EventHandler<ActionEvent>() {

             @Override
             public void handle(ActionEvent t) {
                 mp.stop();
             }
         });
     
        
        s.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent t) {
                mp.seek(Duration.seconds(s.getValue()));
            }
        }); 
        
        s.setMin(0.0);
        s.setValue(0.0);
        s.setMax(mp.getTotalDuration().toSeconds());

        hb.getChildren().add(pilih);
        hb.getChildren().add(play);
        hb.getChildren().add(pause);
        hb.getChildren().add(stop);
        
        vb.getChildren().add(s);
        vb.getChildren().add(lblFile);
        vb.getChildren().add(hb);
        
        root.getChildren().add(mv);
        root.getChildren().add(vb);
        
        primaryStage.setScene(new Scene(root, 600, 480));
        primaryStage.show();
    }

    private void onReady(Stage stage) {
        int w = mp.getMedia().getWidth();
        int h = mp.getMedia().getHeight();

        stage.setMinWidth(w);
        stage.setMinHeight(h);

        vb.setMinSize(w-50, 500);
        vb.setTranslateY(h+30);
        s.setMin(0.0);
        s.setValue(0.0);
        s.setMax(mp.getTotalDuration().toSeconds());
    }
    
    private String fileChooser() {
        FileChooser fileChooser = new FileChooser();

        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("MP4 Files (*.mp4)", "*.MP4");
        fileChooser.getExtensionFilters().add(extFilter);

        file = fileChooser.showOpenDialog(null);

        String path = "file://" +file.toURI().getPath().replaceAll(" ", "%20");
        lblFile.setText(path);
        
        return path;

    }
    public static void main(String[] args) {
        launch(args);
    }
    
}






<<<<<<< HEAD
=======

>>>>>>> f17777728a01991ba9df00567b8e45d90f737943
