public class Inherit {
    class Vehicle{
        String brand;
        String color;
        void start(){
            System.out.println("Vehicle is Starting");
        }
    }
    class Car extends Vehicle{
      double price;
        void drive(){
        System.out.println("Car is driving");
      }
         Car(String brand, String color,double price){
            this.brand=brand;
            this.color=color;
            this.price=price;
        }
      void carinfo(){
        System.out.println("Car Brand: "+ brand);
        System.out.println("Car Color: "+ color);
        System.out.println("Car Price: "+ price);
      }
    } 
    public static void main(String[] args) {
      Inherit obj=new Inherit();

        Car c1=obj.new Car("TATA","White",800000);
        Car c2=obj.new Car("SUZUKI","Black",650000);
        c1.start();
        c1.drive();
        System.out.println(" \n \n Print Car Information \n\n");
        c1.carinfo();
    
       System.out.println(" \n \n Print Car Information \n\n");
        c2.carinfo();
    }
}

