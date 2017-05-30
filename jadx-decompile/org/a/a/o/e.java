package org.a.a.o;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public final class e {
    public static void a(StringBuilder stringBuilder, SocketAddress socketAddress) {
        a.a((Object) stringBuilder, "Buffer");
        a.a((Object) socketAddress, "Socket address");
        if (socketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
            Object address = inetSocketAddress.getAddress();
            if (address != null) {
                address = address.getHostAddress();
            }
            stringBuilder.append(address).append(':').append(inetSocketAddress.getPort());
            return;
        }
        stringBuilder.append(socketAddress);
    }
}
