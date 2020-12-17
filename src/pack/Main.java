package pack;

import mypack.Private;
import mypack.Protected;
import mypack.Public;

public class Main extends Protected {
    public static void main(String[] args) {
        Private obj= new Private();
        System.out.println(" obj.data Compile Time Error");
        Protected obj1=new Protected();
        System.out.println("obj.data Comperline");
        Public obj2 =new Public();
        obj2.msg();
    }
}
