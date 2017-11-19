package com.reige.aop.chain;

/**
 * Created by REIGE on 2017/11/19.
 */
public abstract class ChainHandler {

    public void execute(Chain chain) {
       handleProcess();
       chain.proceed();
    }

    protected abstract void handleProcess();

}
