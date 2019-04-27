package com.uploadMultipartfile;

import com.uploadMultipartfile.storage.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.io.File;

@SpringBootApplication
@EnableConfigurationProperties({
        StorageProperties.class
})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
