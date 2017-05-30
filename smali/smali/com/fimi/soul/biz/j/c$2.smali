.class Lcom/fimi/soul/biz/j/c$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Observer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/biz/j/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/biz/j/c;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/j/c;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/j/c$2;->a:Lcom/fimi/soul/biz/j/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public update(Ljava/util/Observable;Ljava/lang/Object;)V
    .locals 5

    const v4, 0x7f0a012a

    const v3, 0x7f0a0129

    const v2, 0x7f0a011f

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$2;->a:Lcom/fimi/soul/biz/j/c;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/c;->a()V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$2;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/c;->a(Lcom/fimi/soul/biz/j/c;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$2;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/c;->b(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/entity/DroneModelBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelBean;->getCurrentFlightModel()I

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$2;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/c;->a(Lcom/fimi/soul/biz/j/c;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$2;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/c;->c(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-interface {v0, v4}, Lcom/fimi/soul/biz/j/d;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$2;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/c;->e(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/biz/j/e;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/j/c$2;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v1}, Lcom/fimi/soul/biz/j/c;->d(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/drone/a;

    move-result-object v1

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/j/e;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$2;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/c;->d(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/drone/a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bn:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$2;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/c;->b(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/entity/DroneModelBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelBean;->getCurrentFlightModel()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$2;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/c;->c(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/fimi/soul/biz/j/d;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$2;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/c;->e(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/biz/j/e;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/j/c$2;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v1}, Lcom/fimi/soul/biz/j/c;->d(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/drone/a;

    move-result-object v1

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/j/e;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$2;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/c;->d(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/drone/a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bn:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$2;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/c;->c(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/biz/j/d;

    move-result-object v0

    invoke-interface {v0, v3}, Lcom/fimi/soul/biz/j/d;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$2;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/c;->e(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/biz/j/e;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/j/c$2;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v1}, Lcom/fimi/soul/biz/j/c;->d(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/drone/a;

    move-result-object v1

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/j/e;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
