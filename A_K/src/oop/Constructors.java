package oop;
//this.
class Vehicle{
    int wheels;
    int headLights;
    String color;

    Vehicle(int noOfWheels)
    {
        wheels=noOfWheels;
        headLights=2;
    }

    Vehicle(int wheels,String color)
    {
        this.wheels=wheels;
        this.color=color;
        headLights=2;
    }

}

public class Constructors {

    Constructors()
    {
        System.out.println("Constructor is used");
    }

    public static void main(String[] args) {

        Constructors obj=new Constructors();
        Vehicle car = new Vehicle(4);
        Vehicle scooty = new Vehicle(2);
        Vehicle bike = new Vehicle(2,"blue");


        System.out.println(car.wheels);
        System.out.println(scooty.wheels);
        System.out.println(bike.wheels);
        System.out.println(bike.color);



    }

}
