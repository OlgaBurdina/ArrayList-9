package app;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //создаем объекты класса HeavyBox
        HeavyBox heavyBox1 = new HeavyBox(2, 3,3,5);
        HeavyBox heavyBox2 = new HeavyBox(5, 10, 11, 5);
        HeavyBox heavyBox3 = new HeavyBox(4,5, 6, 7);
        HeavyBox heavyBox4 = new HeavyBox(1,1,1,1);
        HeavyBox heavyBox5 = new HeavyBox(3,4, 2, 1);

        //создаем динамический массив
        ArrayList<HeavyBox> HBox = new ArrayList<>();

        //добавляем объекты класса HeavyBox в динамический массив
        HBox.add(heavyBox1);
        HBox.add(heavyBox2);
        HBox.add(heavyBox3);
        HBox.add(heavyBox4);
        HBox.add(heavyBox5);

        // выводим содержимое массива с помощью forEach
        HBox.forEach(System.out :: println);

        // удаляем последний объект из списка
        /*HBox.remove(HBox.size() - 1);
        HBox.forEach(System.out :: println);*/

        // изменяем вес первой коробки
        /*app.HeavyBox.changeWeight(HBox.get(0));
        HBox.forEach(System.out :: println);*/

        // удаляем все коробки из списка
        /*HBox.clear();
        HBox.forEach(System.out :: println);*/

        // получаем массив из списка(коллекции) и выводим содержимое 3мя способами
        /*HeavyBox.convertToArray(HBox);*/
    }


}