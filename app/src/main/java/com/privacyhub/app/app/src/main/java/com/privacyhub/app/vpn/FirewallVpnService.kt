package com.privacyhub.app.vpn

import android.net.VpnService
import android.content.Intent

class FirewallVpnService : VpnService() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val builder = Builder()
        builder.setSession("PrivacyHub VPN")
        builder.addAddress("10.0.0.2", 32)
        builder.addDnsServer("1.1.1.1")
        builder.establish()
        return START_STICKY
    }
}
