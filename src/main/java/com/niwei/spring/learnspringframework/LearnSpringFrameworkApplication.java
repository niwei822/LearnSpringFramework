package com.niwei.spring.learnspringframework;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext config = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		//SuperContraGame game = new SuperContraGame();
		//MarioGame game = new MarioGame();
		//GameConsole game = new PacmanGame();
		//GameRunner runner = new GameRunner(game);
		GameRunner runner = config.getBean(GameRunner.class);
		runner.run();
	}

}
