package com.osgi.bundle1;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Bundle1Activator implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Bundle 1 started.");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Bundle 1 stopped.");
    }
}
