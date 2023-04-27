package com.benji.TP6;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wallet {
    private final String owner;
    private final int token;
    private int isepCoins;

    public Wallet(String owner, int token) {
        this.owner = owner;
        this.token = token;
        this.isepCoins = 0;
    }
}
