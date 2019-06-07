package com.jesus_crie.examplebot.tsmodule;

import com.jesus_crie.modularbot.core.dependencyinjection.InjectorTarget;
import com.jesus_crie.modularbot.graalvm.GraalModuleWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class MyTSModule extends GraalModuleWrapper {

    private static final Logger LOG = LoggerFactory.getLogger("MyTSModule");

    @InjectorTarget
    public MyTSModule() {
        super(new File("./MyTSModule/dist/main.js"), LOG);
    }
}
