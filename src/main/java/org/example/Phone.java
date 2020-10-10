package org.example;

interface Phone {

    void addContact(String index, String phoneNumber, String firstName, String lastName);
    void getContactsList();
    void sendMessage(String number, String message);
    void listMessages(String number);
    void call(String number);
    void getCallHistory();
    void getBatteryLife();
}
