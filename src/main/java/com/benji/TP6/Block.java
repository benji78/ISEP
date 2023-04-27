package com.benji.TP6;

import lombok.Getter;

import java.util.LinkedList;
import java.util.Queue;

@Getter
public class Block {
    private final Queue<Transaction> transactions;

    public Block() {
        this.transactions = new LinkedList<>();
    }

    public Block add(Transaction transaction) {
        if (transaction == null) {
            return this;
        }
        if (transactions.size() >= 10) {
            Main.blockchain.add(this);
            Block newBlock = new Block();
            newBlock.add(transaction);
            return newBlock;
        }
        transactions.offer(transaction);
        return this;
    }
}

