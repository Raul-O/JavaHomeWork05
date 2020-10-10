package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Phone phone = new Nokia3310("12312432");
        Phone phone2 = new Nokia8_3("2313215646");

        phone.addContact("1", "123456", "Decebal", "last name");
        phone.addContact("2", "phone number2", "Burebista", "last name");
        phone.addContact("3", "phone number3", "fist name", "last name");
        phone.addContact("4", "phone number3", "fist name", "last name");

        phone2.addContact("1", "333333333", "first name", "last name");
        phone2.addContact("2", "555555555", "fist name", "last name");
        phone.getContactsList();

        phone2.getContactsList();



         //send a message to the first contact from the previous listed
         //max number of characters - 100
        phone.sendMessage("123456", "Hello!");
        phone.sendMessage("phone number2", "message test");
        phone.sendMessage("123456", "Another one!");
        phone.listMessages("123456");
        phone.listMessages("phone number2");


        phone.call("phone number");
        phone.call("13131");
        phone.call("phone number");
        phone.call("446546546");
        phone.getCallHistory();
        phone.getBatteryLife();

    }
}
