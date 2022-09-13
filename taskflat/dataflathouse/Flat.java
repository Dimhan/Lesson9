package com.epamjavaweb.task10class.taskflat.dataflathouse;
/*
Создайте класс Flat, спецификация которого приведена ниже. Создайте второй класс, агрегирующий объекты типа Flat.
Определите подходящие методы для реализации этих классов. Задайте критерии выбора данных и выведите эти данные
на консоль.

Flat: Номер квартиры, Площадь, Этаж, Количество комнат, Улица,Тип задния, Срок эксплуатации.

Найти и вывести:
a) список квартир, имеющих заданное количество комнат;
b) список квартир, имеющих заданное количество комнат и расположенных на этаже, который находится
в заданном промежутке;
c) список квартир, имеющих площадь, превосходящую заданную.
 */

import java.io.Serializable;
import java.util.Objects;

public class Flat implements Serializable {

    private static final long serialVersionUID = 1L;

    private int numberFlat;
    private int squareFlat;
    private int floorFlat;
    private int quantityRooms;
    private String nameStreet;
    private String typeHouse;
    private int lifeTime;

    public Flat() {
    }

    public Flat(int numberFlat, int squareFlat, int floorFlat, int quantityRooms,
                String nameStreet, String typeHouse, int lifeTime) {
        this.numberFlat = numberFlat;
        this.squareFlat = squareFlat;
        this.floorFlat = floorFlat;
        this.quantityRooms = quantityRooms;
        this.nameStreet = nameStreet;
        this.typeHouse = typeHouse;
        this.lifeTime = lifeTime;
    }

    public int getNumberFlat() {
        return numberFlat;
    }

    public void setNumberFlat(int numberFlat) {
        this.numberFlat = numberFlat;
    }

    public int getSquareFlat() {
        return squareFlat;
    }

    public void setSquareFlat(int squareFlat) {
        this.squareFlat = squareFlat;
    }

    public int getFloorFlat() {
        return floorFlat;
    }

    public void setFloorFlat(int floorFlat) {
        this.floorFlat = floorFlat;
    }

    public int getQuantityRooms() {
        return quantityRooms;
    }

    public void setQuantityRooms(int quantityRooms) {
        this.quantityRooms = quantityRooms;
    }

    public String getNameStreet() {
        return nameStreet;
    }

    public void setNameStreet(String nameStreet) {
        this.nameStreet = nameStreet;
    }

    public String getTypeHouse() {
        return typeHouse;
    }

    public void setTypeHouse(String typeHouse) {
        this.typeHouse = typeHouse;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flat flat = (Flat) o;
        return numberFlat == flat.numberFlat && squareFlat == flat.squareFlat && floorFlat == flat.floorFlat
                && quantityRooms == flat.quantityRooms && lifeTime == flat.lifeTime
                && nameStreet.equals(flat.nameStreet) && typeHouse.equals(flat.typeHouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberFlat, squareFlat, floorFlat, quantityRooms, nameStreet, typeHouse, lifeTime);
    }

    @Override
    public String toString() {
        return "Flat{" +
                "numberFlat=" + numberFlat +
                ", squareFlat=" + squareFlat +
                ", floorFlat=" + floorFlat +
                ", quantityRooms=" + quantityRooms +
                ", nameStreet='" + nameStreet + '\'' +
                ", typeHouse='" + typeHouse + '\'' +
                ", lifeTime=" + lifeTime +
                '}';
    }
}
