package nLayeredDemoV1.core;

import nLayeredDemoV1.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) {
		// TODO Auto-generated method stub
		JLoggerManager manager=new JLoggerManager();
		manager.log(message);
	}

}
