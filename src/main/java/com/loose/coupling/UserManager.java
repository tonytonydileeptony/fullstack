package com.loose.coupling;

//import com.tight.coupling.UserDatabase;
import com.loose.coupling.DatabaseProvider;
public class UserManager {
  //private UserDatabaseProvider
    private DatabaseProvider userDatabase;

    public UserManager(DatabaseProvider userDatabase) {
        this.userDatabase = userDatabase;
    }

  public String getUserInfo(){
     //directly accessing userdatebase
      return userDatabase.getUserDetails();
  }
}
