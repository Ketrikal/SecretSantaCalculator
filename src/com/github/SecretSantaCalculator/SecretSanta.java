package com.github.SecretSantaCalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class SecretSanta {
    private ArrayList<String> names = new ArrayList<String>();
    public void addName(String name) {
        names.add(name);
    }

    public HashMap<String, String> partnerDB = new HashMap<>();

    public SecretSanta calculatePartners() {
        // TODO: convert method from void in order to avoid editing the existing object too much

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
        return this;
    }    

    public String getRecipient(String name) {
        return partnerDB.get(name);
    }
}

class SupportMethods {
    public static ArrayList<String> copyStringArrayList(ArrayList<String> list) {
        ArrayList<String> listCopy = new ArrayList<String>();
        listCopy.addAll(list);
        return listCopy;
    }
}