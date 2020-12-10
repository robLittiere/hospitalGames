package com.company;

import java.util.ArrayList;
import java.util.List;

public class Place
{
    private String name;
    private String description;
    private List<String> possibleDirection = new ArrayList<>();

    public Place(String name, String description, List<String> direction)
    {
        this.name = name;
        this.description = description;
        this.possibleDirection = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getPossibleDirection() {
        return possibleDirection;
    }

    public void setPossibleDirection(List<String> possibleDirection) {
        this.possibleDirection = possibleDirection;
    }
}
