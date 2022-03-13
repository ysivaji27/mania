package com.mania.mongodb.samples;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton threadSafeSingleton = null;
    private  ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getThreadSafeSingleton(){
       if(threadSafeSingleton == null){
           threadSafeSingleton = new ThreadSafeSingleton();
       }
       return threadSafeSingleton;
    }

    public  static ThreadSafeSingleton getInstance(){
        if(threadSafeSingleton ==null){
            synchronized(ThreadSafeSingleton.class){
                threadSafeSingleton = new ThreadSafeSingleton();
            }
        }
        return threadSafeSingleton;
    }
}
