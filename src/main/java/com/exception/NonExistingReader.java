package com.exception;

/**
 * Created by Dragana.Nikolovska on 11/3/2016.
 */
public class NonExistingReader extends RuntimeException {
    public NonExistingReader(String username) {
        super("User with username: " + username + " does not exist!");
    }
}
