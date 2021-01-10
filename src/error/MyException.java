package error;

public class MyException {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(-10);
    }
}

class Person{
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age<0)
            throw new IllegalAgeException("Age cannot be negative");
        this.age = age;
    }
}

class IllegalAgeException extends RuntimeException{
    public IllegalAgeException(){}

    public IllegalAgeException(String msg){
        super(msg);
    }
}


