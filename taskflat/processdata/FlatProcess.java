package com.epamjavaweb.task10class.taskflat.processdata;
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

public class FlatProcess {

    public static final int MAX_QUANTITY_ROOMS = 4;

    //List of flats with a given number of rooms
    public House listFlatQuantityRooms(House flatList, int quantityRooms) {
        List<Flat> sampleFlat = new ArrayList<>();
        if (quantityRooms > 0 & quantityRooms <= MAX_QUANTITY_ROOMS) {
            for (int i = 0; i < flatList.getDataFlat().size(); i++) {
                if (flatList.getDataFlat().get(i).getQuantityRooms() == quantityRooms) {
                    sampleFlat.add(flatList.getDataFlat().get(i));
                }
            }
            flatList.setDataFlat(sampleFlat);
            return flatList;
        } else {
            throw new RuntimeException("Incorrect data!");
        }
    }

    //List of flats with a given number of rooms and floor
    public House listFlatQuantityRooms(House flatList, int quantityRooms, int rangeFloor1, int rangeFloor2) {
        List<Flat> sampleFlat = new ArrayList<>();
        if (quantityRooms > 0 & quantityRooms <= MAX_QUANTITY_ROOMS & rangeFloor1 < rangeFloor2) {
            for (int i = 0; i < flatList.getDataFlat().size(); i++) {
                if (flatList.getDataFlat().get(i).getQuantityRooms() == quantityRooms
                        & flatList.getDataFlat().get(i).getFloorFlat() >= rangeFloor1
                        & flatList.getDataFlat().get(i).getFloorFlat() <= rangeFloor2) {
                    sampleFlat.add(flatList.getDataFlat().get(i));
                }
            }
            flatList.setDataFlat(sampleFlat);
            return flatList;
        } else {
            throw new RuntimeException("Incorrect data!");
        }
    }

    //List of flats having a square exceeding a given
    public House sampleFlatBySquare(House flatList, int flatSquare) {
        List<Flat> sampleFlat = new ArrayList<>();
        if (flatSquare > 0) {
            for (int i = 0; i < flatList.getDataFlat().size(); i++) {
                if (flatList.getDataFlat().get(i).getSquareFlat() >= flatSquare) {
                    sampleFlat.add(flatList.getDataFlat().get(i));
                }
            }
            flatList.setDataFlat(sampleFlat);
            return flatList;
        } else {
            throw new RuntimeException("Incorrect data!");
        }
    }
}
