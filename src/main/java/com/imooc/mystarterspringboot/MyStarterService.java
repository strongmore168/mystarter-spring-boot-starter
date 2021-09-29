package com.imooc.mystarterspringboot;

public class MyStarterService {

  private String username;
  private String password;

  public MyStarterService(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public void operator() {
    System.out.println(username + "," + password);
  }
}