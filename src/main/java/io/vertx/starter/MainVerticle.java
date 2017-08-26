package io.vertx.starter;

import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

	@Override
	public void start() throws Exception {
		vertx.createHttpServer().requestHandler(r -> r.response().end("Hello World from java")).listen(8000);
	}

}
