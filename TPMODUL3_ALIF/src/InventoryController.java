public class InventoryController {
    import javafx.event.ActionEvent;
    import javafx.fxml.FXML;
    import javafx.scene.control.Alert;
    import javafx.scene.control.Alert.AlertType;
    import javafx.scene.control.TextField;
    
    public class LoginController {
        @FXML
        private TextField usernameField;
        @FXML
        private TextField passwordField;
    
        @FXML
        public void handleLogin(ActionEvent event) {
            String username = usernameField.getText();
            String password = passwordField.getText();
    
            // Validasi login (contoh: username = admin, password = admin)
            if ("admin".equals(username) && "admin".equals(password)) {
                // Jika login berhasil, buka halaman Inventory
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Inventory.fxml"));
                    Parent root = loader.load();
                    Stage stage = (Stage) usernameField.getScene().getWindow();
                    stage.setScene(new Scene(root));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                // Tampilkan alert jika login gagal
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Login Error");
                alert.setHeaderText("Kredensial Tidak Valid");
                alert.setContentText("Username atau password salah.");
                alert.showAndWait();
            }
        }
    }
    
