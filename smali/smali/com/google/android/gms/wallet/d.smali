.class public final Lcom/google/android/gms/wallet/d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/d$c;,
        Lcom/google/android/gms/wallet/d$b;,
        Lcom/google/android/gms/wallet/d$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/wallet/d$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/wallet/c;

.field public static final c:Lcom/google/android/gms/wallet/wobs/j;

.field public static final d:Lcom/google/android/gms/wallet/firstparty/b;

.field private static final e:Lcom/google/android/gms/common/api/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$g",
            "<",
            "Lcom/google/android/gms/internal/fa;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:Lcom/google/android/gms/common/api/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$b",
            "<",
            "Lcom/google/android/gms/internal/fa;",
            "Lcom/google/android/gms/wallet/d$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/d;->e:Lcom/google/android/gms/common/api/a$g;

    new-instance v0, Lcom/google/android/gms/wallet/d$1;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/d$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/d;->f:Lcom/google/android/gms/common/api/a$b;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "Wallet.API"

    sget-object v2, Lcom/google/android/gms/wallet/d;->f:Lcom/google/android/gms/common/api/a$b;

    sget-object v3, Lcom/google/android/gms/wallet/d;->e:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lcom/google/android/gms/wallet/d;->a:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lcom/google/android/gms/internal/ez;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ez;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/d;->b:Lcom/google/android/gms/wallet/c;

    new-instance v0, Lcom/google/android/gms/internal/fd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/fd;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/d;->c:Lcom/google/android/gms/wallet/wobs/j;

    new-instance v0, Lcom/google/android/gms/internal/fc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/fc;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/d;->d:Lcom/google/android/gms/wallet/firstparty/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/g;I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lcom/google/android/gms/wallet/d;->b:Lcom/google/android/gms/wallet/c;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/wallet/c;->a(Lcom/google/android/gms/common/api/g;I)V

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wallet/FullWalletRequest;I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lcom/google/android/gms/wallet/d;->b:Lcom/google/android/gms/wallet/c;

    invoke-interface {v0, p0, p1, p2}, Lcom/google/android/gms/wallet/c;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wallet/FullWalletRequest;I)V

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lcom/google/android/gms/wallet/d;->b:Lcom/google/android/gms/wallet/c;

    invoke-interface {v0, p0, p1, p2}, Lcom/google/android/gms/wallet/c;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wallet/MaskedWalletRequest;I)V

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lcom/google/android/gms/wallet/d;->b:Lcom/google/android/gms/wallet/c;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/wallet/c;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/wallet/NotifyTransactionStatusRequest;)V

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lcom/google/android/gms/wallet/d;->b:Lcom/google/android/gms/wallet/c;

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/google/android/gms/wallet/c;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method
