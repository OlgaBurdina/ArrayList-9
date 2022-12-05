package app;

import java.util.Objects;

public class Box {
    private int depth;
    private int length;
    private int width;

    // конструктор Box
    public Box (int depth, int length, int width) {
        this.depth = depth;
        this.length = length;
        this.width = width;
    }

    // получаем доступ к полям private
    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // метод для вывода в строку информации об объекте Box
    public String toString() {
        return  " ширина - " + width + "," +
                " глубина - " + depth + "," +
                " длина - " + length;
    }

}
