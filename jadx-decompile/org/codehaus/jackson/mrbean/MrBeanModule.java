package org.codehaus.jackson.mrbean;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.Module;
import org.codehaus.jackson.map.Module.SetupContext;

public class MrBeanModule extends Module {
    private static final Version VERSION = new Version(1, 8, 0, null);
    private final String NAME;
    protected AbstractTypeMaterializer _materializer;

    public MrBeanModule() {
        this(new AbstractTypeMaterializer());
    }

    public MrBeanModule(AbstractTypeMaterializer abstractTypeMaterializer) {
        this.NAME = "MrBeanModule";
        this._materializer = abstractTypeMaterializer;
    }

    public String getModuleName() {
        return "MrBeanModule";
    }

    public void setupModule(SetupContext setupContext) {
        setupContext.addAbstractTypeResolver(this._materializer);
    }

    public Version version() {
        return VERSION;
    }
}
