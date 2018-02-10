package cn.ek1o.timetable.server.util.guice;

import cn.ek1o.timetable.server.Main;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class TimetableServerModuleDebug extends AbstractModule{
    @Override
    protected void configure() {
        bind(Boolean.class).annotatedWith(Names.named("isDebug")).toInstance(true);

        bind(Main.class);
    }
}
