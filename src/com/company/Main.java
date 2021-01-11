package com.company;

public class Main {

    public static void main(String[] args) {
        Parcel paczka = new ParcelA(11,"CCC-11111");
        Parcel paczka2 = new ParcelB(22,"CCC-22222");
        ParcelLocker paczkomat = new ParcelLocker();

        paczkomat.addParcel(paczka);
        paczkomat.addParcel(paczka2);
//        paczkomat.addParcel(paczka2);
//        paczkomat.deleteById("CCC-22222");
        paczkomat.listParcels();






    }
}
