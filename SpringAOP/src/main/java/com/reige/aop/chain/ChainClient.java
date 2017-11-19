package com.reige.aop.chain;

import java.util.Arrays;
import java.util.List;

/**
 * Created by REIGE on 2017/11/19.
 */
public class ChainClient {

    static class ChainHandlerA extends ChainHandler{
        @Override
        protected void handleProcess() {
            System.out.println("handle by chain a");
        }
    }
    static class ChainHandlerB extends ChainHandler{
        @Override
        protected void handleProcess() {
            System.out.println("handle by chain a");
        }
    }
    static class ChainHandlerC extends ChainHandler{
        @Override
        protected void handleProcess() {
            System.out.println("handle by chain a");
        }
    }
    public static void main(String[] args){
        List<ChainHandler> chainHandlers = Arrays.asList(
                new ChainHandlerA(),
                new ChainHandlerB(),
                new ChainHandlerC());
        Chain chain = new Chain(chainHandlers);
        chain.proceed();
    }
}
