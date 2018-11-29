package com.company;

public class Trio
{
    Sandwich sandwich;
    Salad salad;
    Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink)
    {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }
    public String getname()
    {
        String Nsnd = sandwich.getName();
        String Nsld = salad.getName();
        String Ndk = drink.getName();
        return
    }
    public double getPrice()
    {
        double Psd = sandwich.getPrice();
        double Psld = salad.getPrice();
        double Pdk = drink.getPrice();
        return
    }
}
