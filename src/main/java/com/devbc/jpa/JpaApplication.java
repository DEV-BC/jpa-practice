package com.devbc.jpa;

import com.devbc.jpa.models.Author;
import com.devbc.jpa.models.Video;
import com.devbc.jpa.repositories.AuthorRepository;
import com.devbc.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	//@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository repository, VideoRepository videoRepository) {
		return args -> {
//			var author = Author.builder()
//					.firstName("Brandon")
//					.lastName("Carr")
//					.age(39)
//					.email("test@test123.com")
//					.build();
//			repository.save(author);
			var video = Video.builder()
					.name("ABC")
					.length(5)
					.build();
			videoRepository.save(video);
		};
	}

}
