.class Lcom/fimi/soul/service/InitAppService$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/biz/update/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/service/InitAppService;->a(Lcom/fimi/soul/biz/update/f;Lcom/fimi/soul/entity/UpdateVersonBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/service/InitAppService;


# direct methods
.method constructor <init>(Lcom/fimi/soul/service/InitAppService;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/service/InitAppService$3;->a:Lcom/fimi/soul/service/InitAppService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZJJI)V
    .locals 1

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/service/InitAppService$3;->a:Lcom/fimi/soul/service/InitAppService;

    invoke-static {v0}, Lcom/fimi/soul/service/InitAppService;->a(Lcom/fimi/soul/service/InitAppService;)V

    goto :goto_0
.end method
