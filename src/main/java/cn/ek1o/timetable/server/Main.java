package cn.ek1o.timetable.server;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.name.Named;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;

public class Main extends AbstractVerticle{
    private HttpServer server;
    @Named("isDebug")
    private Boolean isDebug = false;

    @Override
    public void start() throws Exception {
        HttpServerOptions options = new HttpServerOptions()
                .setLogActivity(isDebug);
        server = getVertx().createHttpServer(options);

        System.out.println(isDebug);


        server.requestHandler(request -> {
            request.response().end("hello Vert.X.");
        });

        server.listen(8080);
    }

    private static Injector injector;

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // check run module
        String moduleName = "TimetableServerModuleDebug";
        if (args.length != 0) {
            moduleName = args[0];
        }

        injector = Guice.createInjector((Module) Class.forName(moduleName).newInstance());

        Main main = injector.getInstance(Main.class);

        Vertx.vertx().deployVerticle(main);

        Vertx.vertx().close();
    }
}
