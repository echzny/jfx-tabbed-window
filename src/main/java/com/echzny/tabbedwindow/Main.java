package com.echzny.tabbedwindow;

import atlantafx.base.theme.PrimerDark;
import atlantafx.base.theme.PrimerLight;
import com.jthemedetecor.OsThemeDetector;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.*;
import javafx.scene.shape.SVGPath;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lombok.val;

public class Main extends Application {
  @Override
  public void start(Stage stage) {
    val headerBar = new HeaderBar();
    headerBar.setPadding(new Insets(0, 10, 0, 10));

    val tabButtons = new HBox();
    tabButtons.setAlignment(Pos.CENTER);
    val tab1 = new Button("Tab 1");
    val tab2 = new Button("Tab 2");
    tabButtons.getChildren().addAll(tab1, tab2);
    headerBar.setCenter(tabButtons);

    val settingButton = new Button("⚙️");
    settingButton.setStyle("-fx-font-size: 32px;");
    settingButton.setBorder(null);
    settingButton.setBackground(null);
    settingButton.setPadding(Insets.EMPTY);
    headerBar.setTrailing(settingButton);

    val contents = new BorderPane();
    val toolbar = new BorderPane();
    toolbar.setLeft(new Button("←"));
    toolbar.setCenter(new DatePicker());
    toolbar.setRight(new Button("→"));
    contents.setTop(toolbar);
    contents.setLeft(new Label("Left"));
    contents.setCenter(new Label("Contents"));
    contents.setRight(new Label("Right"));

    val bottomMenu = new BorderPane(new Label("bottom menu"));

    val root = new BorderPane();
    root.setTop(headerBar);
    root.setCenter(contents);
    root.setBottom(bottomMenu);

    var scene = new Scene(root, 600, 400);
    stage.setTitle("Tabbed Window");
    stage.setScene(scene);
    stage.initStyle(StageStyle.EXTENDED);
    stage.show();
  }

  public static void main(String[] args) {
    val detector = OsThemeDetector.getDetector();

    if (detector.isDark()) {
      Application.setUserAgentStylesheet(new PrimerDark().getUserAgentStylesheet());
    } else {
      Application.setUserAgentStylesheet(new PrimerLight().getUserAgentStylesheet());
    }

    launch(args);
  }
}
