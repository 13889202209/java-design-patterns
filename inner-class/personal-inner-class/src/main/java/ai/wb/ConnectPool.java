package ai.wb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import java.util.Timer;

public class ConnectPool {

    static {
        System.out.println("static code block");
    }

    //存在Connection的数组
    private PoolConn[] poolConns;
    //连接池的最小连接数
    private int min;
    //连接池的最大连接数
    private int max;
    //一个连接的最大使用次数
    private int maxUseCount;
    //一个连接的最大空闲时间
    private long maxTimeout;
    //同一时间的Connection最大使用个数
    private int maxConns;
    //定时器
    private Timer timer;


    {
        System.out.println("construct code block");
        try {
            this.min = 5;
            this.poolConns = new PoolConn[this.min];
            for (int i = 0; i < this.min; i++) {
                PoolConn poolConn = new PoolConn();
                poolConn.conn = DriverManager.getConnection("");
                poolConn.isUse = false;
                poolConn.lastAccess = new Date().getTime();
                poolConn.useCount = 0;
                this.poolConns[i] = poolConn;
            }
        } catch (Exception e) {

        }
    }


    private class PoolConn {
        public Connection conn;
        public boolean isUse;
        public long lastAccess;
        public int useCount;
    }

}
