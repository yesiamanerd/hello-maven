package com.yesiamanerd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class HelloMaven {

    private final static Logger LOGGER = LoggerFactory.getLogger(HelloMaven.class);

    public static void main(String[] args) {
        LOGGER.info("Hello Info");
        LOGGER.debug("Hello Debug");
    }
}
