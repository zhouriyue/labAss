package com.gxuwz.lab_assistant.util.comcurrent;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolUtil {
	
	ThreadPoolExecutor pool = new ThreadPoolExecutor(1,2,5,TimeUnit.MICROSECONDS,new LinkedBlockingDeque<>());
	
	public ThreadPoolUtil() {
		pool = new ThreadPoolExecutor(1, 2, 5, TimeUnit.MICROSECONDS, new LinkedBlockingDeque<>());
	}
	
	public void executor(Runnable runnable) {
		pool.execute(runnable);
	}

}
