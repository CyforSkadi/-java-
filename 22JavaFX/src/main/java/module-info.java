module cn.cy._22javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens cn.cy._22javafx to javafx.fxml;
    exports cn.cy._22javafx;
}