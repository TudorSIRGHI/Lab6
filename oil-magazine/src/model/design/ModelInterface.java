package model.design;

import model.client.Client;
import model.client.CompanyClient;
import model.client.VipClient;
import model.market.Cosmetics;
import model.market.EssentialOil;
import model.market.Products;
import model.market.Tea;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public interface ModelInterface {
    int getTotalSum(int totalSum, int monthSum);

    int getEnd1(int end);

    int getEnd(int end);

    boolean checkHappy(int happy, int sad);

    void probAdd(List<Integer> probability, Integer integer2);

    void probRemove(List<Integer> probability, Integer integer1);

    Integer getInteger2(Map<Integer, Integer> integerIntegerMap, Integer min);

    Integer getInteger1(Map<Integer, Integer> integerIntegerMap, Integer max);

    Integer getMin(List<Integer> integers);

    Integer getMax(List<Integer> integers);

    void refount(int std, int com, int vip, Map<Integer, Integer> integerIntegerMap);

    List<Integer> getIntegerList(int std, int com, int vip);

    float getF5(float sad, int totalNrOfClients);

    float getF4(float happy, int totalNrOfClients);

    float getF3(float vip, int totalNrOfClients);

    float getF2(float com, int totalNrOfClients);

    float getF1(float std, int totalNrOfClients);

    int getTotalNrOfClients(int happy, int sad);

    int getMonthSum(int monthSum, int daySum);

    int getSum(int daySum, int clientSum);

    int getSad(int sad);

    int getHappy(int happy);

    boolean productsEquals(int nrOfProducts, int a);

    int getAnInt(int a);

    void make3(Client client);

    void money6(Client client, Products product);

    int getSum(int clientSum, Products product);

    void make2(Client client);

    void make1(Client client);

    void setClientSum(Client client, Products product);

    int getClientSum(int clientSum, VipClient client, Products product);

    void clientMoney(Client client, Products product);

    int getClientSum(int clientSum, Products product);

    void setHappy(Client client);

    boolean firstroduct(CompanyClient client, int k);

    boolean moneyCheck(Client client, Products product);

    Products getProducts(Random random, List<Products> products);

    int getNrOfProducts(Random random, int end);


    int getVip(int vip);

    void discount(Random random, VipClient client);

    void money3(Random random, Client client);

    boolean isVIp(Client client);

    int getCom(int com);

    void freeProduct(CompanyClient client);

    void money2(Random random, Client client);

    boolean isCompany(Client client);

    int getStd(int std);

    void money1(Random random, Client client);

    boolean isStandard(Client client);

    Client getClient(Map<Integer, Client> clients, List<Integer> probability, Random random);

    int getNrOfClients(Random random);

    List<Products> getProducts(Cosmetics cosmetics1, Cosmetics cosmetics2, Cosmetics cosmetics3, Tea tea1, Tea tea2, Tea tea3, EssentialOil essentialOil1, EssentialOil essentialOil2, EssentialOil essentialOil3);

    Map<Integer, Integer> getMap();

    Scanner getScanner();

    Random getRandom();

    List<Integer> getProbability();

    Map<Integer, Client> getIntegerClientMap(Client standardClient, Client companyClient, Client vipClient);

    Client getVipClient();

    Client getCompanyClient();

    Client getStandardClient();

    EssentialOil getEssentialOil3();

    EssentialOil getEssentialOil2();

    EssentialOil getEssentialOil1();

    Tea getTea3();

    Tea getTea2();

    Tea getTea1();

    Cosmetics getCosmetics3();

    Cosmetics getCosmetics2();

    Cosmetics getCosmetics1();

    boolean isEquals(String stop);
}
