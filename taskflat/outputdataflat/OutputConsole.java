package com.epamjavaweb.task10class.taskflat.outputdataflat;
/*
Найти и вывести:
a) список квартир, имеющих заданное количество комнат;
b) список квартир, имеющих заданное количество комнат и расположенных на этаже, который находится
в заданном промежутке;
c) список квартир, имеющих площадь, превосходящую заданную.
 */

import com.epamjavaweb.task10class.taskflat.dataflathouse.Flat;
import com.epamjavaweb.task10class.taskflat.dataflathouse.House;

import java.util.ArrayList;
import java.util.List;

public class OutputConsole {

    public void printListFlat(House flatList) {
        List<Flat> sampleFlat = new ArrayList<>();
        sampleFlat = flatList.getDataFlat();
        for (int i = 0; i < sampleFlat.size(); i++) {
        System.out.printf("Number of flat = %3d || Number of floor = %3d || Number of rooms = %3d || " +
                "Square of the flat = %3d\n", sampleFlat.get(i).getNumberFlat(), sampleFlat.get(i).getFloorFlat(),
                sampleFlat.get(i).getQuantityRooms(),sampleFlat.get(i).getSquareFlat());
        }
        System.out.println();
    }
}
