package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        DatabaseProvider databaseProvider=new UserDatabase();
        UserManager userManager=new UserManager(databaseProvider);
        System.out.printf("Hello and welcome!"+userManager.getUserInfo());

        DatabaseProvider webdatabaseProvider=new WebServiceDataProvider();
        UserManager userManager1=new UserManager(webdatabaseProvider);
        System.out.printf("Hello and welcome!"+userManager1.getUserInfo());
        DatabaseProvider newdatabaseProvider=new NewdatabaseProvider();
        UserManager userManagerWithNewDB=new UserManager(newdatabaseProvider);
        System.out.printf("Hello and welcome!"+userManagerWithNewDB.getUserInfo());
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationIOCContainer.xml");
        userManager1=(UserManager) context.getBean("dataProvider");
        System.out.println(" ----"+userManager1.getUserInfo());
    }
}