public class LoginController {
    import javafx.event.ActionEvent;
    import javafx.fxml.FXML;
    import javafx.scene.control.Alert;
    import javafx.scene.control.Alert.AlertType;
    import javafx.scene.control.TableView;
    import javafx.scene.control.TextField;
    import javafx.scene.input.MouseEvent;
    
    import java.util.ArrayList;
    import java.util.List;
    
    public class InventoryController {
        @FXML
        private TableView<Album> albumTable;
        @FXML
        private TextField albumNameField;
        @FXML
        private TextField artistField;
        @FXML
        private TextField totalField;
        @FXML
        private TextField availableField;
    
        private List<Album> albums = new ArrayList<>();
    
        @FXML
        public void handleAdd(ActionEvent event) {
            try {
                String albumName = albumNameField.getText();
                String artist = artistField.getText();
                int total = Integer.parseInt(totalField.getText());
                int available = Integer.parseInt(availableField.getText());
    
                Album newAlbum = new Album(albumName, artist, total, available, 0);
                albums.add(newAlbum);
                albumTable.getItems().add(newAlbum);
    
                // Tampilkan alert sukses
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Album Ditambahkan");
                alert.setHeaderText("Album berhasil ditambahkan");
                alert.showAndWait();
            } catch (NumberFormatException e) {
                // Tampilkan alert error jika input tidak valid
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Input");
                alert.setHeaderText("Input Tidak Valid");
                alert.setContentText("Harap masukkan angka yang valid untuk total dan available.");
                alert.showAndWait();
            }
        }
    
        @FXML
        public void handleDelete(ActionEvent event) {
            Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
            if (selectedAlbum != null) {
                albums.remove(selectedAlbum);
                albumTable.getItems().remove(selectedAlbum);
    
                // Tampilkan alert sukses
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Album Dihapus");
                alert.setHeaderText("Album berhasil dihapus");
                alert.showAndWait();
            }
        }
    
        @FXML
        public void handleUpdate(ActionEvent event) {
            Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
            if (selectedAlbum != null) {
                try {
                    selectedAlbum.setAlbumName(albumNameField.getText());
                    selectedAlbum.setArtist(artistField.getText());
                    selectedAlbum.setTotal(Integer.parseInt(totalField.getText()));
                    selectedAlbum.setAvailable(Integer.parseInt(availableField.getText()));
                    
                    albumTable.refresh();
    
                    // Tampilkan alert sukses
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Album Diperbarui");
                    alert.setHeaderText("Album berhasil diperbarui");
                    alert.showAndWait();
                } catch (NumberFormatException e) {
                    // Tampilkan alert error jika input tidak valid
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Error Input");
                    alert.setHeaderText("Input Tidak Valid");
                    alert.setContentText("Harap masukkan angka yang valid untuk total dan available.");
                    alert.showAndWait();
                }
            }
        }
    
        @FXML
        public void handleRent(ActionEvent event) {
            Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
            if (selectedAlbum != null && selectedAlbum.getAvailable() > 0) {
                selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
                selectedAlbum.setRented(selectedAlbum.getRented() + 1);
                albumTable.refresh();
    
                // Tampilkan alert sukses
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Album Disewa");
                alert.setHeaderText("Album berhasil disewa");
                alert.showAndWait();
            } else {
                // Tampilkan alert error jika tidak ada album yang tersedia
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Penyewaan");
                alert.setHeaderText("Tidak Ada Album yang Tersedia");
                alert.setContentText("Tidak ada album yang tersedia untuk disewa.");
                alert.showAndWait();
            }
        }
    
        @FXML
        public void handleSelect(MouseEvent event) {
            Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
            if (selectedAlbum != null) {
                albumNameField.setText(selectedAlbum.getAlbumName());
                artistField.setText(selectedAlbum.getArtist());
                totalField.setText(String.valueOf(selectedAlbum.getTotal()));
                availableField.setText(String.valueOf(selectedAlbum.getAvailable()));
            }
        }
    }
    
}
