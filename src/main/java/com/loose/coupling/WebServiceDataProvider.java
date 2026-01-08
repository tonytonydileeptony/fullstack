package com.loose.coupling;

public class WebServiceDataProvider implements  DatabaseProvider{

    @Override
    public String getUserDetails() {
        return "from web service";
    }
}
