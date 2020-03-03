package com.untitled.mainapp;

import com.untitled.pojo.Engine;
import com.untitled.pojo.Vehicle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VehileMainApp {
    public static void main(String[] args) {
        Vehicle vehicle1= new Vehicle(1,"lamborgini",new Engine("engine1","diesel",1949.23,new Date()),28585858);
        Vehicle vehicle2= new Vehicle(2,"honda",new Engine("engine2","petrol",132439.23,new Date()),28585858);
        Vehicle vehicle3= new Vehicle(4,"tata",new Engine("engine3","diesel",1943439.23,new Date()),28585858);
        Vehicle vehicle4= new Vehicle(9,"bata",new Engine("engine4","diesel",194449.23,new Date()),28585858);
        Vehicle vehicle5= new Vehicle(12,"sata",new Engine("engine5","petrol",19429.23,new Date()),28585858);
        Vehicle vehicle6= new Vehicle(15,"mata",new Engine("engine6","diesel",19439.23,new Date()),28585858);

        //adding into arrayList

        List<Vehicle> vehicleList= new ArrayList<>();
        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);
        vehicleList.add(vehicle3);
        vehicleList.add(vehicle4);
        vehicleList.add(vehicle5);
        vehicleList.add(vehicle6);

        //printing the vehiles

        for(Vehicle vehicle: vehicleList){
            System.out.println(vehicle);
        }

    }
}
