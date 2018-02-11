package cn.ek1o.timetable.server;

import io.netty.handler.codec.HeadersUtils;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpHeaders;
import io.vertx.core.http.HttpServerRequest;

public class TimetableServer {
    public static void main(String[] args) {
        Vertx.vertx().createHttpServer()
                .requestHandler(new Handler<HttpServerRequest>() {
                    @Override
                    public void handle(HttpServerRequest request) {
                        request.response().putHeader(HttpHeaderNames.CONTENT_ENCODING, "UTF-8").end();
                    }
                })
                .requestHandler(request -> request.response().end("<html><head><title>title</title></head><body><h1>中文测试</h1></body><html>")).listen(8080);
        Vertx.vertx().close();
    }
}
