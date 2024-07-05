package com.osgi.bundle2;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Bundle2Activator implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Bundle 2 started.");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Bundle 2 stopped.");
    }
}
