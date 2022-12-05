package app;

import java.util.ArrayList;
import java.util.Arrays;

public class HeavyBox extends Box {
    private int weight;

    public HeavyBox(int depth, int length, int width, int weight) {
        super(depth, length, width);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // переопределяем метод toString
    @Override
    public String toString() {
        return "Тяжелая коробка: " +
                "вес - " + weight + ","
                + super.toString();
    }

    //создаем динамический массив HBox
    ArrayList<HeavyBox> HBox = new ArrayList<>();

    // метод для изменения веса на 1 у объекта HeavyBox
    public static void changeWeight(HeavyBox box) {
        box.setWeight(box.getWeight() + 1);
    }

    // преобразование списка в массив 3мя способами и вывод содержимого на экран
    public static void convertToArray(ArrayList<HeavyBox> HBox) {
        Object[] objects = HBox.toArray();
        System.out.println(Arrays.toString(objects));

        HeavyBox[] Hbox1 = new HeavyBox[HBox.size()];
        HBox.toArray(Hbox1);
        System.out.println(Arrays.toString(Hbox1));

        HeavyBox[] Hbox2 = HBox.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(Hbox2));
    }
}
