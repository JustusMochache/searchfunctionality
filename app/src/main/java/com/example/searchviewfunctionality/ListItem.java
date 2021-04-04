package com.example.searchviewfunctionality;


//this is our model classs
public class ListItem {

    private String head;
    private String desc;

    //generate contructor to initialize this variables

    public ListItem(String head, String desc) {
        this.head = head;
        this.desc = desc;
    }
    //to get this variables we will create getters

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }
}
