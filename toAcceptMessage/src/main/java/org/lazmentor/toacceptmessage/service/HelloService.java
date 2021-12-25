package org.lazmentor.toacceptmessage.service;

import org.lazmentor.toacceptmessage.model.Hello;

public interface HelloService {
    void saveHello(Hello hello);

    Long getCount();

}
