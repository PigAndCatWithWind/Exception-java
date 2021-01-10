package error;
//RuntiomeException
public class RuntiomeException {
    public static void main(String[] args) {
        //ArithmeticException
        int a = 0,b=1;
        if(a!=0){
            System.out.println(b/a);
        }

        ////ArithmeticException
        String s = null;
        if (s!=null)
            System.out.println(s.length());


        //ClassCastException
        Animal animal = new Dog();
        if (animal instanceof Cat){
            Cat cat = (Cat)animal;
        }



    }
}


class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}