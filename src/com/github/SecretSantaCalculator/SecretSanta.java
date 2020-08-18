package com.github.SecretSantaCalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class SecretSanta {
    private ArrayList<String> names = new ArrayList<String>();
    public void addName(String name) {
        names.add(name);
    }
    public ArrayList showNameList() {
        return names;
    }

    public HashMap<String, String> partnerData = new HashMap<>();

    public SecretSanta calculatePartners() {

        HashMap<String, String> partnerDB = new HashMap<>();
        ArrayList<String> namesCopy = null;
        while (namesCopy == null || namesCopy.size() > 0) {
            namesCopy = SupportMethods.copyStringArrayList(names);
            int partnerIndex;
            for (int i = 0; namesCopy.size() > 0;) {
                partnerIndex = ThreadLocalRandom.current().nextInt(0, namesCopy.size());
                if (!names.get(i).equals(namesCopy.get(partnerIndex))) {
                    partnerDB.put(names.get(i), namesCopy.get(partnerIndex));
                    i++;
                    namesCopy.remove(partnerIndex);
                } else if (namesCopy.size() == 1 && names.get(i).equals(namesCopy.get(partnerIndex))) {
                    break;
                } else {
                    continue;
                }
            }
        }
        SecretSanta temp = this.copyOf();
        temp.partnerData = partnerDB;
        return temp;
    }    

    public String getRecipient(String name) {
        return partnerData.get(name);
    }

    private SecretSanta copyOf() {
        SecretSanta temp = new SecretSanta();
        temp.names = this.names;
        return temp;
    }

    public HashMap<String, String> showPartnerData() {
        return this.partnerData;
    }

}

class SupportMethods {
    public static ArrayList<String> copyStringArrayList(ArrayList<String> list) {
        ArrayList<String> listCopy = new ArrayList<String>();
        listCopy.addAll(list);
        return listCopy;
    }
}