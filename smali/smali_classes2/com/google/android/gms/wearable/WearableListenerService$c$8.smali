.class Lcom/google/android/gms/wearable/WearableListenerService$c$8;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/WearableListenerService$c;->a(Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;

.field final synthetic b:Lcom/google/android/gms/wearable/WearableListenerService$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/WearableListenerService$c;Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/WearableListenerService$c$8;->b:Lcom/google/android/gms/wearable/WearableListenerService$c;

    iput-object p2, p0, Lcom/google/android/gms/wearable/WearableListenerService$c$8;->a:Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wearable/WearableListenerService$c$8;->b:Lcom/google/android/gms/wearable/WearableListenerService$c;

    iget-object v0, v0, Lcom/google/android/gms/wearable/WearableListenerService$c;->a:Lcom/google/android/gms/wearable/WearableListenerService;

    iget-object v1, p0, Lcom/google/android/gms/wearable/WearableListenerService$c$8;->a:Lcom/google/android/gms/wearable/internal/AmsEntityUpdateParcelable;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/wearable/WearableListenerService;->a(Lcom/google/android/gms/wearable/u;)V

    return-void
.end method