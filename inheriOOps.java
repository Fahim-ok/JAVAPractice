import javax.swing.event.SwingPropertyChangeSupport;

class Spiderman{
    String name;
    int age;
    int point;
}

//It is going to be the single inheritment

class Thanos extends Spiderman{


    public void InfinityStone (){
        System.out.println(this.age + " "+ this.name );
        

    }
    
    
}

//multiple inherit
class IronMan extends Thanos{
    public void NanoTech(){
        System.out.println("And i am " + this.name);
    }
}

//heriarcial inherit
class Thor extends Spiderman{
    public void Hammer(){
        System.out.println("i knew it " + this.name );
    }



}




public class inheriOOps {
    public static void main(String[] args) {

        Thanos c1 = new Thanos();
        IronMan t1 = new IronMan();
        c1.age = 21;
        c1.name = "peterparker";
        c1.InfinityStone();
        t1.name = "Iron-Man";
        t1.NanoTech();
        Thor a1 = new Thor();
        a1.name = "captain-america";
        a1.Hammer();
    }
    
}
