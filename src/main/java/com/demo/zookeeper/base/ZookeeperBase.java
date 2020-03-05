package com.demo.zookeeper.base;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

public class ZookeeperBase {

	private static Logger logger = Logger.getLogger(ZookeeperBase.class);

	private ZooKeeper zookeeper;
	
	//连接ZK的连接字符串
	private String connectString;
	
	//客户端连接超时时间
	private int sessionTimeout;

	public ZookeeperBase(String connectString, int sessionTimeout) throws IOException {
		this.connectString = connectString;
		this.sessionTimeout = sessionTimeout;
		zookeeper = new ZooKeeper(connectString, sessionTimeout, new Watcher() {
			@Override
			public void process(WatchedEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

}
