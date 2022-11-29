package model.design;

import model.client.Client;
import model.client.CompanyClient;
import model.client.StandardClient;
import model.client.VipClient;
import model.market.Products;

import java.util.Scanner;

public class View implements ViewInterface{
    @Override
    public String getString(Scanner scanner) {
        String stop;
        stop = scanner.next();
        return stop;
    }
    @Override
    public void finalResults(int totalSum, int i) {
        System.out.println("####################################################################");
        System.out.println("The total income: " + totalSum);
        System.out.println("The medium income: " + totalSum / (i / 30));
        System.out.println("####################################################################");
    }
    @Override
    public void finishStop() {
        System.out.print("Tap \"0\" to finish: ");
    }
    @Override
    public void border2() {
        System.out.println("******************************");
    }
    @Override
    public void showMoodInProcents(int happy, int sad, float f4, float f5) {
        System.out.println("Happy: " + happy + " with percentage of " + f4 + " %");
        System.out.println("Sad: " + sad + " with percentage of " + f5 + " %");
    }
    @Override
    public void showMonthInProcents(int std, int com, int vip, float f1, float f2, float f3) {
        System.out.println("Standard " + std + " with percentage of " + f1 + " %");
        System.out.println("Company: " + com + " with percentage of " + f2 + " %");
        System.out.println("Vip: " + vip + " with percentage of " + f3 + " %");
    }
    @Override
    public void showTotalClients(int totalNrOfClients) {
        System.out.println("Total number of Clients: " + totalNrOfClients);
    }
    @Override
    public void munthRResults(int monthSum, int i) {
        System.out.println("******************************");
        System.out.println(i / 30 + ". Month");
        System.out.println("The month income: " + monthSum);
        System.out.println("The month medium income: " + monthSum / 30);
    }
    @Override
    public void border() {
        System.out.println("+++++++++++++++");
    }
    @Override
    public void clientMood(int nrOfProducts, int a) {
        if (a == nrOfProducts) {
            System.out.println("Client is happy");
        } else {
            System.out.println("Client is sad");
        }
    }
    @Override
    public void priceShow(Products product) {
        System.out.println("    " + product.getName() + " with price " + product.getPrice());
    }
    @Override
    public void reqireText() {
        System.out.println("   Require: ");
    }
    @Override
    public void clientSetup(int j, Client client) {
        if (client.getClass().equals(StandardClient.class)) {
            System.out.println(j + " Standard Client with " + client.getMoney() + " money");
        } else if (client.getClass().equals(CompanyClient.class)) {
            System.out.println(j + " Company Client with " + client.getMoney() + " money");
        } else if (client.getClass().equals(VipClient.class)) {
            System.out.println(j + " Vip Client with " + client.getMoney() + " money");
        }
    }
    @Override
    public void dayCount(int i) {
        System.out.println("Day " + i);
    }
}
