package com.company;

import java.util.ArrayList;
import java.util.List;

public class ParcelLocker {
    List<Parcel> parcelList = new ArrayList<>();
    private int lockerCapacity = 2;

    public void addParcel(Parcel parcel) {
        if (lockerCapacity == parcelList.size()) {
            throw new IndexOutOfBoundsException("Nie ma miejsca w paczkomacie");
        }
      parcelList.add(parcel);
    }

    public void listParcels() {
        for (int i =0; i < parcelList.size(); i++) {
            System.out.println("Paczka: " + parcelList.get(i).getCode());
            System.out.println("Waga paczki: " + parcelList.get(i).getWeight());
        }
    }

    public void deleteParcels() {
       parcelList.clear();
    }

    public void deleteById(String code) {
        parcelList.removeIf( (Parcel parcel) -> parcel.getCode().equals(code));
    }
}
