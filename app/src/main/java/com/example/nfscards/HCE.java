package com.example.nfscards;

import android.nfc.cardemulation.HostApduService;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;

@RequiresApi(api = Build.VERSION_CODES.KITKAT)
public class HCE extends HostApduService {
    @Override
    public byte[] processCommandApdu(byte[] apdu, Bundle extras) {
      // ...
        return apdu;
    }
    @Override
    public void onDeactivated(int reason) {
       //...
    }
}
