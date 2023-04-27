package com.benji.TP6;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {
    private final Wallet originWallet;
    private final Wallet destinationWallet;
    private final int isepCoins;
    private boolean payed;

    public Transaction(Wallet originWallet, Wallet destinationWallet, int isepCoins) {
        this.originWallet = originWallet;
        this.destinationWallet = destinationWallet;
        this.isepCoins = isepCoins;
        this.payed = false;
    }

    public Transaction pay() {
        if (originWallet == destinationWallet) {
            System.out.println("Transaction refused: cannot transfer funds to the same wallet.");
            return null;
        }
        int originBalance = Main.wallets.get(originWallet.getToken()).getIsepCoins();
        int newOriginBalance = originBalance - isepCoins;
        if (newOriginBalance < 0) {
            System.out.println("Transaction refused: not enough funds in " + originWallet.getOwner() + "'s wallet.");
            return null;
        }
        originWallet.setIsepCoins(newOriginBalance);
        destinationWallet.setIsepCoins(
                destinationWallet.getIsepCoins() + isepCoins);
        payed = true;
        return this;
    }
}

