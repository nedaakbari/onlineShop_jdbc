package models;

import java.sql.Date;
import java.util.List;

public class Customer {
    private int id;
    private String natioanalCode;
    private String name;
    private String family;
    private String phone;
    private Date registerDate;
    private double balance;
    static final int maximumOrder = 5;
    private int shoppingCount;
    private Address address;
    private List<Order> BuyOrderNumber;

    public Customer() {
    }

    public Customer(String natioanalCode, String name, String family, String phone, Date registerDate) {
        this.natioanalCode = natioanalCode;
        this.name = name;
        this.family = family;
        this.phone = phone;
        this.registerDate = registerDate;
        setShoppingCount(0);
        setBalance(0.0);
    }


    public Customer(int id, String natioanalCode, String name, String family , double balance, int shoppingCount) {
        this.id = id;
        this.natioanalCode = natioanalCode;
        this.name = name;
        this.family = family;
        this.balance = balance;
        this.shoppingCount = shoppingCount;
    }

    public Customer(int id, String natioanalCode, String name, String family, String phone, Date registerDate, double balance, int shoppingCount) {
        this.id = id;
        this.natioanalCode = natioanalCode;
        this.name = name;
        this.family = family;
        this.phone = phone;
        this.registerDate = registerDate;
        this.balance = balance;
        this.shoppingCount = shoppingCount;
    }

    public Customer(int id, String name, String family, double balance, String natioanalCode, int shoppingCount) {
        this.id = id;
        this.natioanalCode = natioanalCode;
        this.name = name;
        this.family = family;
        this.balance = balance;
        this.shoppingCount = shoppingCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNatioanalCode() {
        return natioanalCode;
    }

    public void setNatioanalCode(String natioanalCode) {
        this.natioanalCode = natioanalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getShoppingCount() {
        return shoppingCount;
    }

    public void setShoppingCount(int shoppingCount) {
        this.shoppingCount = shoppingCount;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Order> getBuyOrderNumber() {
        return BuyOrderNumber;
    }

    public void setBuyOrderNumber(List<Order> buyOrderNumber) {
        BuyOrderNumber = buyOrderNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", natioanalCode='" + natioanalCode + '\'' +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", phone='" + phone + '\'' +
                ", registerDate=" + registerDate +
                ", balance=" + balance +
                ", shoppingCount=" + shoppingCount +
                ", address=" + address +
                ", BuyOrderNumber=" + BuyOrderNumber +
                '}';
    }
}
