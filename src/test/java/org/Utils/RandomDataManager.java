package org.Utils;

import java.util.Random;

public class RandomDataManager {
    public String getEmailAddress(String userName){
        String email= userName+new Random().nextInt(1000)+"qeee"+new Random().nextInt(1000)+"@gmail.com";
        System.out.println(email);
        return email;

    }
}
