package com.github.sejoung.codetest.constant;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;

import java.util.Optional;

public class Run {


    public String getPlatformCode(String plateform) {
        String result = "";

        switch (plateform) {
            case "WEB":
                result = CommonConstants.WEB;
                break;
            case "MOBILE":
                result = CommonConstants.MOBILE;
                break;

        }

        return result;
    }

    public static void main(String[] args) {
      /*  Run r = new Run();

        System.out.println(r.getPlatformCode("WEB"));*/

        Optional<Platform> p = Platform.fromString("WEB");

        p.ifPresent((platform) -> {

            System.out.println(platform.getCode());

            System.out.println(platform.getDesc());
        });
    }
}
