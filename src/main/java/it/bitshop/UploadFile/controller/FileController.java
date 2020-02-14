package it.bitshop.UploadFile.controller;

import it.bitshop.UploadFile.service.FileService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Classe Controller che intercetta la chiamata per salvare il file
 * 
 * @author Micael Vanini
 */
@RestController
@RequestMapping("/file")
public class FileController {
    @Autowired
    private FileService fileService;
    
    @PostMapping("/upload")
    public void upload(@RequestParam MultipartFile file) throws IOException {
        fileService.storeFile(file);
    }
    
}
