package m.framework.b;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

public class e {
    private static Handler a;

    public static void a() {
        if (a == null) {
            a = new Handler(new Callback() {
                public boolean handleMessage(Message message) {
                    e.b(message);
                    return false;
                }
            });
        }
    }

    public static boolean a(int i, long j, Callback callback) {
        return a.sendMessageAtTime(b(i, callback), j);
    }

    public static boolean a(int i, Callback callback) {
        return a.sendMessage(b(i, callback));
    }

    public static boolean a(Message message, long j, Callback callback) {
        return a.sendMessageDelayed(c(message, callback), j);
    }

    public static boolean a(Message message, Callback callback) {
        return a.sendMessage(c(message, callback));
    }

    private static Message b(int i, Callback callback) {
        Message message = new Message();
        message.what = i;
        return c(message, callback);
    }

    private static void b(Message message) {
        Object[] objArr = (Object[]) message.obj;
        Message message2 = (Message) objArr[0];
        Callback callback = (Callback) objArr[1];
        if (callback != null) {
            callback.handleMessage(message2);
        }
    }

    public static boolean b(int i, long j, Callback callback) {
        return a.sendMessageDelayed(b(i, callback), j);
    }

    public static boolean b(Message message, long j, Callback callback) {
        return a.sendMessageAtTime(c(message, callback), j);
    }

    public static boolean b(Message message, Callback callback) {
        return a.sendMessageAtFrontOfQueue(c(message, callback));
    }

    private static Message c(Message message, Callback callback) {
        Message message2 = new Message();
        message2.obj = new Object[]{message, callback};
        return message2;
    }
}
