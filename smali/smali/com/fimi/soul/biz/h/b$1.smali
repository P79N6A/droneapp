.class Lcom/fimi/soul/biz/h/b$1;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/biz/h/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/h/b;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/h/b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/h/b$1;->a:Lcom/fimi/soul/biz/h/b;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x64

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b$1;->a:Lcom/fimi/soul/biz/h/b;

    invoke-static {v0}, Lcom/fimi/soul/biz/h/b;->a(Lcom/fimi/soul/biz/h/b;)Ljava/util/LinkedList;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b$1;->a:Lcom/fimi/soul/biz/h/b;

    invoke-static {v0}, Lcom/fimi/soul/biz/h/b;->a(Lcom/fimi/soul/biz/h/b;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b$1;->a:Lcom/fimi/soul/biz/h/b;

    invoke-static {v0}, Lcom/fimi/soul/biz/h/b;->a(Lcom/fimi/soul/biz/h/b;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/LinkedList;

    :goto_0
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/LinkedList;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fimi/soul/drone/c/a/c;

    iget-object v2, p0, Lcom/fimi/soul/biz/h/b$1;->a:Lcom/fimi/soul/biz/h/b;

    invoke-static {v2}, Lcom/fimi/soul/biz/h/b;->b(Lcom/fimi/soul/biz/h/b;)Lcom/fimi/soul/biz/h/d;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/fimi/soul/biz/h/d;->a(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/h/b$1;->a:Lcom/fimi/soul/biz/h/b;

    invoke-static {v0}, Lcom/fimi/soul/biz/h/b;->b(Lcom/fimi/soul/biz/h/b;)Lcom/fimi/soul/biz/h/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/h/d;->k()V

    :cond_1
    return-void
.end method
