package com.benji.TP6;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static final List<Block> blockchain = new LinkedList<>();
    static HashMap<Integer, Wallet> wallets = new HashMap<>();

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Dave", "Eve"};

        createWallets(names, 10);

//        printWallets();
//        new Transaction(wallets.get(0), wallets.get(1), 5).pay();
//        printWallets();
//        new Transaction(wallets.get(0), wallets.get(2), 5).pay();
//        printWallets();
//        new Transaction(wallets.get(2), wallets.get(3), 15).pay();
//        printWallets();
//        new Transaction(wallets.get(3), wallets.get(4), 30).pay();
        Block block = new Block();

        printWallets();
        Block currentBlock = simulation(block);

        System.out.println("\n" + blockchain.size() + " block(s) in the blockchain.");
        System.out.println(currentBlock.getTransactions().size() + " transaction(s) in the next block.\n");

        printWallets();
    }

    private static void printWallets() {
        for (Wallet wallet : wallets.values()) {
            System.out.println(wallet.getToken() + ": " + wallet.getOwner() + " : " + wallet.getIsepCoins() + " coins");
        }
        System.out.println();
    }

    public static void createWallets(String[] names, int initialBalance) {
        for (int i = 0; i < names.length; i++) {
            Wallet wallet = new Wallet(names[i], i);
            wallet.setIsepCoins(initialBalance);
            wallets.put(wallet.getToken(), wallet);
        }
    }

    public static Block simulation(Block block) {
        for (int i = 0; i < 55; i++) {
            int origin = (int) (Math.random() * wallets.size());
            int destination = (int) (Math.random() * wallets.size());
//            ×1.1 to make some transactions fail
            int amount = (int) (Math.random() * 1.1 * wallets.get(origin).getIsepCoins());
            block = block.add(new Transaction(wallets.get(origin), wallets.get(destination), amount).pay());
        }
        return block;
    }
}
