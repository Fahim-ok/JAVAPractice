package Money;
class Account{
    //modifiers
    public String name;
    protected String email;
    private int age;

    //getter and setters

//getters
    public int getAge(){
        return this.age;
    }
//setters
public void setAge(int age){
    this.age = age;

}

}
public class money {

    public static void main(String[] args) {
        Money.Account a1 = new Money.Account();
        a1.name = "fahim-ul-islam";
        a1.email = "fahimislambd2000@gmail.com";
        a1.setAge(23);
        System.out.println(a1.getAge());
        


        
    }
    
}
