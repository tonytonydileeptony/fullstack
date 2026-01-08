package com.loose.coupling;

public class NewdatabaseProvider implements DatabaseProvider {
    @Override
    public String getUserDetails() {
        return " from new new data base provider";
    }
}
