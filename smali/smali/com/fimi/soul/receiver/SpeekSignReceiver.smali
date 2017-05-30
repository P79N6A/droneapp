.class public Lcom/fimi/soul/receiver/SpeekSignReceiver;
.super Lcom/fimi/soul/receiver/NetworkStateReceiver;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/receiver/NetworkStateReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/receiver/NetworkStateReceiver$a;Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lcom/fimi/soul/receiver/NetworkStateReceiver$a;->a:Lcom/fimi/soul/receiver/NetworkStateReceiver$a;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/fimi/soul/receiver/NetworkStateReceiver$a;->b:Lcom/fimi/soul/receiver/NetworkStateReceiver$a;

    if-ne p1, v0, :cond_1

    :cond_0
    invoke-static {p2}, Lcom/fimi/kernel/d/b;->a(Landroid/content/Context;)Lcom/fimi/kernel/d/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/d/b;->d()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Lcom/fimi/soul/receiver/SpeekSignReceiver$1;

    invoke-direct {v1, p0, v0}, Lcom/fimi/soul/receiver/SpeekSignReceiver$1;-><init>(Lcom/fimi/soul/receiver/SpeekSignReceiver;Lcom/fimi/kernel/d/b;)V

    invoke-static {v1}, Lcom/fimi/kernel/utils/x;->b(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method
