.class public Lcom/fimi/soul/biz/a/a$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/biz/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/fimi/soul/biz/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/fimi/soul/biz/a/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/fimi/soul/biz/a/a;-><init>(Lcom/fimi/soul/biz/a/a$1;)V

    sput-object v0, Lcom/fimi/soul/biz/a/a$a;->a:Lcom/fimi/soul/biz/a/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
