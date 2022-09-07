



class Car{
    String name;
    String color;
    int number;

    public  void testing(){
        System.out.println("the car is ok");
    }
    public void coloring(){
        System.out.println(this.color);

    }
    public void numbering(){
        System.out.println(this.number);
    }
}
    
class Consumers{
        String name;
        int id;
        int age;

        //polymerfism

        public void PrintInfo(String name, int age){
            System.out.println(name +" " + age);
        }
        public void PrintInfo (String name){
            System.out.println(name);
        }

        public void PrintInfo(int age){
            System.out.println(age);
        }


       //in method ,we cant put the parameters
        public void checker(){
            System.out.println(this.name);
            System.out.println(this.id);

        }
        //making a constructor with putting parameter
        Consumers(Consumers s2){
           this.name = s2.name;
           this.id = s2.id;

        }
        Consumers(){

            

        }

    }




public class oops{
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.color = "Blue";
        car1.number = 1231;
        car2.color = "red";

        car1.coloring();
        car1.numbering();
        car2.coloring();
        car1.testing();

        //making this object "s1" with the help of class"Consumers" and putting the value

        Consumers s1 = new Consumers();
        s1.name = "fahim";
        s1.id = 1212;
        s1.age = 21;

        Consumers s2 = new Consumers(s1);
        s2.checker();

        s1.PrintInfo(s1.name,s1.age);
        

        


        

        
    }
}