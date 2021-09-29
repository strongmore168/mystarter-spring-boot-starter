package com.imooc.mystarterspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mystarter")
public class MyStarterServiceProperties {

  private String username;
  private String password;

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  @Override
  public String toString() {
    return username + "," + password;
  }
}