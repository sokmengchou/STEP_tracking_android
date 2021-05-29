package com.example.androidauthenticationapp;

public class Contact {
    private String contactName;
    private String contactNumber;
    private String contactTitle;

    public Contact(String contactName, String contactNumber, String contactTitle) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.contactTitle = contactTitle;
    }

    public static final Contact[] contacts = {
            new Contact("Dara", "7340", "Developer"),
            new Contact("Lina", "7341", "Designer"),
            new Contact("Bora", "7342", "Sales")
    };

    public static String[] getContactNames(){
        String [] contactNames = new String[Contact.contacts.length];
        for(int i=0; i<Contact.contacts.length; i++){
            contactNames[i] = contacts[i].getContactName();
        }
        return contactNames;
    }

    @Override
    public String toString(){
        return getContactNumber()+" "+getContactName();
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getContactTitle() {
        return contactTitle;
    }
}
