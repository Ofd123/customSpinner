package com.example.customlisthw;

public class countries
{
    public String flagId;
    public String country;
    public String capitalCity;
    public int populationSize;

    public countries(String flagId, String country, int populationSize, String capitalCity)
    {
        this.flagId = flagId;
        this.country = country;
        this.populationSize = populationSize;
        this.capitalCity = capitalCity;
    }

    public String getFlagId()
    {
        return flagId;
    }

    public void setFlagId(String flagId)
    {
        this.flagId = flagId;
    }

    public String getCapitalCity()
    {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity)
    {
        this.capitalCity = capitalCity;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public int getPopulationSize()
    {
        return populationSize;
    }

    public void setPopulationSize(int populationSize)
    {
        this.populationSize = populationSize;
    }
}
