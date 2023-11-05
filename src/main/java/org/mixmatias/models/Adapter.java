package org.mixmatias.models;

import org.mixmatias.interfaces.Ps2Target;

public class Adapter implements Ps2Target {
    GabineteClient gabineteClient;

    public Adapter(GabineteClient gabineteClient){
        this.gabineteClient = gabineteClient;
    }

    @Override
    public void ps2() {
        gabineteClient.entradaUsb();
    }
}
