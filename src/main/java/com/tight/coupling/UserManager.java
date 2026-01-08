package com.tight.coupling;

public class UserManager {
  private UserDatabase userDatebase=new UserDatabase();
  public String getUserInfo(){
     //directly accessing userdatebase
      return userDatebase.getUserDetails();
  }
}
