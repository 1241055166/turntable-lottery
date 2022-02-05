package com.henry.lottery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.henry.lottery.dal.mapper")
public class TurntableLotteryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurntableLotteryApplication.class, args);
    }

}
