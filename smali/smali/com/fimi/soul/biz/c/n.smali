.class public Lcom/fimi/soul/biz/c/n;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/drone/d$b;
.implements Lcom/fimi/soul/module/b/b$b;


# instance fields
.field private a:Lcom/fimi/soul/drone/a;

.field private b:Lcom/fimi/soul/biz/c/p;

.field private c:Lcom/fimi/soul/biz/c/f;

.field private d:Lcom/fimi/soul/biz/c/l;


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/fimi/soul/biz/c/n;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {p1, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    invoke-static {}, Lcom/fimi/soul/module/b/b;->a()Lcom/fimi/soul/module/b/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/fimi/soul/module/b/b;->a(Lcom/fimi/soul/module/b/b$b;)V

    new-instance v0, Lcom/fimi/soul/biz/c/p;

    invoke-direct {v0, p1}, Lcom/fimi/soul/biz/c/p;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/c/n;->b:Lcom/fimi/soul/biz/c/p;

    new-instance v0, Lcom/fimi/soul/biz/c/f;

    invoke-direct {v0, p1}, Lcom/fimi/soul/biz/c/f;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/c/n;->c:Lcom/fimi/soul/biz/c/f;

    new-instance v0, Lcom/fimi/soul/biz/c/l;

    invoke-direct {v0, p1}, Lcom/fimi/soul/biz/c/l;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/c/n;->d:Lcom/fimi/soul/biz/c/l;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/c/n;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->b(Lcom/fimi/soul/drone/d$b;)V

    return-void
.end method

.method public a(I)V
    .locals 0

    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 2

    sget-object v0, Lcom/fimi/soul/biz/c/n$1;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/fimi/soul/biz/c/n;->b:Lcom/fimi/soul/biz/c/p;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/p;->a()V

    goto :goto_0

    :pswitch_1
    sget-object v0, Lcom/fimi/soul/drone/d$a;->bx:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {p2, v0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/c/n;->b:Lcom/fimi/soul/biz/c/p;

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/c/d;->f()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/c/p;->a(Ljava/util/List;)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/fimi/soul/biz/c/n;->b:Lcom/fimi/soul/biz/c/p;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/c/p;->b(I)V

    goto :goto_0

    :pswitch_3
    invoke-static {}, Lcom/fimi/soul/module/calibcompass/a;->a()Lcom/fimi/soul/module/calibcompass/a;

    move-result-object v0

    const-string v1, "130"

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/calibcompass/a;->a(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->m()Lcom/fimi/soul/drone/h/am;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/c/n;->b:Lcom/fimi/soul/biz/c/p;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/biz/c/p;->a(Lcom/fimi/soul/drone/h/am;)V

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lcom/fimi/soul/biz/c/n;->c:Lcom/fimi/soul/biz/c/f;

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/c/d;->f()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/c/f;->a(Ljava/util/List;)V

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lcom/fimi/soul/biz/c/n;->c:Lcom/fimi/soul/biz/c/f;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/f;->a()V

    goto :goto_0

    :pswitch_6
    iget-object v0, p0, Lcom/fimi/soul/biz/c/n;->d:Lcom/fimi/soul/biz/c/l;

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/c/d;->f()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/c/l;->a(Ljava/util/List;)V

    goto :goto_0

    :pswitch_7
    iget-object v0, p0, Lcom/fimi/soul/biz/c/n;->d:Lcom/fimi/soul/biz/c/l;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/l;->a()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method
