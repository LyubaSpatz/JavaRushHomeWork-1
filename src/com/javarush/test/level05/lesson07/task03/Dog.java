package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //Напишите тут ваш код
    public void initialize(String name) {
        initialize(name,0);
    }
    public void initialize(String name, int age) {
        initialize(name, age, 0x0);
    }
    public void initialize(String name, int age, int sex) {
        //Do nothing
    }
}
