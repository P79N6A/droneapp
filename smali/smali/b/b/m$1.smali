.class Lb/b/m$1;
.super Ljava/lang/Object;

# interfaces
.implements Lb/b/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/b/m;->a(Lb/b/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/b/j;

.field final synthetic b:Lb/b/m;


# direct methods
.method constructor <init>(Lb/b/m;Lb/b/j;)V
    .locals 0

    iput-object p1, p0, Lb/b/m$1;->b:Lb/b/m;

    iput-object p2, p0, Lb/b/m$1;->a:Lb/b/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lb/b/m$1;->a:Lb/b/j;

    invoke-virtual {v0}, Lb/b/j;->d()V

    return-void
.end method
