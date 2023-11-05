package org.mixmatias;

import org.mixmatias.models.Adapter;
import org.mixmatias.models.GabineteClient;
import org.mixmatias.models.UsbAdaptee;

public class Main {
    public static void main(String[] args) {
        GabineteClient gabineteClient = new GabineteClient();

        Adapter adapter = new Adapter(gabineteClient);

        adapter.ps2();

    }
}