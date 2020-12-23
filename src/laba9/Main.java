package laba9;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class Auto
{
    private String brand;
    private int power;
    private int cost;

    public Auto() {
        brand = "";
        power = 0;
        cost = 0;
    }

    public Auto(String brand) {
    this.brand = brand;
    power = 0;
    cost = 0;
    }

    public Auto(String brand, int power, int cost) {
        this.brand = brand;
        this.cost = cost;
        this.power = power;
    }

    public void read() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            brand = reader.readLine();
            power = Integer.parseInt(reader.readLine());
            cost = Integer.parseInt(reader.readLine());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void display() {
        System.out.println(brand);
        System.out.println(power);
        System.out.println(cost);
    }

    public int getYear() {
        return power;
    }

}

class Autosale {
    private Auto veh;
    private int count;


    public void init() {
        veh = new Auto();
        count = 0;
    }


    public void init(Auto _veh, int _count) {
        veh = _veh;
        count = _count;
    }

    public void read() {
        veh.read();

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            count = Integer.parseInt(reader.readLine());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void display() {
        veh.display();
        System.out.println(count);
    }
}


public class Main {
    public static void main(String[] args) {
        Auto car1 = new Auto("Ford", 400, 300000);
        Auto car2 = new Auto("Mazda");
        Auto car3 = new Auto();
        car1.display();
        car2.display();
        car3.display();

        Auto[] cars = new Auto[3];
        for (int i = 0; i < 3; i++)
            cars[i] = new Auto("Car" + String.valueOf(i + 1));

        for (int i = 0; i < 3; i++)
            cars[i].display();

        //car.init("Ford", "F-150", "2013", "400", "3000", "black", "3000000");

      //  try {
      //      sale.init();
     //       sale.read();
     //       sale.display();
     //   } catch(Exception e) {
     //       e.printStackTrace();
     //   }
    }
}

