package controllers;

import models.Car;

public class CarController {


  public void sortByName(Car[] cars){
    for (int i = 0; i < cars.length; i++) {
      boolean swap=false;
      for(int j=0;j<cars.length-1-i;j++){
        if(cars[j].getName().compareTo(cars[i].getName())>0){
          Car aux=cars[j];
          cars[j]=cars[j+1];
          cars[j+1]=aux;
          swap=true;
        }
        if(!swap){
          break;
        }
      }
      
    }



  }
}
