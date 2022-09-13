package com.epamjavaweb.task10class.taskflat.main;
/*
Найти и вывести:
a) список квартир, имеющих заданное количество комнат;
b) список квартир, имеющих заданное количество комнат и расположенных на этаже, который находится
в заданном промежутке;
c) список квартир, имеющих площадь, превосходящую заданную.
 */

import com.epamjavaweb.task10class.taskflat.dataflathouse.Flat;
import com.epamjavaweb.task10class.taskflat.dataflathouse.House;
import com.epamjavaweb.task10class.taskflat.outputdataflat.OutputConsole;
import com.epamjavaweb.task10class.taskflat.processdata.FlatProcess;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final int MAX_NUMBER_FLAT = 80;
    public static final int NUMBER_FLAT_FLOOR = 4;

    public static void main(String[] args) {

        List<Flat> listFlat = new ArrayList<>();
        int[][] arrInitFlat = {{100, 4}, {70, 3}, {60, 2}, {50, 1}};//Data for initialization Room and Square
        int j = 0;
        int floor = 1;
        //Initialization and creation of the object Flat
        for (int i = 0; i < MAX_NUMBER_FLAT; i++) {
            listFlat.add(new Flat(i + 1, 100, 1, 4,
                    "Moskovskaya", "Panel", 10));
            listFlat.get(i).setSquareFlat(arrInitFlat[j][0]);
            listFlat.get(i).setQuantityRooms(arrInitFlat[j][1]);
            listFlat.get(i).setFloorFlat(floor);
            j++;
            if (j == NUMBER_FLAT_FLOOR) {
                j = 0;
                floor++;
            }
        }
        FlatProcess flatProcess = new FlatProcess();
        OutputConsole outputConsole = new OutputConsole();
        //Room sample
        House dataFlatRooms = new House();
        dataFlatRooms.setDataFlat(listFlat);
        flatProcess.listFlatQuantityRooms(dataFlatRooms, 3);
        outputConsole.printListFlat(dataFlatRooms);
        //Room and floor sample
        House dataFlatRoomsFloor = new House();
        dataFlatRoomsFloor.setDataFlat(listFlat);
        flatProcess.listFlatQuantityRooms(dataFlatRoomsFloor, 3, 3, 10);
        outputConsole.printListFlat(dataFlatRoomsFloor);
        //Square sample
        House dataFlatSquare = new House();
        dataFlatSquare.setDataFlat(listFlat);
        flatProcess.sampleFlatBySquare(dataFlatSquare, 70);
        outputConsole.printListFlat(dataFlatSquare);
    }
}
