.class Lcom/fimi/soul/utils/FlyLogTools$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/utils/FlyLogTools;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/utils/FlyLogTools;


# direct methods
.method constructor <init>(Lcom/fimi/soul/utils/FlyLogTools;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/utils/FlyLogTools$2;->a:Lcom/fimi/soul/utils/FlyLogTools;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    invoke-static {}, Lcom/fimi/kernel/c;->a()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {v0}, Lcom/fimi/soul/biz/manager/x;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/x;

    move-result-object v1

    invoke-static {}, Lcom/fimi/soul/module/update/a/a;->a()Lcom/fimi/soul/module/update/a/a;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/fimi/soul/module/update/a/a;->a(I)Lcom/fimi/soul/module/update/a/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/module/update/a/e;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lcom/fimi/soul/base/a;->b(Landroid/content/Context;)Lcom/fimi/soul/entity/User;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-virtual {v3}, Lcom/fimi/soul/entity/User;->getUserID()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_2
    invoke-virtual {v3}, Lcom/fimi/soul/entity/User;->getUserID()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/fimi/soul/utils/FlyLogTools$2;->a:Lcom/fimi/soul/utils/FlyLogTools;

    invoke-static {v0}, Lcom/fimi/soul/utils/t;->a(Landroid/content/Context;)Lcom/fimi/soul/utils/t;

    move-result-object v0

    iput-object v0, v5, Lcom/fimi/soul/utils/FlyLogTools;->b:Lcom/fimi/soul/utils/t;

    iget-object v0, p0, Lcom/fimi/soul/utils/FlyLogTools$2;->a:Lcom/fimi/soul/utils/FlyLogTools;

    iget-object v0, v0, Lcom/fimi/soul/utils/FlyLogTools;->b:Lcom/fimi/soul/utils/t;

    invoke-virtual {v3}, Lcom/fimi/soul/entity/User;->getUserID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/fimi/soul/utils/t;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_0

    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/utils/u;

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    const-string v7, "planeID"

    invoke-virtual {v6, v7, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v7, "flyTime"

    invoke-virtual {v0}, Lcom/fimi/soul/utils/u;->c()J

    move-result-wide v8

    invoke-virtual {v6, v7, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v7, "flyJourney"

    invoke-virtual {v0}, Lcom/fimi/soul/utils/u;->d()D

    move-result-wide v8

    invoke-virtual {v6, v7, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string v0, "userID"

    invoke-virtual {v6, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v3, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/fimi/soul/utils/FlyLogTools$a;

    iget-object v3, p0, Lcom/fimi/soul/utils/FlyLogTools$2;->a:Lcom/fimi/soul/utils/FlyLogTools;

    invoke-direct {v2, v3, v4}, Lcom/fimi/soul/utils/FlyLogTools$a;-><init>(Lcom/fimi/soul/utils/FlyLogTools;Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Lcom/fimi/soul/biz/manager/x;->b(Ljava/lang/String;Lcom/fimi/soul/biz/m/k;)V

    goto/16 :goto_0
.end method
