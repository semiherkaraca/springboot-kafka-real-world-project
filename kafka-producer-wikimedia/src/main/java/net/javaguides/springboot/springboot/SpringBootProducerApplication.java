package net.javaguides.springboot.springboot;

import lombok.RequiredArgsConstructor;
import net.javaguides.springboot.springboot.service.WikimediaChangesProducerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootProducerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProducerApplication.class, args);
    }

    private final WikimediaChangesProducerService wikimediaChangesProducerService;

    @Override
    public void run(String... args) throws Exception {
        wikimediaChangesProducerService.sendMessage();
    }
}