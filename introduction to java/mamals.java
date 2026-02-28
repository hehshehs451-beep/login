public class mamals {
      void mam(){
        System.out.println("Inside mammals class");
    }
}

public class Lion extends mamals{
    void roar(){
        System.out.println("Inside Lion class");
    }
}

public class human extends mamals {
    void hum(){
        System.out.println("inside human");
    }
}

class Main{
    public static void main(String rgs[]){
        Lion obj=new Lion();
        obj.hum();
        obj.roar();
        obj.mam();
        
    }
}