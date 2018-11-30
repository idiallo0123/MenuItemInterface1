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
    public String getName()
    {
        String Nsnd = sandwich.getName();
        String Nsld = salad.getName();
        String Ndk = drink.getName();
        return Nsnd + "/" + Nsld + "/" + Ndk;
    }
    public double getPrice()
    {
        double Psd = sandwich.getPrice();
        double Psld = salad.getPrice();
        double Pdk = drink.getPrice();
        double g1, g2;
        if(Psd > Psld)
        {
            g1 = Psd;
            if(Psld > Pdk)
            {
                g2 = Psld;
            }
            else
            {
                g2 = Pdk;
            }
        }
        else
        {
            g1 = Psld;
            if(Psd > Pdk)
            {
                g2 = Psd;
            }
            else
            {
                g2 = Pdk;
            }
        }

        return g1 + g2;
    }
}
