.class public Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/CastRemoteDisplayLocalService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field a:I
    .annotation build Lcom/google/android/gms/cast/d$d;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;->a:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;->a:I

    return v0
.end method

.method public a(I)V
    .locals 0
    .param p1    # I
        .annotation build Lcom/google/android/gms/cast/d$d;
        .end annotation
    .end param

    iput p1, p0, Lcom/google/android/gms/cast/CastRemoteDisplayLocalService$c;->a:I

    return-void
.end method
