package com.javarush.test.level06.lesson05.task03;

/* 10 000 объектов Cat и Dog
Создать в цикле 10 000 объектов Cat и Dog. (Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
*/

public class Solution
{
    public static boolean stop = false;
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        while(!stop){
            Cat cat = new Cat();
            Dog dog = new Dog();
        }
    }

}
class Cat
{
    @Override
    protected void finalize() throws Throwable
    {

        super.finalize();
        System.out.println("Cat destroyed");
        Solution.stop = true;
    }
}

class Dog
{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("Dog destroyed");
        Solution.stop = true;
    }
}