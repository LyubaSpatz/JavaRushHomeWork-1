package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius  width, color
*/

public class Circle
{
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private int color;

    //Напишите тут ваш код
    public Circle(int centerX, int centerY, int radius) {
    }

    public Circle(int centerX, int centerY, int radius, int width) {
    }

    public Circle(int centerX, int centerY, int radius, int width, int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
