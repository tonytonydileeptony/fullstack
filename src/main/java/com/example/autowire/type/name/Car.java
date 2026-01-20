package com.example.autowire.type.name;

//import car.constructor.injection.Specification;
//import org.springframework.beans.factory.annotation.Autowired;

public class Car {

    private Specification specification;



    public void displayDetails()
    {
        System.out.println("Car Details:"+specification.toString());
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }
}
