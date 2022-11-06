package ru.gb.jseminar;

// Пусть дан произвольный список целых чисел

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Homework{
    public static void main(String[] args) {
        //Создаём ArrayList 
        List<Integer> myList = new ArrayList<Integer>();
        //заполняем myList 
        myList.add(3);
        myList.add(4);
        
        System.out.println("List" + myList);
        //Получаем максимальное значение из списка
        System.out.println("Max value equal: " + getMax(myList));
        //Получаем минимальное значение из списка
        System.out.println("Min value equal: " + getMin(myList));
        //Получаем среднее арифметическое
        System.out.println("Avarage value equal: " + getAverage(myList));
        //Удаляем чётные числа
        System.out.println("Remove odd values: " + removeNegativeValue(myList));
    }
    
    //Нужно удалить из него четные числа
    public static  List<Integer> removeNegativeValue(List<Integer> list){
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            if (iter.next() % 2 == 0) iter.remove();
        } 
        return list;
    }

    // Найти минимальное значение
    public static  Integer getMin(List<Integer> list){
        int minValue = Collections.min(list);
        return minValue;
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list){
        int maxValue = Collections.max(list);
        return maxValue;
    }

    // Найти среднее значение
    public static double getAverage(List<Integer> list){
        int listAvarage = 0;
        for (int i = 0; i < list.size(); i++){
            listAvarage += list.get(i);
        }
        return ((double)listAvarage/(double)list.size());
    }
}