package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
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
