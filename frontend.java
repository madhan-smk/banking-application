package madhan;
//MADHAN'S SAMPLE FRONT END
import javafx.application.*;
import javafx.application.Application;
import java.io.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
public class frontend extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception{
		//Creating a label
		Label lbl= new Label ("Enter your name");
		lbl.setText("\t*******************Welcome to out bank**********************");
		lbl.setTextAlignment(TextAlignment.CENTER);
		lbl.setFont(new Font("Times New Roman",32));
		//creating a layout
		HBox root = new HBox();
		//adding label to Layout
		root.getChildren().add(lbl);
		//creating the scene
		Scene sc = new Scene(root);
		//adding scene to stage
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}

public static void main(String[] args) {
	launch(args);
}
}
