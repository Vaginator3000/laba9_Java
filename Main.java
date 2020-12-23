import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class Veh
{
   	private String brand;
   	private int year;
  	private int cost;
	private AutoAge aAge;

	public void init() {
        	brand = " ";
        	year = 0;
        	cost = 0;
   	}

	public void init(String _brand, int year, int _cost) {
       	 	brand = _brand;
        	this.year = year;
        	cost = _cost;
   	}

	public void read() {
		try {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        	brand = reader.readLine();
        	year = Integer.parseInt(reader.readLine());
        	cost = Integer.parseInt(reader.readLine());
		} catch(Exception e) {
       			e.printStackTrace();
      		}
    	}

	public void display() {
		System.out.println(brand);
		System.out.println(year);
		System.out.println(cost);
    	}

	public int getYear() {
		return year;
    	}

	public int ageOfCar() {
		return aAge.ageOfCar();
	}

}

class Autosale {
	private Veh veh = new Veh();
	private int count;


    	public void init() {
        	veh.init();
	        count = 0;
    	}


    	public void init(Veh _veh, int _count) {
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


class AutoAge {
	int ageOfCar(Veh car) {
		return 2020 - car.getYear();
	}
}


public class Main {
	public static void main(String[] args) {
    		Veh car = new Veh();
    		Autosale sale[] = new Autosale[4];
		for (int i = 0; i < sale.length; i++){
			sale[i] = new Autosale();
			car.init("car" + String.valueOf(i), i*1000, i*10000 + i);
			sale[i].init(car, i*10);
		}

    		//car.init("Ford", "F-150", "2013", "400", "3000", "black", "3000000");

		try {
    		sale.init();
    		sale.read();
    		sale.display();
		} catch(Exception e) {
       			e.printStackTrace();
      		}
	}
}
