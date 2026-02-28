public class animal {
    void eat(){
        System.out.println("eating...Animal class..eat method");
    }
}

public class lion extends Animal{
    void roar(){
        System.out.println("roar...Lion class..roar method");
    }
}

public class BabyLion extends Lion {
    void weep(){
        System.out.println("weep...BabyLion class..weep method");
    }
}

class Main{
    public static void main(String rgs[]){
        BabyLion obj=new BabyLion();
        obj.weep();
        obj.roar();
        obj.eat();
    }
}