package com.example.service;

/**
 * Created by libin on 9/19/16.
 */
public interface Greetings {
    String say(String name);
    String sayMulti(String... words);
    String hello(User user);
}
