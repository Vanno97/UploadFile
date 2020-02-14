package it.bitshop.UploadFile;

import java.io.File;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UploadFileApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UploadFileApplication.class, args);
	}
        
        @Override
        public void run(String...args){
            File f = new File("files");
            if(!f.exists()){
                f.mkdir();
            }
        }

}
