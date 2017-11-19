package com.reige.aop.chain;

/**
 * Created by REIGE on 2017/11/19.
 */
public abstract class Handler {
    private Handler successor;
    public void execute() {
        handleProcess();
        if (successor != null) {
            successor.execute();
        }
    }

    protected abstract void handleProcess();
    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

}
