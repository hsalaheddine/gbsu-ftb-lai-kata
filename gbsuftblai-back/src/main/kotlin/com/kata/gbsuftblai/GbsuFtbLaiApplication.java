package com.kata.gbsuftblai;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class GbsuFtbLaiApplication implements CommandLineRunner{

	private final static Logger logger = LoggerFactory.getLogger(GbsuFtbLaiApplication.class);

    
public static void main(String[] args) {
    SpringApplication.run(GbsuFtbLaiApplication.class, args);

}

@Override
	    public void run(String... args) {
	        logger.info("********	Gbsu Ftb Lai service UP	********");
	    }

}


