.class public Lcom/fimi/soul/module/calibcompass/a;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/fimi/soul/module/calibcompass/a;


# instance fields
.field private volatile b:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/fimi/soul/module/b/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/a;->b:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static a()Lcom/fimi/soul/module/calibcompass/a;
    .locals 1

    sget-object v0, Lcom/fimi/soul/module/calibcompass/a;->a:Lcom/fimi/soul/module/calibcompass/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/module/calibcompass/a;

    invoke-direct {v0}, Lcom/fimi/soul/module/calibcompass/a;-><init>()V

    sput-object v0, Lcom/fimi/soul/module/calibcompass/a;->a:Lcom/fimi/soul/module/calibcompass/a;

    :cond_0
    sget-object v0, Lcom/fimi/soul/module/calibcompass/a;->a:Lcom/fimi/soul/module/calibcompass/a;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/a;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/b/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/module/b/a;->b()V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/a;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Ljava/lang/String;Lcom/fimi/soul/module/b/a;)V
    .locals 1

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/a;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
