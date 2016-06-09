package com.last_khajiit.skype2gitter;

import io.undertow.Undertow;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;

public class Skype2Gitter{
	private static StatisticsUtil statisticsUtil = StatisticsUtil.getInstance();
	
	public static void main(String[] args){
		if(args.length < 4){
        		System.err.println("ERROR: Not all parameters have been specified!");
        		System.exit(0);
    		}
		final String username = args[0];
		final String password = args[1];
		final String gitterChatName = args[2];
		final String gitterToken = args[3];	

		SkypeUtils skypeUtils = new SkypeUtils(username, password);
		GitterUtils gitterUtils = new GitterUtils(gitterToken, gitterChatName);
		skypeUtils.processSkypeMessages(gitterUtils);
		
		int port = Integer.parseInt(System.getenv("PORT")!=null?System.getenv("PORT"):"8080");
		Undertow server = Undertow.builder()
            .addHttpListener(port, "")
            .setHandler(new HttpHandler(){
                @Override
                public void handleRequest(final HttpServerExchange exchange) throws Exception {
                    exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/plain");
                    exchange.getResponseSender().send(statisticsUtil.getStatisticsAsString());
                }
            }).build();
        server.start();
	}
}
