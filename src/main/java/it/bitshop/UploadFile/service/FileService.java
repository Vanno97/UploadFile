package it.bitshop.UploadFile.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Classe Service per gestire il cariamento dei file
 * 
 * @author Micael Vanini
 */
@Service
public class FileService {
    private static final String FILE_DIRECTORY = "files";
    
    public void storeFile(MultipartFile file) throws IOException{
        Path filePath = Paths.get(FILE_DIRECTORY + "/" + file.getOriginalFilename());
        
        Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
    }
}
