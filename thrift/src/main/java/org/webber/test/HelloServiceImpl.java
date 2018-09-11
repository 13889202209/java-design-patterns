package org.webber.test;

import org.apache.thrift.TException;

public class HelloServiceImpl implements HelloService.Iface{
    @Override
    public int sayInt(int param) throws TException {
        System.out.println("say int :" + param);
        return 0;
    }

    @Override
    public String sayString(String param) throws TException {
        System.out.println("say string :" + param);
        return "say string ";
    }

    @Override
    public boolean sayBoolean(boolean param) throws TException {
        System.out.println("say boolean :" + param);
        return false;
    }

    @Override
    public void sayVoid() throws TException {
        System.out.println("say void" );
    }
}
