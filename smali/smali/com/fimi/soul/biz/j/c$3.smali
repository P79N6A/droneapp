.class Lcom/fimi/soul/biz/j/c$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/utils/ak$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/biz/j/c;->g()V
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

    iput-object p1, p0, Lcom/fimi/soul/biz/j/c$3;->a:Lcom/fimi/soul/biz/j/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$3;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/c;->f(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/utils/ak;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$3;->a:Lcom/fimi/soul/biz/j/c;

    invoke-static {v0}, Lcom/fimi/soul/biz/j/c;->f(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/utils/ak;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/utils/ak;->dismiss()V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c$3;->a:Lcom/fimi/soul/biz/j/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/fimi/soul/biz/j/c;->a(Lcom/fimi/soul/biz/j/c;Lcom/fimi/soul/utils/ak;)Lcom/fimi/soul/utils/ak;

    :cond_0
    return-void
.end method
