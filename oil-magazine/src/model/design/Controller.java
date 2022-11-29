package model.design;

import model.client.Client;
import model.client.CompanyClient;
import model.client.StandardClient;
import model.client.VipClient;
import model.market.Cosmetics;
import model.market.EssentialOil;
import model.market.Products;
import model.market.Tea;

import java.util.*;

public class Controller implements ControllerInterface{
    ModelInterface model = new Model();
    ViewInterface view = new View();
    @Override
    public void display(){
        Cosmetics cosmetics1 = model.getCosmetics1();
        Cosmetics cosmetics2 = model.getCosmetics2();
        Cosmetics cosmetics3 = model.getCosmetics3();
        Tea tea1 = model.getTea1();
        Tea tea2 = model.getTea2();
        Tea tea3 = model.getTea3();
        EssentialOil essentialOil1 = model.getEssentialOil1();
        EssentialOil essentialOil2 = model.getEssentialOil2();
        EssentialOil essentialOil3 = model.getEssentialOil3();
        Client standardClient = model.getStandardClient();
        Client companyClient = model.getCompanyClient();
        Client vipClient = model.getVipClient();
        Map<Integer, Client> clients = model.getIntegerClientMap(standardClient, companyClient, vipClient);
        List<Integer> probability = model.getProbability();
        Random random = model.getRandom();
        Scanner scanner = model.getScanner();
        int totalSum = 0;
        int monthSum = 0;
        int daySum, clientSum;
        int nrOfClients;
        int nrOfProducts, end = 3, happy = 0, sad = 0;
        int std = 0, com = 0, vip = 0;
        Map<Integer, Integer> integerIntegerMap = model.getMap();
        String stop;
        List<Products> products = model.getProducts(cosmetics1, cosmetics2, cosmetics3, tea1, tea2, tea3, essentialOil1, essentialOil2, essentialOil3);
        boolean b = true;
        for (int i = 1; b; i++) {
            daySum = 0;
            view.dayCount(i); //view
            nrOfClients = model.getNrOfClients(random);
            for (int j = 1; j <= nrOfClients; j++) {
                Client client = model.getClient(clients, probability, random);

                if (model.isStandard(client)) {
                    model.money1(random, client);
                    std = model.getStd(std);
                } else if (model.isCompany(client)) {
                    model.money2(random, client);
                    model.freeProduct((CompanyClient) client);
                    com = model.getCom(com);
                } else if (model.isVIp(client)) {
                    model.money3(random, client);
                    model.discount(random, (VipClient) client);
                    vip = model.getVip(vip);
                }

                view.clientSetup(j, client); //view
                
                nrOfProducts = model.getNrOfProducts(random, end);
                clientSum = 0;
                view.reqireText(); //view
                int a = 0;
                for (int k = 1; k <= nrOfProducts; k++) {
                    Products product = model.getProducts(random, products);
                    view.priceShow(product);//view
                    if (model.moneyCheck(client, product)) {
                        if (model.isCompany(client)) {
                            assert client instanceof CompanyClient;
                            if (model.firstroduct((CompanyClient) client, k)) {
                                model.setHappy(client);
                            } else {
                                clientSum = model.getClientSum(clientSum, product);
                                model.clientMoney(client, product);
                                model.make2(client);
                            }
                        }
                        if (model.isVIp(client)) {
                            assert client instanceof VipClient;
                            clientSum = model.getClientSum(clientSum, (VipClient) client, product);
                            model.setClientSum(client, product);
                            model.make1(client);
                        }
                        clientSum = model.getSum(clientSum, product);
                        model.money6(client, product);
                        model.make3(client);
                        a = model.getAnInt(a);
                    }
                }

                view.clientMood(nrOfProducts, a); //view

                if (model.productsEquals(nrOfProducts, a)) {
                    happy = model.getHappy(happy);
                } else {
                    sad = model.getSad(sad);
                }

                daySum = model.getSum(daySum, clientSum);
                System.out.println();
            }
            monthSum = model.getMonthSum(monthSum, daySum);
            view.border();//view
            if (i % 30 == 0) {
                view.munthRResults(monthSum, i);//view
                int totalNrOfClients = model.getTotalNrOfClients(happy, sad);
                view.showTotalClients(totalNrOfClients);//view
                float f1 = model.getF1((float) std, totalNrOfClients);
                float f2 = model.getF2((float) com, totalNrOfClients);
                float f3 = model.getF3((float) vip, totalNrOfClients);
                float f4 = model.getF4((float) happy, totalNrOfClients);
                float f5 = model.getF5((float) sad, totalNrOfClients);
                view.showMonthInProcents(std, com, vip, f1, f2, f3);//view
                List<Integer> integers = model.getIntegerList(std, com, vip);
                model.refount(std, com, vip, integerIntegerMap);
                Integer max = model.getMax(integers);
                Integer min = model.getMin(integers);
                Integer integer1 = model.getInteger1(integerIntegerMap, max);
                Integer integer2 = model.getInteger2(integerIntegerMap, min);
                model.probRemove(probability, integer1);
                model.probAdd(probability, integer2);
                view.showMoodInProcents(happy, sad, f4, f5);
                if (model.checkHappy(happy, sad)) {
                    end = model.getEnd(end);
                } else {
                    end = model.getEnd1(end);
                }
                totalSum = model.getTotalSum(totalSum, monthSum);
                monthSum = 0;
                happy = 0;
                sad = 0;
                std = 0;
                com = 0;
                vip = 0;
                view.border2();//view

                //Stop & Final Function
                view.finishStop();//view
                stop = view.getString(scanner); //view
                if (model.isEquals(stop)) {
                    view.finalResults(totalSum, i);//view
                    b = false;
                }
            }
        }
    }


}
