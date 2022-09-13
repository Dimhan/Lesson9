package com.epamjavaweb.task10class.taskflat.dataflathouse;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class House implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Flat> dataFlat;

    public House() {
    }

    public List<Flat> getDataFlat() {
        return dataFlat;
    }

    public void setDataFlat(List<Flat> dataFlat) {
        this.dataFlat = dataFlat;
    }

    public void addFlat(Flat flat) {
        dataFlat.add(flat);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return dataFlat.equals(house.dataFlat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataFlat);
    }

    @Override
    public String toString() {
        return "House{" +
                "dataFlat=" + dataFlat +
                '}';
    }
}
