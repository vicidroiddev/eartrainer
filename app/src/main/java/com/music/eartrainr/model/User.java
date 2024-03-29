package com.music.eartrainr.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
  private String email;
  private String rank;
  private String userName;
  private long  stackId;
  private String uid;

  public User() {
  }

  public long getStackId() {
    return stackId;
  }

  public void setStackId(final long stackId) {
    this.stackId = stackId;
  }

  public String getUid() {
    return uid;
  }

  public void setUid(final String uid) {
    this.uid = uid;
  }

  public class user {

  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(final String userName) {
    this.userName = userName;
  }

  public String getRank() {
    return rank;
  }

  public void setRank(final String rank) {
    this.rank = rank;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(final String email) {
    this.email = email;
  }
}
