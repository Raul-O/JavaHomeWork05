package org.example;

import java.util.ArrayList;
import java.util.List;

public class A93 extends Oppo{

        private final Integer maxBatteryLife = 69;
        private String color = "RED";
        private String material = "Plastic";
        List<List<String>> contactsList = new ArrayList<List<String>>();
        List<ArrayList> messagesList = new ArrayList<>();
        List<ArrayList<String>> callHistory = new ArrayList<>();
        private Integer battery = maxBatteryLife;

        public A93(String imei){
            super(imei);
        }

        @Override
        public void addContact(String index, String phoneNumber, String firstName, String lastName) {
            boolean exists = false;
            if (contactsList.size()>=1) {
                for (int i = 0; i < contactsList.size(); i++) {
                    if (contactsList.get(i).get(1).matches(phoneNumber)) {
                        exists = true;
                        System.out.println("Number already saved");
                    }
                }
            }
            if(!exists){
                List<String> contact = new ArrayList<>();
                contact.add(index);
                contact.add(phoneNumber);
                contact.add(firstName);
                contact.add(lastName);
                contactsList.add(contact);
            }
        }

        @Override
        public void getContactsList() {
            for(List<String> contact:contactsList){
                for(Object element:contact) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }

        }

        @Override
        public void sendMessage(String number, String message) {
            ArrayList<String> messageDetails = new ArrayList<>();
            messageDetails.add(number);
            messageDetails.add(message);
            messagesList.add(messageDetails);
            battery -= 1;
        }

        @Override
        public void listMessages(String number) {
            for(List element:messagesList){
                for(Object mes:element){
                    if(mes==number) {
                        System.out.println(element.get(1));
                    }
                }
            }

        }

        @Override
        public void call(String number) {

            boolean exists = false;
            ArrayList<String> callDetails = new ArrayList<>();
            for(int i = 0; i < contactsList.size();i++) {
                if (contactsList.get(i).get(1).matches(number)) {
                    exists = true;
                    callDetails.add(contactsList.get(i).get(1));
                    callDetails.add(contactsList.get(i).get(2));
                    callDetails.add(contactsList.get(i).get(3));
                    callHistory.add(callDetails);
                }
            }
            if(!exists){
                callDetails.add(number);
                callDetails.add("Unknown");
                callHistory.add(callDetails);
            }



        }


        @Override
        public void getCallHistory() {

            System.out.println("Call history:");
            System.out.println(callHistory.size());

            for(List l:callHistory){
                //for(int i = 0; i < l.size(); i++){
                System.out.println(l.toString().replace("[", ""));
                //}
            }

        }

        @Override
        public void getBatteryLife() {
            System.out.println(battery);
        }


}
