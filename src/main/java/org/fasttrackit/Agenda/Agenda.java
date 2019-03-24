package org.fasttrackit.Agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private String nameAgenda;
    private String owner;
    private Contact[] contacts = new Contact[20];
    private List<Contact> contactList = new ArrayList<Contact>();

    public static void main (String args []) throws IllegalAccessException {

        Agenda agenda = new Agenda();

        Contact contact0 = new Contact("vasile","Muresan");


        Contact firstContact = new Contact();
        firstContact.setFirstName("Costel");
        firstContact.setLastName("Pop");
        System.out.println(firstContact.toString()) ;

        agenda.getContactList().add(firstContact);
        agenda.contacts[0]=firstContact;

        Contact secondContact = new Contact();
        secondContact.setFirstName("Costel");
        secondContact.setLastName("Pop");
        System.out.println(secondContact.toString()) ;

        agenda.getContactList().add(secondContact);
        agenda.contacts[1]=secondContact;

        System.out.println("check equals with"+ (secondContact==firstContact));
        System.out.println("check equals with"+ (secondContact.equals(firstContact)));


    }

    public String getNameAgenda() {
        return nameAgenda;
    }

    public void setNameAgenda(String nameAgenda) {
        this.nameAgenda = nameAgenda;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
}
