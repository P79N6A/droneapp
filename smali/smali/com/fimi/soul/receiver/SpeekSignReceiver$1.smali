.class Lcom/fimi/soul/receiver/SpeekSignReceiver$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/receiver/SpeekSignReceiver;->a(Lcom/fimi/soul/receiver/NetworkStateReceiver$a;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/kernel/d/b;

.field final synthetic b:Lcom/fimi/soul/receiver/SpeekSignReceiver;


# direct methods
.method constructor <init>(Lcom/fimi/soul/receiver/SpeekSignReceiver;Lcom/fimi/kernel/d/b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/receiver/SpeekSignReceiver$1;->b:Lcom/fimi/soul/receiver/SpeekSignReceiver;

    iput-object p2, p0, Lcom/fimi/soul/receiver/SpeekSignReceiver$1;->a:Lcom/fimi/kernel/d/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/receiver/SpeekSignReceiver$1;->a:Lcom/fimi/kernel/d/b;

    invoke-virtual {v0}, Lcom/fimi/kernel/d/b;->a()V

    return-void
.end method
