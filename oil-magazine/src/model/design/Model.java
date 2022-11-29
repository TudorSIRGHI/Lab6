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

public class Model implements ModelInterface{
    @Override
    public int getTotalSum(int totalSum, int monthSum) {
        totalSum += monthSum;
        return totalSum;
    }
    @Override
    public int getEnd1(int end) {
        end -= 1;
        return end;
    }
    @Override
    public int getEnd(int end) {
        end += 1;
        return end;
    }
    @Override
    public boolean checkHappy(int happy, int sad) {
        return happy > sad;
    }
    @Override
    public void probAdd(List<Integer> probability, Integer integer2) {
        switch (integer2) {
            case 1 -> probability.add(1);
            case 2 -> probability.add(2);
            case 3 -> probability.add(3);
        }
    }
    @Override
    public void probRemove(List<Integer> probability, Integer integer1) {
        switch (integer1) {
            case 1 -> probability.remove(1);
            case 2 -> probability.remove(2);
            case 3 -> probability.remove(3);
        }
    }
    @Override
    public Integer getInteger2(Map<Integer, Integer> integerIntegerMap, Integer min) {
        return integerIntegerMap.get(min);
    }
    @Override
    public Integer getInteger1(Map<Integer, Integer> integerIntegerMap, Integer max) {
        return integerIntegerMap.get(max);
    }
    @Override
    public Integer getMin(List<Integer> integers) {
        return integers.stream().min(Integer::compareTo).orElseThrow();
    }
    @Override
    public Integer getMax(List<Integer> integers) {
        return integers.stream().max(Integer::compareTo).orElseThrow();
    }
    @Override
    public void refount(int std, int com, int vip, Map<Integer, Integer> integerIntegerMap) {
        integerIntegerMap.put(std, 1);
        integerIntegerMap.put(com, 2);
        integerIntegerMap.put(vip, 3);
    }
    @Override
    public List<Integer> getIntegerList(int std, int com, int vip) {
        return new ArrayList<>(List.of(std, com, vip));
    }
    @Override
    public float getF5(float sad, int totalNrOfClients) {
        return sad / totalNrOfClients *100;
    }
    @Override
    public float getF4(float happy, int totalNrOfClients) {
        return happy / totalNrOfClients *100;
    }
    @Override
    public float getF3(float vip, int totalNrOfClients) {
        return vip / totalNrOfClients *100;
    }
    @Override
    public float getF2(float com, int totalNrOfClients) {
        return com / totalNrOfClients *100;
    }
    @Override
    public float getF1(float std, int totalNrOfClients) {
        return std / totalNrOfClients *100;
    }
    @Override
    public int getTotalNrOfClients(int happy, int sad) {
        return happy + sad;
    }
    @Override
    public int getMonthSum(int monthSum, int daySum) {
        monthSum += daySum;
        return monthSum;
    }
    @Override
    public int getSum(int daySum, int clientSum) {
        daySum += clientSum;
        return daySum;
    }
    @Override
    public int getSad(int sad) {
        sad += 1;
        return sad;
    }
    @Override
    public int getHappy(int happy) {
        happy += 1;
        return happy;
    }
    @Override
    public boolean productsEquals(int nrOfProducts, int a) {
        return a == nrOfProducts;
    }
    @Override
    public int getAnInt(int a) {
        a += 1;
        return a;
    }
    @Override
    public void make3(Client client) {
        client.setHappy(true);
    }
    @Override
    public void money6(Client client, Products product) {
        client.setMoney(client.getMoney() - product.getPrice());
    }
    @Override
    public int getSum(int clientSum, Products product) {
        clientSum += product.getPrice();
        return clientSum;
    }
    @Override
    public void make2(Client client) {
        client.setHappy(true);
    }
    @Override
    public void make1(Client client) {
        client.setHappy(true);
    }
    @Override
    public void setClientSum(Client client, Products product) {
        client.setMoney(client.getMoney() - product.getPrice());
    }
    @Override
    public int getClientSum(int clientSum, VipClient client, Products product) {
        clientSum += product.getPrice() - (product.getPrice() * (1 / client.getDiscount()));
        return clientSum;
    }
    @Override
    public void clientMoney(Client client, Products product) {
        client.setMoney(client.getMoney() - product.getPrice());
    }
    @Override
    public int getClientSum(int clientSum, Products product) {
        clientSum += product.getPrice();
        return clientSum;
    }
    @Override
    public void setHappy(Client client) {
        client.setHappy(true);
    }
    @Override
    public boolean firstroduct(CompanyClient client, int k) {
        return (client.isFirstFreeProduct()) && (k == 1);
    }
    @Override
    public boolean moneyCheck(Client client, Products product) {
        return client.getMoney() >= product.getPrice();
    }
    @Override
    public Products getProducts(Random random, List<Products> products) {
        return products.get(random.nextInt(products.size()));
    }
    @Override
    public int getNrOfProducts(Random random, int end) {
        int nrOfProducts;
        nrOfProducts = random.nextInt(1, end);
        return nrOfProducts;
    }
    @Override
    public int getVip(int vip) {
        vip += 1;
        return vip;
    }
    @Override
    public void discount(Random random, VipClient client) {
        client.setDiscount(random.nextInt(5, 10));
    }
    @Override
    public void money3(Random random, Client client) {
        client.setMoney(random.nextInt(150, 200));
    }
    @Override
    public boolean isVIp(Client client) {
        return client.getClass().equals(VipClient.class);
    }
    @Override
    public int getCom(int com) {
        com += 1;
        return com;
    }
    @Override
    public void freeProduct(CompanyClient client) {
        client.setFirstFreeProduct(true);
    }
    @Override
    public void money2(Random random, Client client) {
        client.setMoney(random.nextInt(120, 150));
    }
    @Override
    public boolean isCompany(Client client) {
        return client.getClass().equals(CompanyClient.class);
    }
    @Override
    public int getStd(int std) {
        std += 1;
        return std;
    }
    @Override
    public void money1(Random random, Client client) {
        client.setMoney(random.nextInt(100, 120));
    }
    @Override
    public boolean isStandard(Client client) {
        return client.getClass().equals(StandardClient.class);
    }
    @Override
    public Client getClient(Map<Integer, Client> clients, List<Integer> probability, Random random) {
        return clients.get(probability.get(random.nextInt(probability.size())));
    }
    @Override
    public int getNrOfClients(Random random) {
        int nrOfClients;
        nrOfClients = random.nextInt(4, 8);
        return nrOfClients;
    }
    @Override
    public List<Products> getProducts(Cosmetics cosmetics1, Cosmetics cosmetics2, Cosmetics cosmetics3, Tea tea1, Tea tea2, Tea tea3, EssentialOil essentialOil1, EssentialOil essentialOil2, EssentialOil essentialOil3) {
        return new ArrayList<>(List.of(cosmetics1, cosmetics2, cosmetics3, tea1, tea2, tea3, essentialOil1, essentialOil3, essentialOil2));
    }
    @Override
    public Map<Integer, Integer> getMap() {
        return new HashMap<>();
    }
    @Override
    public Scanner getScanner() {
        return new Scanner(System.in);
    }
    @Override
    public Random getRandom() {
        return new Random();
    }
    @Override
    public List<Integer> getProbability() {
        return new ArrayList<>(List.of(1, 2, 1, 3, 1));
    }
    @Override
    public Map<Integer, Client> getIntegerClientMap(Client standardClient, Client companyClient, Client vipClient) {
        Map<Integer, Client> clients = new HashMap<>();
        clients.put(1, standardClient);
        clients.put(2, companyClient);
        clients.put(3, vipClient);
        return clients;
    }
    @Override
    public Client getVipClient() {
        return new VipClient(0, false, 0);
    }
    @Override
    public Client getCompanyClient() {
        return new CompanyClient(0, false, false);
    }
    @Override
    public Client getStandardClient() {
        return new StandardClient(0, false);
    }
    @Override
    public EssentialOil getEssentialOil3() {
        return new EssentialOil("Lemon Oil", 64, 10, "Lemon");
    }
    @Override
    public EssentialOil getEssentialOil2() {
        return new EssentialOil("Aloe Vera", 71, 20, "Aloe Vera");
    }
    @Override
    public EssentialOil getEssentialOil1() {
        return new EssentialOil("Aroma Difusor", 53, 100, "Lavanda");
    }
    @Override
    public Tea getTea3() {
        return new Tea("Cherry Tea", 37, 50, "Cerasorum stipites");
    }
    @Override
    public Tea getTea2() {
        return new Tea("Detox", 57, 100, "Zingiber officinale");
    }
    @Override
    public Tea getTea1() {
        return new Tea("Tea For Cholesterol", 32, 50, "Equisetum arvense, Taraxacum officinale, Urtica dioica");
    }
    @Override
    public Cosmetics getCosmetics3() {
        return new Cosmetics("Bath Salt", 42, 50, "Orange");
    }
    @Override
    public Cosmetics getCosmetics2() {
        return new Cosmetics("Cream with Vitamin C", 45, 50, "Nuts");
    }
    @Override
    public Cosmetics getCosmetics1() {
        return new Cosmetics("Cacao Oil", 60, 72, "Cacao");
    }
    @Override
    public boolean isEquals(String stop) {
        return stop.equals("0");
    }
}
