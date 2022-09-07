import javax.naming.ldap.ManageReferralControl;
import javax.xml.transform.Source;

public class recurse {
    public static void TowerOfMidguard(int n,String src,String helper,String dest){
      //best case
      if(n==1){
          System.out.println("stone goes to" +1 + "from"+src + "to" + "dest");
          return;
      }
      //worst case
      TowerOfMidguard(n-1, src, dest, helper);
      System.out.println("stone goes to"+1 +"from"+src + "to" + "dest");
      TowerOfMidguard(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n =2;
        TowerOfMidguard(n,"S","H","D");
    }
    
}
