package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //Напишите тут ваш код
    public void initialize(int centerX, int centerY, int radius) {
        initialize(centerX, centerY, radius, 0, 0);
    }

    public void initialize(int centerX, int centerY, int radius, int width) {
        initialize(centerX, centerY, radius, width, 0);
    }

    public void initialize(int centerX, int centerY, int radius, int width, int color) {
//        initialize(centerX, centerY, radius, width, color);
    }

}
