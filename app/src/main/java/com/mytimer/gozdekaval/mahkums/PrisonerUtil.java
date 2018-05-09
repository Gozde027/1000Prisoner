package com.mytimer.gozdekaval.mahkums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gozde Kaval on 1/21/2018.
 */

public class PrisonerUtil {

    public static Prisoner getLastPrisoner(int inputSize){
        List<Prisoner> prisonerList = createPrisonerList(inputSize);
        List<Prisoner> searchedPrisonerList = findPrisoner(prisonerList,inputSize);
        return findLastOne(searchedPrisonerList);
    }

    private static List<Prisoner> createPrisonerList(int inputSize){
        List<Prisoner> prisonerList = new ArrayList<>();
        for (int i = 0; i < inputSize; i++) {
            Prisoner m = new Prisoner(i + 1, true);
            prisonerList.add(m);
        }
        return prisonerList;
    }

    private static Prisoner findLastOne(List<Prisoner> prisonerList){
        for (Prisoner prisoner : prisonerList) {
            if(prisoner.isIs())
                return prisoner;
        }
        return null;
    }

    private static List<Prisoner> findPrisoner(List<Prisoner> prisonerList, int inputSize){
        int counter = inputSize;
        boolean find = false;

        int k = 0;
        while (counter != 1) {
            if (prisonerList.get(k).isIs()) {
                int j = 1;
                while (k + j < inputSize) {
                    if (prisonerList.get(k + j).isIs()) {
                        prisonerList.get(k + j).setIs(false);
                        find = true;
                        counter--;
                        break;
                    }
                    j++;
                }
                if (!find) {
                    for (int i = 0; i < k; i++) {
                        if (prisonerList.get(i).isIs()) {
                            prisonerList.get(i).setIs(false);
                            counter--;
                            break;
                        }
                    }
                }
            }

            if (k == inputSize - 1)
                k = 0;
            else
                k++;

            find = false;
        }

        return prisonerList;
    }
}
