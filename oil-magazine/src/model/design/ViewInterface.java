package model.design;

import model.client.Client;
import model.market.Products;

import java.util.Scanner;

public interface ViewInterface {
    String getString(Scanner scanner);

    void finalResults(int totalSum, int i);

    void finishStop();

    void border2();

    void showMoodInProcents(int happy, int sad, float f4, float f5);

    void showMonthInProcents(int std, int com, int vip, float f1, float f2, float f3);

    void showTotalClients(int totalNrOfClients);

    void munthRResults(int monthSum, int i);

    void border();

    void clientMood(int nrOfProducts, int a);

    void priceShow(Products product);

    void reqireText();

    void clientSetup(int j, Client client);

    void dayCount(int i);
}
