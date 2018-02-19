
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application { // 1

	public static void main(String[] args) {
		launch(); // 2
	}

	@Override
	public void start(Stage palco) throws Exception { // 3

		URL arquivoFXML = getClass().getResource("frmForm.fxml");
		Parent fxmlParent = (Parent) FXMLLoader.load(arquivoFXML);
		palco.setScene(new Scene(fxmlParent, 568, 545));
		palco.setTitle("CEPF�cil");
		palco.show();

	}
}
