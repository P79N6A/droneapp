.class public final Lcom/google/android/gms/contextmanager/c;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/google/android/gms/common/api/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$g",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/awareness/d;

.field public static final c:Lcom/google/android/gms/awareness/e;

.field public static final d:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a",
            "<",
            "Lcom/google/android/gms/awareness/b;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Lcom/google/android/gms/common/api/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$b",
            "<",
            "Lcom/google/android/gms/contextmanager/internal/d;",
            "Lcom/google/android/gms/awareness/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0}, Lcom/google/android/gms/common/api/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/c;->a:Lcom/google/android/gms/common/api/a$g;

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/c;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/fence/internal/c;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/c;->b:Lcom/google/android/gms/awareness/d;

    new-instance v0, Lcom/google/android/gms/awareness/snapshot/internal/j;

    invoke-direct {v0}, Lcom/google/android/gms/awareness/snapshot/internal/j;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/c;->c:Lcom/google/android/gms/awareness/e;

    new-instance v0, Lcom/google/android/gms/contextmanager/c$1;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/c$1;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/c;->e:Lcom/google/android/gms/common/api/a$b;

    new-instance v0, Lcom/google/android/gms/common/api/a;

    const-string v1, "ContextManager.API"

    sget-object v2, Lcom/google/android/gms/contextmanager/c;->e:Lcom/google/android/gms/common/api/a$b;

    sget-object v3, Lcom/google/android/gms/contextmanager/c;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/api/a;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/common/api/a$g;)V

    sput-object v0, Lcom/google/android/gms/contextmanager/c;->d:Lcom/google/android/gms/common/api/a;

    return-void
.end method
