.class public Lcom/fimi/soul/biz/h/c$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/biz/h/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static a:Lcom/fimi/soul/biz/h/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/fimi/soul/biz/h/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/fimi/soul/biz/h/c;-><init>(Lcom/fimi/soul/biz/h/c$1;)V

    sput-object v0, Lcom/fimi/soul/biz/h/c$a;->a:Lcom/fimi/soul/biz/h/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Lcom/fimi/soul/biz/h/c;
    .locals 1

    sget-object v0, Lcom/fimi/soul/biz/h/c$a;->a:Lcom/fimi/soul/biz/h/c;

    return-object v0
.end method
